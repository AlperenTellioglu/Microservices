package com.microservices.account_service.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
@Table(value = "accounts")
public class Account implements Serializable {

    @PrimaryKey
    private UUID id = UUID.randomUUID();

    @Column(value = "uname")
    private String username;

    @Column(value = "email")
    private String email;

    @Column(value = "pwd")
    private String password;
    
    @Column(value = "created_at")
    private LocalDateTime createdAt;
    
    @Column(value = "is_active")
    private Boolean active;

    public Account(UUID id) {
        this.id = id;
    }

}
