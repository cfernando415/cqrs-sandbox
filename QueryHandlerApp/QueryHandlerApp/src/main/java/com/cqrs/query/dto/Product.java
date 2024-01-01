package com.cqrs.query.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class Product {
    private UUID id;
    private String productName;
    private double price;
}
