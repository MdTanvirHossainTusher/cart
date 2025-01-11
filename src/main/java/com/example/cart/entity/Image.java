package com.example.cart.entity;

import com.example.cart.constant.db.DbConstant.DbImage;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Blob;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Image extends AuditInfo{

    @Column(name = DbImage.FILE_NAME)
    private String fileName;

    @Column(name = DbImage.FILE_TYPE)
    private String fileType;

    @Column(name = DbImage.DOWNLOAD_URL)
    private String downloadUrl;

    @Lob
    private Blob image;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
