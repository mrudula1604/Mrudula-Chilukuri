/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Role.Role;

/**
 *
 * @author Chilukuri
 */
public class UserAccount {

    private static int count = 0;
    private String accountId;
    private String username;
    private String password;
    private Role role;
    private String personId;

    public UserAccount() {
        this.accountId = "USER-" + count++;
        this.username = username;
        this.password = password;
        this.role = role;        
    }

    public UserAccount(String username, String password, Role role, String personId) {
        this.accountId = "USER-" + count++;
        this.username = username;
        this.password = password;
        this.role = role;
        this.personId = personId;
    }
    
    public UserAccount(String username, String password, Role role) {
        //this.accountId = role + count++;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    /*public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        UserAccount.count = count;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    */
    
    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}    
    

