package com.algaworks.algashop.domain.entity;


import com.algaworks.algashop.domain.valueobject.id.CustomerId;
import org.junit.jupiter.api.Test;

class OrderTest {

    @Test
    public void shouldGenerate() {
        Order order = Order.draft(new CustomerId());
    }

}