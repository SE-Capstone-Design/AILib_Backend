package com.project.ailib.Domain;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class WishlistBook {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wishlistId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String bookTitle;
    private String author;
    private String publisher;
    private String bookLink;
    private String reason;
    private LocalDate requestDate;
    private String approvalStatus; // Pending, Approved, Rejected
}


