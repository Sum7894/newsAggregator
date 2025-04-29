package com.example.newsAggregator.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column
    private String userName;

    @Column
    private String password;

    @Column
    private boolean isEnabled;

    public User(Long userId, String password, String userName, boolean isEnabled) {
        this.userId = userId;
        this.password = password;
        this.userName = userName;
        this.isEnabled = isEnabled;
    }
}
