package com.example.devangnigam.showBook.repositories;



import com.example.devangnigam.showBook.movieEntityClasses.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}

