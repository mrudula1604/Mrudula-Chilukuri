/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Customer.CustomerDirectory;
import Customer.EmployeeDirectory;
import Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Chilukuri
 */
public class Business {
    BranchDirectory branches;
    //LibraryDirectory libraries;
    UserAccountDirectory topLevelUserAccountDirectory;
    CustomerDirectory customersList;
    EmployeeDirectory employeesList;
    
    public Business() {
        this.branches = new BranchDirectory();
        //this.libraries = new LibraryDirectory();
        this.customersList = new CustomerDirectory();
        this.employeesList = new EmployeeDirectory();
        this.topLevelUserAccountDirectory = new UserAccountDirectory();
        
        // CREATING ADMIN
        this.topLevelUserAccountDirectory.createUserAccount("admin", "admin", new SystemAdminRole());
    }

    public EmployeeDirectory getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(EmployeeDirectory employeesList) {
        this.employeesList = employeesList;
    }

    /*public LibraryDirectory getLibraries() {
        return libraries;
    }

    public void setLibraries(LibraryDirectory libraries) {
        this.libraries = libraries;
    }*/

    public BranchDirectory getBranches() {
        return branches;
    }

    public void setBranches(BranchDirectory branches) {
        this.branches = branches;
    }

    public UserAccountDirectory getTopLevelUserAccountDirectory() {
        return topLevelUserAccountDirectory;
    }

    public void setTopLevelUserAccountDirectory(UserAccountDirectory topLevelUserAccountDirectory) {
        this.topLevelUserAccountDirectory = topLevelUserAccountDirectory;
    }
    
    public CustomerDirectory getCustomersList() {
        return customersList;
    }

    public void setCustomersList(CustomerDirectory customersList) {
        this.customersList = customersList;
    }
    
    public static Business getInstance() {
        return new Business();
    }
}
