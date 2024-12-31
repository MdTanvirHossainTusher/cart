package com.example.cart.entity;

import com.example.cart.constant.db.DbConstant;
import com.example.cart.constant.db.DbConstant.DbProfile;
import jakarta.persistence.*;
import lombok.*;

import java.io.File;
import java.util.List;

@ToString
@Data
//@Setter
//@Getter
//@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = DbProfile.TABLE_NAME)
public class Profile extends AuditInfo {

    @Column(name = DbConstant.DbProfile.IMAGE_URL)
    private String imageUrl;

    @Column(name = DbConstant.DbProfile.IMAGE_FILE)
    private File image;

    @Column(name = DbProfile.PROFILE_DELETED)
    private boolean deleted = false;

    @OneToOne(
            mappedBy = "profile",
            cascade = CascadeType.ALL
    )
    private User user;
}

