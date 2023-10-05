/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;
import Services.RentalRequest;
import Services.RentalRequestDirectory;
import java.util.ArrayList;

/**
 *
 * @author chilukuri
 */
public class Customer extends Person{
    private static int count = 0;
    //private RentalRequestDirectory rentalRequests;
    
    public Customer()
    {
        
    }

    public Customer(String name) {
        super();
        this.id = "CUS-" + count++;
        this.name = name;
    }
    
    /*public RentalRequestDirectory getRentalRequests() {
        return rentalRequests;
    }

    public void setRentalRequests(RentalRequestDirectory rentalRequests) {
        this.rentalRequests = rentalRequests;
    }*/
    
    
    
    @Override
    public String toString(){
        return this.id;
    }
    
}
