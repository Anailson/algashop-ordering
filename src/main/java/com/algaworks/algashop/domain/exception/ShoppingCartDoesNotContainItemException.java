package com.algaworks.algashop.domain.exception;

import com.algaworks.algashop.domain.valueobject.id.ShoppingCartId;
import com.algaworks.algashop.domain.valueobject.id.ShoppingCartItemId;

public class ShoppingCartDoesNotContainItemException extends DomainException {
    public ShoppingCartDoesNotContainItemException(ShoppingCartId id, ShoppingCartItemId shoppingCartItemId) {
        super(String.format(ErrorMessages.ERROR_SHOPPING_CART_DOES_NOT_CONTAIN_ITEM, id, shoppingCartItemId));
    }
}
