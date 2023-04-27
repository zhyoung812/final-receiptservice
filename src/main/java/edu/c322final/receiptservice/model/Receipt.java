package edu.c322final.receiptservice.model;

import java.util.List;

public class Receipt {
    String formattedReceipt;
    String intro;
    String separator;
    String customerId;
    String orderId;
    String hamCount;
    String turkeyCount;
    String avocadoCount;
    String bread;
    String cheese;
    String vegetables;
    String sides;
    String total;
    public Receipt(Order order) {
        setFormattedReceipt(order);

    }
    public void setFormattedReceipt(Order order) {
        setIntro("Thank you for ordering from our sandwich shop.");
        setSeparator("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        setCustomerId("Customer Id: " + order.customerId());
        setOrderId("Order Id: " + order.id());
    }
    public String getFormattedReceipt() {
        return formattedReceipt;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getHamCount() {
        return hamCount;
    }

    public void setHamCount(String hamCount) {
        this.hamCount = hamCount;
    }

    public String getTurkeyCount() {
        return turkeyCount;
    }

    public void setTurkeyCount(String turkeyCount) {
        this.turkeyCount = turkeyCount;
    }

    public String getAvocadoCount() {
        return avocadoCount;
    }

    public void setAvocadoCount(String avocadoCount) {
        this.avocadoCount = avocadoCount;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public String getSides() {
        return sides;
    }

    public void setSides(String sides) {
        this.sides = sides;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
