package com.example.devangnigam.showBook.Service;

import com.example.devangnigam.showBook.movieEntityClasses.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.devangnigam.showBook.repositories.BookingRepository;

import java.util.List;


@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
    public Booking getBookingById(Long id){
        return bookingRepository.findById(id).orElse(null);
    }

    public Booking addBooking (Booking booking){
        System.out.println("Saving booking: " + booking);
        return bookingRepository.save(booking);
    }
    public void deleteBooking(Long id){
        bookingRepository.deleteById(id);
    }
}