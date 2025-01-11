package com.example.cart.entity;

import com.example.cart.constant.db.DbConstant.DbCartItem;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = DbCartItem.TABLE_NAME)
public class CartItem extends AuditInfo {

    @Column(name = DbCartItem.QUANTITY, nullable = false)
    private int quantity;

    @Column(name = DbCartItem.UNIT_PRICE, nullable = false)
    private BigDecimal unitPrice;

    @Column(name = DbCartItem.TOTAL_PRICE, nullable = false)
    private BigDecimal totalPrice;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cart_id")
    private Cart cart;

}
