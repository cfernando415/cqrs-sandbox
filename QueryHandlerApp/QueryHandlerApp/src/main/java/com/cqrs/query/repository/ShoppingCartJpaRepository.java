package com.cqrs.query.repository;

import com.cqrs.query.model.ShoppingCart;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import java.util.UUID;

public interface ShoppingCartJpaRepository extends ReactiveMongoRepository<ShoppingCart, UUID> {
    
}
