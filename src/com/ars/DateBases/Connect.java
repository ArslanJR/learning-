/*package com.ars.DateBases;

import java.sql.*;

public class Connect{
  public static void main(String[] args){

    Connection connect = null;

    try{
      Class.forName("com.MySQL.jdbc.Driver").newInstance();
      String userName = "admin";
      String password = "admin";
      String url = "jdbc:MySQL://localhost/numbers";
      connect = DriverManager.getConnection(url, userName, password);
      System.out.println("DataBase connection established");
    }
    catch(Exception ex){
      System.err.println("Cannot connect to database server");
      ex.printStackTrace();
    }
    finally{
      if(connect != null){
        try {
          System.out.println("Let terminate the Connection");
          connect.close();
          System.out.println("Database connection terminated");
        }
        catch (Exception ex){
          System.out.println("Error in connection termination");
        }
      }
    }

  }
}
*/