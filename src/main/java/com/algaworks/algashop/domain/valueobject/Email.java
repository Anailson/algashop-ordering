package com.algaworks.algashop.domain.valueobject;

import com.algaworks.algashop.domain.validator.FieldValidations;

public record Email(String value) {
    public Email {
        FieldValidations.requiresValidEmail(value);
    }

    @Override
    public String toString() {
        return value;
    }
}