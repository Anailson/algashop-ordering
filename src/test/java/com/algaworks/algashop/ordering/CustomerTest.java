package com.algaworks.algashop.ordering;

import com.algaworks.algashop.domain.entity.Customer;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

public class CustomerTest {

    @Test
    public void testingCustomer() {
        Customer customer = new Customer(
                UUID.randomUUID(),
                "Teste",
                LocalDate.of(1991, 7, 5),
                "teste@gmail.com",
                "255-456-4512",
                "255-08-1547",
                true,
                OffsetDateTime.now()

        );

        customer.addLoayltyPoints(10);

    }

}
