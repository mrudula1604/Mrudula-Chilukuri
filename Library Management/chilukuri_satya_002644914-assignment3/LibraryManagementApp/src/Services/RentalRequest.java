/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Business.Branch;
import Business.Library;
import Customer.Customer;

/**
 *
 * @author Chilukuri
 */
public class RentalRequest {
    
    Customer customer;
    Branch branch;
    private static int count = 0;
    String materialId;
    int duration;
    float price;
    String orderId;
    String status;
    
    public RentalRequest(Customer customer, Branch branch, String materialId,
            int duration, float price) {
        this.customer = customer;
        this.branch = branch;
        this.status = "requested";
        this.materialId = materialId;
        this.duration = duration;
        this.price = price;
        this.count++;
        
        this.orderId = "REQ-"+this.count;
    }

    RentalRequest() {
       
    }
    
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
       return this.orderId;
    }    
    
}
