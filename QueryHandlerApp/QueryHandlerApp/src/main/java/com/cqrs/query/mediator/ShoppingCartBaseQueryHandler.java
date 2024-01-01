package com.cqrs.query.mediator;

import com.cqrs.query.dto.OrderItem;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
public abstract class ShoppingCartBaseQueryHandler {
    protected ShoppingCartDispatcher shoppingCartDispatcher;
    public abstract List<OrderItem> getOrderItems();
}
