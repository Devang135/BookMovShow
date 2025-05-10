package com.example.devangnigam.showBook.movieEntityClasses;

import com.example.devangnigam.showBook.enums.Gender;
import jakarta.persistence.*;

import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="USERS")
@Entity
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    public String name;

    public String age;

    public String address;

    @Enumerated(value = EnumType.STRING)
    public Gender gender;

    public String mobileNo;

    @Column(unique = true)
    private String email;

    private String password;

    private String roles;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Ticket> ticketList = new ArrayList<>();

}

