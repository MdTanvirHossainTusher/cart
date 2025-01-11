package com.example.cart.entity;

import com.example.cart.constant.db.DbConstant.DbProduct;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.util.List;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(
        name = DbProduct.TABLE_NAME,
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "unique_product_id",
                        columnNames = {DbProduct.PRODUCT_ID}
                )
        })
public class Product extends AuditInfo {
    @GenericGenerator(
            name = "product-id",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = DbProduct.PRODUCT_ID, nullable = false, updatable = false, unique = true)
    private String productId;

    @Column(name = DbProduct.PRODUCT_NAME)
    private String name;

    @Column(name = DbProduct.PRODUCT_DESCRIPTION)
    private String description;

    @Column(name = DbProduct.PRODUCT_PRICE)
    private BigDecimal price;

    @Column(name = DbProduct.PRODUCT_QUANTITY)
    private int inventory;

    @Column(name = DbProduct.PRODUCT_IMAGE_URL)
    private String imageUrl;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Image> images;

}
