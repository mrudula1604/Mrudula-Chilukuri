/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author chilukuri
 */
public class BranchDirectory {
    
    private ArrayList<Branch> branchesList;
    
    public BranchDirectory()
    {
        this.branchesList = new ArrayList<Branch>();
    }

    public ArrayList<Branch> getBranchesList() {
        return branchesList;
    }

    public void setBranchesList(ArrayList<Branch> branchesList) {
        this.branchesList = branchesList;
    }
    
    public Branch createBranch(String branchName, int libraryBuldingNumber) {
        Branch branch = new Branch(branchName);
        Library lib = new Library(libraryBuldingNumber);
        branch.setLibrary(lib);
        branchesList.add(branch);
        return branch;
    }
    
    public Branch findBranch(String branchId)
    {
        for(Branch b: this.branchesList) {
            if(b.getBranchId().equals(branchId)) {
                return b;
            }
        }      
        return null;
    }
    
    public boolean checkIfBranchExists(String branchName)
    {
        for(Branch b: this.branchesList) {
            if(b.getName().equals(branchName)) {
                return true;
            }
        }
        return false;
    }

    public void removeBranch(String branchId) {
        for(Branch b: this.branchesList) {
            if(b.getBranchId().equals(branchId)) {
                this.branchesList.remove(b);
                break;
            }
        }
    }
    
    
    
}
