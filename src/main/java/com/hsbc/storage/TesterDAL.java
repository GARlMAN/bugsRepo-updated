package com.hsbc.storage;

public interface TesterDAL {


    //raises bug and adds to the bug list with the given project id
    void raiseBug();

    //calls the given bug and updates guru can confirm what is that needed for
    void inspectBug();

    //creates a report
    void createReport();


    
}
