package com.algaworks.algashop.domain.exception;

import com.algaworks.algashop.domain.valueobject.id.ProductId;
import com.algaworks.algashop.domain.valueobject.id.ShoppingCartItemId;

public class ShoppingCartItemIncompatibleProductException extends DomainException{

    public ShoppingCartItemIncompatibleProductException(ShoppingCartItemId id, ProductId productId) {
        super(String.format(ErrorMessages.ERROR_SHOPPING_CART_ITEM_INCOMPATIBLE_PRODUCT, id, productId));
    }
}
