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
public class SystemData {

    private static String CurrentUser;
    private static String UserId;
    private static String UserType;

    public static String getCurrentUser() {
        return CurrentUser;
    }

    public static void setCurrentUser(String aCurrentUser) {
        CurrentUser = aCurrentUser;
    }

    public static String getUserId() {
        return UserId;
    }

    public static void setUserId(String aUserId) {
        UserId = aUserId;
    }

    public static String getUserType() {
        return UserType;
    }

    public static void setUserType(String aUserType) {
        UserType = aUserType;
    }

}
