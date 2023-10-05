/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Course;
import Professor.Professor;
/**
 *
 * @author divya
 */
public class Course {
   private static int count = 0;
   String courseId;
   String courseName;
   int credits;
   float price;
   String language;
   String topic;
   Professor professor;
   float reputationIndex;

    public Course() {
        
    }
       public Course(String courseName) {
        this.courseId = "CR-" + count++;
        this.courseName=courseName;
       // this.professor =professor;
    }
    
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
   

    public String getCourseID() {
        return courseId;
    }

    public void setCourseID(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public float getReputationIndex() {
        return reputationIndex;
    }

    public void setReputationIndex(float reputationIndex) {
        this.reputationIndex = reputationIndex;
    }
    
    
   
   
}
