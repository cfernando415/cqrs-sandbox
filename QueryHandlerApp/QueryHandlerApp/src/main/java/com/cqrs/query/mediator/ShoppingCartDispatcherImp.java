package com.cqrs.query.mediator;

import com.cqrs.query.dto.OrderItem;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ShoppingCartDispatcherImp implements ShoppingCartDispatcher {
    private ShoppingCartQueryHandlerImp shoppingCartHandler;

    // TODO: return ShoppingCartAggregateRoot
    public List<OrderItem> viewCart() {
        return shoppingCartHandler.getOrderItems();
    }
}
