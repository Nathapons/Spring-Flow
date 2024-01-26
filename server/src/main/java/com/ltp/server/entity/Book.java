package com.ltp.server.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Entity
@Table(name = "app_book", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"title", "isbn"})
})
@RequiredArgsConstructor
@NoArgsConstructor
@Data
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String imageUrl;

    @Column(name = "title", nullable = false)
    @NonNull
    private String title;

    @Column(name = "genre", length = 50)
    private String genre;

    @Column(name = "isbn", length = 50)
    private String isbn;

    @Column(name = "publication_year")
    private int publicationYear;

    @Column(name = "price", precision = 2)
    private double price;
}
