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
                "<br/>Ham: " + order.hamCount() +
                "<br/>Turkey: " + order.turkeyCount() +
                "<br/>Avocado: " + order.avocadoCount() +
                "<br/>" + order.bread() +
                "<br/>" + order.cheese() +
                "<br/>" + order.vegetables() +
                "<br/><b>Sides:</b> ";
        for (Side s : order.sides()) {
            receipt += "<br/>" + s.name() + " " + s.price();
        }
        receipt += "<br/><b>Total:</b> " + order.total();
        return receipt;
    }
    public String getFormattedReceipt() {
        return formattedReceipt;
    }
}
