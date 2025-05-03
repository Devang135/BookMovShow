package com.example.devangnigam.showBook.movieEntityClasses;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Movie movie;
    private int seats =1 ;
    private LocalDateTime bookingTime;
    private String userName;


    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }




}
