/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Customer.Employee;
import Customer.EmployeeDirectory;
import java.util.ArrayList;

/**
 *
 * @author chilukuri
 */
public class LibraryDirectory {
    
    private ArrayList<Library> libraryList;

    public LibraryDirectory(ArrayList<Library> libraryList) {
        this.libraryList = libraryList;
    }
    
    public LibraryDirectory()
    {
        this.libraryList = new ArrayList<Library>();
    }
    
    public ArrayList<Library> getLibraryList() {
        return this.libraryList;
    }

    public void setLibraryList(ArrayList<Library> libraryList) {
        this.libraryList = libraryList;
    }
    
    public Library createLibrary(int buildingNumber)
    {
        Library library = new Library(buildingNumber);
        this.libraryList.add(library);
        return library;
    }
    
    public boolean checkIfLibraryExists(int buildingNumber)
    {
        for(Library l: this.libraryList) {
            if(buildingNumber == l.getBuildingNumber()) {
                return true;
            }
        }
        return false;
    }
    
    public Library findLibrary(int buildingNumber) {
        for(Library l: this.libraryList) {
            if(l.getBuildingNumber() == buildingNumber) {
                return l;
            }
        }
        return null;
    }
    
    public boolean checkIfEmployeeIsAlreadyAssigned(int buildingNumber, String empId, String designation)
    {
        for(Library e: this.libraryList) {
            if(e.getBuildingNumber() == buildingNumber) {
                ArrayList<Employee> emps = e.getEmployees().getEmployees();
                for(Employee emp : emps)
                {
                    if (emp.getPersonID().equals(empId) && emp.getDesignation().equals(designation))
                    {
                        return false;
                    }
                }
            }
        }      
        return true;
    }
    
    public void addEmployee(int buildingNumber, Employee emp) {
        for(Library l: this.libraryList) {
            if(l.getBuildingNumber() == buildingNumber) {
                EmployeeDirectory empDir = l.getEmployees();
                empDir.addEmployee(emp);
                l.setEmployees(empDir);
            }
        }
    }
}
