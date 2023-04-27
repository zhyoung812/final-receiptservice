package edu.c322final.receiptservice.model;

public class ReceiptResponse {
    String response;
    public ReceiptResponse(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
