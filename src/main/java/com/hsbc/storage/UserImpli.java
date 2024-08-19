package com.hsbc.storage;

import com.hsbc.models.User;


//import these classes if there's an error
import java.util.ResourceBundle;
import java.sql.*;
import com.hsbc.helpers.MySQLHelper;
import java.sql.*;

//these are general functions to all people
public class UserImpli implements UserDAL{

    //  private static Connection connection;
    private static ResourceBundle resourceBundle;
    private PreparedStatement preparedStatement;

    //constructor getting resoruce bundle instance
    public UserImpli()  {
        //connection= MySQLHelper.getConnection();
        resourceBundle=ResourceBundle.getBundle("db");
    }



    //adding user sign up is directly adding to use data base
    @Override
    public void signUpUser(User user) {
        String query=resourceBundle.getString("addUser");    //getting query from property
        int rows = 0;  //rows to throw execption if user already exist

        //self close try catch block
        try(Connection connection=MySQLHelper.getConnection()) {
            //adding values to prepared statement to send to the table
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getRole().name());
            //execute query
            rows= preparedStatement.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e); //need to customn exeptions
        }

        if(rows>0)
            System.out.println("User added successfully");

    }


    //login is retreving object from user and returning the user which is used in all other dals
    @Override
    public User loginUser(String email, String password) {
        return null;
    }



    //adds signed up people into the database



}
