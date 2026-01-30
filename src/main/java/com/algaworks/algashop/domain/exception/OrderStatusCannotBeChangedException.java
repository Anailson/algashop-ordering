package com.algaworks.algashop.domain.exception;

import com.algaworks.algashop.domain.entity.OrderStatus;
import com.algaworks.algashop.domain.valueobject.id.OrderId;

import static com.algaworks.algashop.domain.exception.ErrorMessages.ERROR_ORDER_STATUS_CANNOT_BE_CHANGED;

public class OrderStatusCannotBeChangedException extends DomainException {

    public OrderStatusCannotBeChangedException(OrderId id, OrderStatus status, OrderStatus newStatus) {
        super(String.format(ERROR_ORDER_STATUS_CANNOT_BE_CHANGED, id, status, newStatus));
    }
}
