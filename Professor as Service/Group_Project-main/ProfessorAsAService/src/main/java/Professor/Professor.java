/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

import Course.Course;
import Person.Person;
import UserAccount.UserAccount;

/**
 *
 * @author divya
 */
public class Professor extends Person {
  private static int count = 0;  
  String emailId;
  boolean subPaid;
  String Location;
  String language;
  String topic;
  Course course;
  Float rating;
  Float totalRevenue;

  UserAccount userAcc;
  
  public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }
  
  public Float getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(Float totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public UserAccount getUserAcc() {
        return userAcc;
    }

    public void setUserAcc(UserAccount userAcc) {
        this.userAcc = userAcc;
    }

    public Professor () {
        this.userAcc = new UserAccount(); 
        //this.course = new Course();
    }
     public Professor(String profName) {
         super();
         this.id = "PROF-" + count++;
         this.name = profName;
         this.userAcc = new UserAccount();
         this.rating = Float.valueOf("0.0");
    }
     
    public  String getProfId() {
        return id;
    }

    public void setProfId(String profId) {
        this.id = profId;
    }
    
    public  String getProfName() {
        return name;
    }

    public void setProfName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
    

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public boolean getSubPaid() {
        return subPaid;
    }

    public void setSubPaid(boolean subPaid) {
        this.subPaid = subPaid;
    }

   public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
       this.course = course;
    }
  
  
  
  
}
