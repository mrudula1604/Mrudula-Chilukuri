/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import Business.Branch;
import java.util.ArrayList;

/**
 *
 * @author chilukuri
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employees;
    
    public EmployeeDirectory()
    {
        this.employees = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    
    public Employee addEmployee(String name,
            String designation, float experience, Branch branch) {
        Employee emp = new Employee(name, designation, experience, branch);
        this.employees.add(emp);
        return emp;
    }
    
    public Employee addEmployee(String empId, String name,
            String designation, float experience, Branch branch) {
        Employee emp = new Employee(empId, name, designation, experience, branch);
        this.employees.add(emp);
        return emp;
    }
    
    public Employee addEmployee(Employee emp)
    {
        this.employees.add(emp);
        return emp;
    }
    
    public boolean checkIfEmployeeExists(String empId)
    {
        for(Employee e: this.employees) {
            if(e.getPersonID().equals(empId)) {
                return true;
            }
        }      
        return false;
    }
    
    public Employee findEmployee(String empId)
    {
        for(Employee e: this.employees) {
            if(e.getPersonID().equals(empId)) {
                return e;
            }
        }      
        return null;
    }
    
}
