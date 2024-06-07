package com.adepuu.demojdbc.auth.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.Instant;

@Getter
@Setter
@Data
@Table(name = "users")
public class UserAuth {
    @Id
    @Column("id")
    private Long id;

    @Column("hash")
    private String hash;

    @Column("salt")
    private String salt;

    @Column("display_name")
    private String displayName;

    @Column("user_id")
    private long userId;

    @Column("created_at")
    private Instant createdAt;

    @Column("updated_at")
    private Instant updatedAt;

    @Column("deleted_at")
    private Instant deletedAt;
}