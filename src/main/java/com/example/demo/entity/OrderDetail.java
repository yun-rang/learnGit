package com.example.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @TableName order_detail
 */
@Data
public class OrderDetail implements Serializable {
    private Long id;

    private String name;

    private String image;

    private Long orderId;

    private Long dishId;

    private Long setmealId;

    private String dishFlavor;

    private Integer number;

    private BigDecimal amount;

    private static final long serialVersionUID = 1L;
}