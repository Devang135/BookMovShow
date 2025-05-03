package com.example.devangnigam.showBook.Service;

import com.example.devangnigam.showBook.movieEntityClasses.User;
import com.example.devangnigam.showBook.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public User findByUsername(String user){
        return userRepository.findByUsername(user);
    }


}
