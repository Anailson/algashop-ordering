package com.algaworks.algashop.domain.factory;

import com.algaworks.algashop.domain.entity.Order;
import com.algaworks.algashop.domain.entity.PaymentMethod;
import com.algaworks.algashop.domain.valueobject.Billing;
import com.algaworks.algashop.domain.valueobject.Product;
import com.algaworks.algashop.domain.valueobject.Quantity;
import com.algaworks.algashop.domain.valueobject.Shipping;
import com.algaworks.algashop.domain.valueobject.id.CustomerId;

import java.util.Objects;

public class OrderFactory {

    private OrderFactory() {

    }

    public static Order filled(
            CustomerId customerId,
            Shipping shipping,
            Billing billing,
            PaymentMethod paymentMethod,
            Product product,
            Quantity productQuantity
    ) {
        Objects.requireNonNull(customerId);
        Objects.requireNonNull(shipping);
        Objects.requireNonNull(billing);
        Objects.requireNonNull(paymentMethod);
        Objects.requireNonNull(product);
        Objects.requireNonNull(productQuantity);

        Order order = Order.draft(customerId);

        order.changeBilling(billing);
        order.changeShipping(shipping);
        order.changePaymentMethod(paymentMethod);
        order.addItem(product, productQuantity);

        return order;
    }
}
