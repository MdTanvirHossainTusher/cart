package com.example.cart.entity;

import com.example.cart.constant.db.DbConstant.DbOrderItem;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = DbOrderItem.TABLE_NAME)
public class OrderItem extends AuditInfo {

    @Column(name = DbOrderItem.ITEM_QUANTITY, nullable = false)
    private int quantity;

    @Column(name = DbOrderItem.ITEM_PRICE, nullable = false)
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
