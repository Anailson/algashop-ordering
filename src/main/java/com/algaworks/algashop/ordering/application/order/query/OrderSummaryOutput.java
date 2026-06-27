package com.algaworks.algashop.ordering.application.order.query;


import com.algaworks.algashop.ordering.domain.model.order.OrderId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderSummaryOutput {

    private String id;
    private CustomerMinimalOutput customer;
    private Integer totalItems;
    private BigDecimal totalAmount;
    private OffsetDateTime placedAt;
    private OffsetDateTime paidAt;
    private OffsetDateTime canceledAt;
    private OffsetDateTime readyAt;
    private String status;
    private String paymentMethod;

    public OrderSummaryOutput(Long id, CustomerMinimalOutput customer, Integer totalItems,
                              BigDecimal totalAmount, OffsetDateTime placedAt, OffsetDateTime paidAt,
                              OffsetDateTime canceledAt, OffsetDateTime readyAt,
                              String status, String paymentMethod) {
        this.id = new OrderId(id).toString();
        this.customer = customer;
        this.totalItems = totalItems;
        this.totalAmount = totalAmount;
        this.placedAt = placedAt;
        this.paidAt = paidAt;
        this.canceledAt = canceledAt;
        this.readyAt = readyAt;
        this.status = status;
        this.paymentMethod = paymentMethod;
    }


    public OrderSummaryOutput(OffsetDateTime canceledAt, Integer totalItems, CustomerMinimalOutput customer, Long id,
                              OffsetDateTime paidAt, String paymentMethod, OffsetDateTime placedAt, OffsetDateTime readyAt, String status, BigDecimal totalAmount) {
        this.canceledAt = canceledAt;
        this.totalItems = totalItems;
        this.customer = customer;
        this.id = new  OrderId(id).toString();
        this.paidAt = paidAt;
        this.paymentMethod = paymentMethod;
        this.placedAt = placedAt;
        this.readyAt = readyAt;
        this.status = status;
        this.totalAmount = totalAmount;
    }
}
