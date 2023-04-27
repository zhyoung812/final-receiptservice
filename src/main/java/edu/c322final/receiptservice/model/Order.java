package edu.c322final.receiptservice.model;

import java.util.List;

public record Order(int id,
                    int customerId,
                    int turkeyCount,
                    int hamCount,
                    int avocadoCount,
                    double total,
                    String vegetables,
                    String cheese,
                    String bread,
                    List<Side> sides) {}
