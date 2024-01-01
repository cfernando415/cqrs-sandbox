package com.cqrs.query.mediator;

import com.cqrs.query.dto.OrderItem;

import java.util.List;

public interface ShoppingCartDispatcher {
    List<OrderItem> viewCart();
}
