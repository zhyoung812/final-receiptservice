package edu.c322final.receiptservice.controller;

import edu.c322final.receiptservice.model.Order;
import edu.c322final.receiptservice.model.Receipt;
import edu.c322final.receiptservice.model.ReceiptResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/receipts")
public class ReceiptController {
    private final WebClient orderService;
    public ReceiptController(WebClient.Builder webClientBuilder) {
        this.orderService = webClientBuilder.baseUrl("http://localhost:8090").build();
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/{id}")
    public String findByOrderId(@PathVariable int id) {
        Order order =  orderService.get().uri("/orders/{id}", id)
        .retrieve()
        .bodyToMono(Order.class).block();
        assert order != null;
        Receipt receipt = new Receipt(order);
        ReceiptResponse receiptResponse = new ReceiptResponse(receipt.getFormattedReceipt());
        return receiptResponse.getResponse();
    }
}
