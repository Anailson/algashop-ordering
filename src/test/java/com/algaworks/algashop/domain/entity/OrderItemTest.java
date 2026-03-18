package com.algaworks.algashop.domain.entity;


import com.algaworks.algashop.domain.valueobject.Money;
import com.algaworks.algashop.domain.valueobject.ProductName;
import com.algaworks.algashop.domain.valueobject.Quantity;
import com.algaworks.algashop.domain.valueobject.id.OrderId;
import com.algaworks.algashop.domain.valueobject.id.ProductId;
import org.junit.jupiter.api.Test;

class OrderItemTest {


    @Test
    public void shouldGenerate() {
        OrderItem.brandNew()
                .product(ProductTestDataBuilder.aProduct().build())
                .quantity(new Quantity(1))
                .orderId(new OrderId())
                .build();
    }

}