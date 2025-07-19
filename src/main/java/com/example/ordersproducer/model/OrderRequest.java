package com.example.ordersproducer.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderRequest {
    private Integer orderId;
    private Integer customerId;
    private List<Integer> productIds;
}
