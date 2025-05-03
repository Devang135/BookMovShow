package com.example.devangnigam.showBook.repositories;

import com.example.devangnigam.showBook.movieEntityClasses.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
        User findByUsername(String username);
}
