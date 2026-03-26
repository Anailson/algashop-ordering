package com.algaworks.algashop.domain.model.exception;

import com.algaworks.algashop.domain.model.valueobject.id.ProductId;

public class ProductOutOfStockException extends RuntimeException {
    public ProductOutOfStockException(ProductId id) {
        super(String.format(ErrorMessages.ERROR_PRODUCT_IS_OUT_OF_STOCK, id));
    }
}
