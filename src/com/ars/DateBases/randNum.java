package com.ars.DateBases;

import java.sql.*;

class randNum{

    private static final String url = "jdbc:mysql://localhost:3306/numbers";
    private static final String user = "admin";
    private static final String password = "admin";

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static void main(String[] args) {
        int num = (int)((Math.random() * (100 - 1) + 1) + 1);
        String query = "INSERT INTO numbers.value (rand) \n" + "VALUES (" + num + ");";

        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            //rs = stmt.executeQuery(query);
            stmt.executeUpdate(query);

            /*while (rs.next()) {
                int count = rs.getInt(1);
                System.out.println(" number in the table \"value\" : " + count);
            }*/

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            //try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }
    }

}