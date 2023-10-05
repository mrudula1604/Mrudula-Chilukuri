/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Role.Role;
import java.util.ArrayList;
import Business.UserAccount;
import Customer.Customer;

/**
 *
 * @author Chilukuri
 */
public class UserAccountDirectory {
 
    ArrayList<UserAccount> useraccountlist;

    public ArrayList<UserAccount> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<UserAccount> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
    
    public UserAccountDirectory() {
        this.useraccountlist = new ArrayList<UserAccount>();
    }
    
     public String[] getAllRoles() {
       return Role.getRoles();
    }
    
    public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.useraccountlist) {
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
     
    public UserAccount createUserAccount(String username, String password, Role role, String personId) {
        UserAccount user = new UserAccount(username, password, role, personId);
        
        useraccountlist.add(user);
        return user;
    }
    
    public boolean checkIfUserExists(String username)
    {
        for(UserAccount u: this.useraccountlist) {
            if(u.getUsername().equals(username)) {
                return true;
            }
        }      
        return false;
    }
    
    public UserAccount createUserAccount(String username, String password, Role role) {
        UserAccount user = new UserAccount(username, password, role);
        
        useraccountlist.add(user);
        return user;
    }
    
    public UserAccount findById(String username) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getUsername().equals(username)) {
                return u;
            }
        }
        
        return null;
    }
    
    public UserAccount getUserAccount(String username, String password, String role) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)) {
                return u;
            }
        }
        
        return null;
    }
    
    public Boolean accountExists(String username, String password, String role) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)) {
                return true;
            }
        }
        
        return false;
    }
    
}
