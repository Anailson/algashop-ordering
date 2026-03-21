package com.algaworks.algashop.domain.exception;

import com.algaworks.algashop.domain.valueobject.id.ProductId;

public class ProductOutOfStockException extends RuntimeException {
    public ProductOutOfStockException(ProductId id) {
        super(String.format(ErrorMessages.ERROR_PRODUCT_IS_OUT_OF_STOCK, id));
    }
}
