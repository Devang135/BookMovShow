package com.example.devangnigam.showBook.Service;

import com.example.devangnigam.showBook.movieEntityClasses.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.devangnigam.showBook.repositories.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List <Movie> getAllMovies()
    {
        return movieRepository.findAll();
    }
    public Movie getMovieById(Long id){
        return movieRepository.findById(id).orElse(null);
    }
    public Movie addMovie(Movie movie) { return movieRepository.save(movie);
    }
    public void deleteMovie(Long id){
        movieRepository.deleteById(id);
    }

}
