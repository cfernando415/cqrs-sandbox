package com.cqrs.query.dto;

import lombok.Data;

@Data
public class OrderItem {
    private int quantity;
    private Product product;

    public double getTotal() {
        return this.product.getPrice() * this.quantity;
    }
}
