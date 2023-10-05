/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Business.Branch;
import Business.Library;
import Customer.Customer;
import Material.Book;
import java.util.ArrayList;

/**
 *
 * @author Chilukuri
 */
public class RentalRequestDirectory {

    ArrayList<RentalRequest> rentalList;
    
    public RentalRequestDirectory() {
        this.rentalList = new ArrayList<RentalRequest>();
    }

    public ArrayList<RentalRequest> getOrderlist() {
        return rentalList;
    }

    public void setOrderlist(ArrayList<RentalRequest> orderlist) {
        this.rentalList = orderlist;
    }
    
    // create a new order
    public RentalRequest createOrder(Customer customer, Branch branch, String materialId,
            int duration, float price) {
        RentalRequest o = new RentalRequest(customer, branch, materialId, duration, price);
        this.rentalList.add(o);
        
        //RentalRequestDirectory rr = branch.getLibrary().getRentals();
        //rr.getOrderlist().add(o);
        return o;
    }
    
    public RentalRequest findRentalRequest(String orderId)
    {
        for(RentalRequest r: this.rentalList) {
            if(r.getOrderId().equals(orderId)) {
                return r;
            }
        }
        return null;
    }
    
    public void approveRequest(String orderId) {
       RentalRequest currentRR = findRentalRequest(orderId);
       currentRR.setStatus("approved");
    }
    
    public void returnRental(String orderId)
    {
        RentalRequest currentRR = findRentalRequest(orderId);
       currentRR.setStatus("returned");
    }
    
}
