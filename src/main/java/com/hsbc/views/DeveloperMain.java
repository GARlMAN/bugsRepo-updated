package com.hsbc.views;

import com.hsbc.Exception.InvalidCredentialsException;
import com.hsbc.models.Role;
import com.hsbc.storage.UserDAL;
import com.hsbc.models.Bug;
import com.hsbc.models.Project;
import com.hsbc.models.User;
import com.hsbc.storage.UserImpli;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class DeveloperMain {


    public static void main(String[] args) {
        //testing user Impli addition
        //creating user
        UserDAL userDAL = null;
        try{
            userDAL = new UserImpli();
            //should create user
            userDAL.signUpUser(new User("user@gmail.comm", "password12345", Role.Developer));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


        //loging user
        try {
            userDAL.loginUser("user@gmail.comm", "password12345");
        }catch (RuntimeException  e) {
            System.out.println(e.getMessage());
        }





    }

}
