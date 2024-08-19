package com.hsbc.views;

import com.hsbc.models.Role;
import com.hsbc.storage.UserDAL;
import com.hsbc.models.Bug;
import com.hsbc.models.Project;
import com.hsbc.models.User;
import com.hsbc.storage.UserImpli;

import java.util.List;
import java.util.Scanner;

public class DeveloperMain {


    public static void main(String[] args) {
        //testing user Impli addition
        UserDAL userDAL = new UserImpli();
        //should create user
        userDAL.signUpUser(new User("user@gmail.com", "password12345", Role.DEVELOPER));
        //should throw run time execption as the email is a dublicte
        userDAL.signUpUser(new User("user@gmail.com", "password12345", Role.DEVELOPER));

    }

}
