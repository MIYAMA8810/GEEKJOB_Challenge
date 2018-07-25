/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.Serializable;

/**
 *
 * @author guest1Day
 */
public class AdminUserDTO implements Serializable {
    
    // フィールド
    private int userID = 0;
    private String name = "";
    private String password = "";
    
    //setter、getter
    public void setUserID(int id) {
        this.userID = id;
    }
    
    public int getUserID() {
        return this.userID;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return this.password;
    }
}
