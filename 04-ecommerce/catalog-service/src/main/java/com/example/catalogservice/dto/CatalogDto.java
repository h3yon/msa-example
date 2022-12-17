package com.example.catalogservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CatalogDto {
    private String productId;
    private Integer quantity;
    private Integer unitPrice;
    private Integer totalPrice;

    private String orderId;
    private String userId;
}
