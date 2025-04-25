package com.example.devangnigam.showBook.repositories;

import com.example.devangnigam.showBook.movieEntityClasses.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long> {

}
