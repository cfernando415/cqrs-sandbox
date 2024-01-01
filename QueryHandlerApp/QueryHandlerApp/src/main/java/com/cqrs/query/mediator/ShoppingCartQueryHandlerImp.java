package com.cqrs.query.mediator;

import com.cqrs.query.dto.OrderItem;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ShoppingCartQueryHandlerImp extends ShoppingCartBaseQueryHandler {

    @Override
    public List<OrderItem> getOrderItems() {
        return this.shoppingCartDispatcher.viewCart();
    }
}
