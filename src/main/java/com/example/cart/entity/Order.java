package com.example.cart.entity;

import com.example.cart.constant.db.DbConstant.DbOrder;
import com.example.cart.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = DbOrder.TABLE_NAME)
public class Order extends AuditInfo {

    @Column(name = DbOrder.ORDER_DATE, nullable = false)
    private LocalDate orderDate;

    @Column(name = DbOrder.TOTAL_AMOUNT, nullable = false)
    private BigDecimal totalAmount;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<OrderItem> orderItems = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
