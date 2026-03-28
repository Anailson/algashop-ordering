package com.algaworks.algashop.ordering.domain.model.exception;

import com.algaworks.algashop.ordering.domain.model.entity.OrderStatus;
import com.algaworks.algashop.ordering.domain.model.valueobject.id.OrderId;

public class OrderCannotBeEditeException extends DomainException {

  //  Esta exceção será utilizada para sinalizar tentativas inválidas de alteração no pedido.
    public OrderCannotBeEditeException(OrderId orderId, OrderStatus status) {
        super(String.format(
                ErrorMessages.ERROR_ORDER_CANNOT_BE_EDITED,
                orderId.value(),
                status
        ));
    }


}
