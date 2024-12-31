package com.example.cart.entity;

import com.example.cart.constant.db.DbConstant.DbCommon;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AuditInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DbCommon.ID)
    private Long id;

    @CreationTimestamp
    @Column(name = DbCommon.CREATED_AT, nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = DbCommon.LAST_UPDATED_AT, nullable = false)
    private LocalDateTime lastUpdatedAt;

    @CreatedBy
    @Column(name = DbCommon.CREATED_BY, nullable = false, updatable = false)
    private String createBy;

    @LastModifiedBy
    @Column(name = DbCommon.LAST_UPDATED_BY, nullable = false)
    private String lastUpdatedBy;

    @PrePersist
    public void prePersist() {
        if (createdAt == null) {
            createdAt = LocalDateTime.now(ZoneOffset.UTC);
        }
        if (lastUpdatedAt == null) {
            lastUpdatedAt = LocalDateTime.now(ZoneOffset.UTC);
        }
    }

    @PreUpdate
    public void preUpdate() {
        lastUpdatedAt = LocalDateTime.now(ZoneOffset.UTC);
    }
}