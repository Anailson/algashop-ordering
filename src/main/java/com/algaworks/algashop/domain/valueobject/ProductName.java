package com.algaworks.algashop.domain.valueobject;

import com.algaworks.algashop.domain.validator.FieldValidations;

public record ProductName(String value) {

    public ProductName{
        FieldValidations.requiresNonBlank(value);
    }

    @Override
    public String toString() {
       return value;
    }
}
