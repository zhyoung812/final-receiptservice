package edu.c322final.receiptservice.model;

import java.util.List;

public class Receipt {
    String formattedReceipt;
    public Receipt(Order order) {
        this.formattedReceipt = setFormattedReceipt(order);

    }
    public String setFormattedReceipt(Order order) {
        String receipt = "Thank you for ordering from our sandwich shop." +
                "<br/>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                "<br/><b>Customer Id:</b> " + order.customerId() +
                "<br/><b>Order Id:</b> " + order.id() +
                "<br/><b>Sandwich:</b> " +
                "<br/>&emsp;Ham: " + order.hamCount() +
                "<br/>&emsp;Turkey: " + order.turkeyCount() +
                "<br/>&emsp;Avocado: " + order.avocadoCount() +
                "<br/>&emsp;" + order.bread() +
                "<br/>&emsp;" + order.cheese() +
                "<br/>&emsp;" + order.vegetables() +
                "<br/><b>Sides:</b> ";
        for (Side s : order.sides()) {
            receipt += "<br/>&emsp;" + s.name() + " " + s.price();
        }
        receipt += "<br/><b>Total:</b> " + order.total();
        return receipt;
    }
    public String getFormattedReceipt() {
        return formattedReceipt;
    }
}
