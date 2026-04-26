package com.algaworks.algashop.ordering.domain.model.order;

import com.algaworks.algashop.ordering.domain.model.DomainException;
import com.algaworks.algashop.ordering.domain.model.ErrorMessages;

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
