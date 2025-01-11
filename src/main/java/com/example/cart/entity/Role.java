package com.example.cart.entity;

import com.example.cart.constant.db.DbConstant.DbRole;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(
        name = DbRole.TABLE_NAME,
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "unique_user_role",
                        columnNames = {DbRole.ROLE}
                )
        })
public class Role extends AuditInfo {

    @Column(name = DbRole.ROLE)
    private String role;

    @ManyToMany(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE,
                    CascadeType.DETACH,
                    CascadeType.REFRESH
            },
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> users;

}

