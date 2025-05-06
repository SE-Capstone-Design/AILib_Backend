package com.project.ailib.Domain;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class ReturnBook {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long returnId;

    @OneToOne
    @JoinColumn(name = "lending_id")
    private Lending lending;

    private LocalDate returnDate;
}
