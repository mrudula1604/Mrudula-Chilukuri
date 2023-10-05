/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import Business.UserAccount;

/**
 *
 * @author Chilukuri
 */
public class Person {
    String id;
    String name;
    UserAccount userAccount;
    
    public Person() {
        
    }
    
    public Person(String personID, String name, String age) {
        this.id = personID;
        this.name = name;
    }
    
    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public String getPersonID() {
        return id;
    }

    public void setPersonID(String personID) {
        this.id = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
        
    @Override
    public String toString() {
        return this.id;
    }
    
}
