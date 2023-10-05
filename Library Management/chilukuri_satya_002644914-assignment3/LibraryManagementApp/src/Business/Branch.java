package Business;

import Business.UserAccountDirectory;
import Services.RentalRequestDirectory;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chilukuri
 */
public class Branch {
    private static int count = 0;
    String branchId;
    String branchName;
    UserAccountDirectory branchuseraccountDirectory;
    Library library;
    
    public Branch(String name, Library library) {
        this.branchName = name;
        this.branchuseraccountDirectory = new UserAccountDirectory();
        this.library = library;
    }
    
    public Branch(String branchId, String name)
    {
        this.branchId = branchId;
        this.branchName = name;
    }
    
    public Branch(String branchName)
    {
        this.branchId = "BRANCH-" + count++;
        this.branchName = branchName;
    }
    
    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String BranchId) {
        this.branchId = BranchId;
    }

    public String getName() {
        return branchName;
    }

    public void setName(String name) {
        this.branchName = name;
    }

    public UserAccountDirectory getBranchuseraccountDirectory() {
        return branchuseraccountDirectory;
    }

    public void setBranchuseraccountDirectory(UserAccountDirectory branchuseraccountDirectory) {
        this.branchuseraccountDirectory = branchuseraccountDirectory;
    }
    
    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
    
    
}
