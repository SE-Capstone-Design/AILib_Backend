package com.project.ailib.Domain;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Lending {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lendingId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    private LocalDate borrowDate;
    private LocalDate dueDate;

    @OneToOne(mappedBy = "lending", cascade = CascadeType.ALL)
    private ReturnBook returnData;
}

