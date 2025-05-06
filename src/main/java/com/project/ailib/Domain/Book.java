package com.project.ailib.Domain;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private String callNumber;
    private String description;
    private String imageUrl;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<Lending> lendings;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<Reservation> reservations;
}
