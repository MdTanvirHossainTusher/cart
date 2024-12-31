package com.example.cart.entity;

import com.example.cart.constant.db.DbConstant.DbProduct;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@ToString
@Data
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
    private double price;

    @Column(name = DbProduct.PRODUCT_QUANTITY)
    private int quantity;

    @Column(name = DbProduct.PRODUCT_CATEGORY)
    private String category;

    @Column(name = DbProduct.PRODUCT_IMAGE_URL)
    private String imageUrl;

    @Column(name = DbProduct.PRODUCT_DELETED)
    private boolean deleted = false;

    @Lob
    private byte[] file;

}
