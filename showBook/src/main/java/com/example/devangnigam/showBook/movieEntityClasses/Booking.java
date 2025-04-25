package com.example.devangnigam.showBook.movieEntityClasses;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Movie movie;
    private int seats;
    private LocalDateTime bookingTime;



}
