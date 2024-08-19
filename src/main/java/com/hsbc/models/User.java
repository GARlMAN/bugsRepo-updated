package com.hsbc.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

//importing values from lombok
@Data
@NoArgsConstructor
public class User {

    //username and
    private int userId; //user di is increment type
    private String email; //email willl be unique
    private String password; //taken by user
    private Role role; //3 roles


    //custom contructor as we only need 3 values as userId is specified automatically
    public User(String email, String password, Role role) {
        this.password = password;
        this.email = email;
        this.role = role;

    }
}
