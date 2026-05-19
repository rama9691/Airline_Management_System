/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlinemanagement;

import java.sql.Statement;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;




public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/airlinemanagementsystem",
                "root",
                "RV@9691Patil"
            );

            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
