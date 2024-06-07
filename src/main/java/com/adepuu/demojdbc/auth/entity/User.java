package com.adepuu.demojdbc.auth.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@Data
@Table(name = "users")
public class User {
    @Id
    @Column("id")
    private Long id;

    @Column("username")
    private String username;

    @Column("email")
    private String email;

    @Column("display_name")
    private String displayName;

    @Column("avatar")
    private String avatar;

    @Column("quotes")
    private String quotes;

    @Column("created_at")
    private Instant createdAt;

    @Column("updated_at")
    private Instant updatedAt;

    @Column("deleted_at")
    private Instant deletedAt;

    @Transient
    List<UserAuth> userAuth;
}