package edu.c322final.receiptservice.model;

import java.util.List;

public class Receipt {
    String formattedReceipt;
    public Receipt(int orderId, ConcreteSandwich sandwich, List<Side> sides, double total) {
        this.formattedReceipt = setFormattedReceipt(orderId, sandwich, sides, total);

    }
    public String setFormattedReceipt(int orderId, ConcreteSandwich sandwich, List<Side> sides, double total) {
        String receipt = "Thank you for ordering from our sandwich shop." +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                "\nOrder Id: " + orderId +
                "\nSandwich: " + sandwich.price() +
                "\n\t" + sandwich.bread() +
                "\n\t" + sandwich.cheese() +
                "\n\t" + sandwich.veggies() +
                "\nSides: ";
        for (Side s : sides) {
            receipt += "\n\t" + s.name() + " " + s.price();
        }
        receipt += "\nTotal: " + total;
        return receipt;
    }
    public String getFormattedReceipt() {
        return formattedReceipt;
    }
}
