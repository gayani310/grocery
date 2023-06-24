/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grocery.db.comman;

/**
 *
 * @author Gayani
 */
public class SystemConfigData {
    
    private static String username;
    private static String usertype;
    private static String empid;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String aUsername) {
        username = aUsername;
    }

    public static String getUsertype() {
        return usertype;
    }

    public static void setUsertype(String aUsertype) {
        usertype = aUsertype;
    }

    public static String getEmpid() {
        return empid;
    }

    public static void setEmpid(String aEmpid) {
        empid = aEmpid;
    }
    
}
