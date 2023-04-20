package edu.c322final.receiptservice.controller;

import edu.c322final.receiptservice.model.Order;
import edu.c322final.receiptservice.model.Receipt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/receipts")
public class ReceiptController {
    private final WebClient orderService;
    public ReceiptController(WebClient.Builder webClientBuilder) {
        this.orderService = webClientBuilder.baseUrl("http://localhost:8091").build();
    }
    @GetMapping("/{orderId}")
    public String findByOrderId(@PathVariable int id) {
        Order order =  orderService.get().uri("/orders/{id}", id)
        .retrieve()
        .bodyToMono(Order.class).block();
        assert order != null;
        Receipt receipt = new Receipt(order.id(), order.sandwich(), order.sides(), order.total());
        return receipt.getFormattedReceipt();
    }
}
