package com.algaworks.algashop.domain.exception;

import com.algaworks.algashop.domain.valueobject.id.OrderId;
import com.algaworks.algashop.domain.valueobject.id.OrderItemId;

public class OrderDoesNotContainOrderItemException extends DomainException{
    public OrderDoesNotContainOrderItemException(OrderId id, OrderItemId orderItem) {
        super(String.format(ErrorMessages.ERROR_ORDER_DOES_NOT_CONTAIN_ITEM, id, orderItem));
    }
}
