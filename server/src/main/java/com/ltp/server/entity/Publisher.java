package com.ltp.server.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name = "app_publisher")
@RequiredArgsConstructor
@NoArgsConstructor
@Data
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "publisher_name", nullable = false, unique = true)
    @NonNull
    private String publisherName;

    @Column(name = "address", nullable = false)
    @NonNull
    private String address;

    @Column(name = "contact_number")
    private String contactNumber;
}
