package edu.c322final.receiptservice.model;

import java.util.List;

public class Receipt {
    String formattedReceipt;
    public Receipt(Order order) {
        this.formattedReceipt = setFormattedReceipt(order);

    }
    public String setFormattedReceipt(Order order) {
        String receipt = "Thank you for ordering from our sandwich shop." +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                "\nCustomer Id: " + order.customerId() +
                "\nOrder Id: " + order.id() +
                "\nSandwich: " +
                "\n\tHam: " + order.hamCount() +
                "\n\tTurkey: " + order.turkeyCount() +
                "\n\tAvocado: " + order.avocadoCount() +
                "\n\t" + order.bread() +
                "\n\t" + order.cheese()+
                "\n\t" + order.vegetables() +
                "\nSides: ";
        for (Side s : order.sides()) {
            receipt += "\n\t" + s.name() + " " + s.price();
        }
        receipt += "\nTotal: " + order.total();
        return receipt;
    }
    public String getFormattedReceipt() {
        return formattedReceipt;
    }
}
