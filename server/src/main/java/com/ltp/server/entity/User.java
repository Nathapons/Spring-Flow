package com.ltp.server.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Entity
@Table(name = "app_user")
@RequiredArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name", length = 50, nullable = false)
    @NonNull
    private String firstName;

    @Column(name = "last_name", length = 50, nullable = false)
    @NonNull
    private String lastName;

    @Column(name = "email", length = 100, nullable = false)
    @NonNull
    private String email;

    @Column(name = "username", length = 50)
    @NonNull
    private String username;

    @Column(name = "password")
    @NonNull
    private String password;

    @Column(name = "is_active")
    private Boolean isActive;
}
