/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo_jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samiz
 */
public class connectionJbdc {
    
    
    public static Connection getConnection() throws SQLException{
        
        String dbString = "com.msql.jbdc.Driver";
        final String url = "jbdc:mysql://localhost:3306/jdb";
        final String user = "root";
        final String password = "";
        
        try {
            Class.forName(dbString);
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(connectionJbdc.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
        
    }
    
    public static void main(String[] args) throws SQLException{
        connectionJbdc myConn = new connectionJbdc();
        
        if(myConn.getConnection() != null){
            System.err.println("Ok");
        }
        else System.out.println("None");
    }
}
