/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grocery.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gayani
 */
public class DB {
     private static Connection connection;
    
    private static void init_DB()throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/grocery", "root", "123");
        }
    
    public static void push(String sql)throws Exception{
        if (connection == null){
            init_DB();
           
         }
        connection.createStatement().executeUpdate(sql);   
    
    }
    
    public static ResultSet search(String sql)throws Exception{
        if (connection == null){
            init_DB();
            
        }
        return connection.createStatement().executeQuery(sql);  
    }
    public static Connection getDBConnection()throws Exception{
        if (connection == null){
            init_DB();
        }
        return connection;
    }
    
}

    

