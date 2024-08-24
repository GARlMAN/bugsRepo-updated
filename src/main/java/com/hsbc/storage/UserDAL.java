package com.hsbc.storage;

import com.hsbc.Exception.InvalidCredentialsException;
import com.hsbc.models.Bug;
import com.hsbc.models.Project;
import com.hsbc.models.User;

import java.util.List;

public interface UserDAL {
    // User operations
    //sign up user is bascially adding the given user to the database
    void signUpUser(User user);

    //login in user using the giving credentails
    User loginUser(String email, String password)  throws InvalidCredentialsException; //returns user which is used in other dals
}
