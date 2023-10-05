/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import Business.Branch;

/**
 *
 * @author chilukuri
 */
public class Employee extends Person {
    private static int count = 0;
    private Branch branch;
    private String designation;
    private float yearsOfExperience;

    public Employee(String name, String designation, float experience, Branch branch) {
        super();
        this.id = "EMP-" + count++;
        this.name = name;
        this.designation = designation;
        this.yearsOfExperience = experience;
        this.branch = branch;
    }
    
    public Employee(String empId, String name, String designation, float experience, Branch branch) {
        super();
        this.id = empId;
        this.name = name;
        this.designation = designation;
        this.yearsOfExperience = experience;
        this.branch = branch;
    }
    
    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(float yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    
    @Override
    public String toString(){
        return this.id;
    }    
}
