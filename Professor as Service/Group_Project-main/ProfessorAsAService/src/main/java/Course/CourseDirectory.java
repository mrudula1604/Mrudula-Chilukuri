/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Course;

import Professor.Professor;
import Role.StudentRole;
import Student.Student;
import UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class CourseDirectory {
    ArrayList<Course> courseList;
    
     public CourseDirectory() {
        this.courseList = new ArrayList<Course>();
        
    } 

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
    
    public Course AddCourse(Course course)
    {
        this.courseList.add(course);
        return course;
    }
    
    public Course createCourse( 
            String courseName,
            int credits,
            float price,
            String language,
            String topic,
            Professor professor)
    {
        Course course= new Course(courseName);

        course.setCredits(credits);
        course.setPrice(price);
        course.setLanguage(language);
        course.setTopic(topic);
        //course.setReputationIndex(reputationIndex);
        course.setProfessor(professor);
        
        
        this.courseList.add(course);

         return course;
        
    }
       public Course createCourse(String CourseName)
    {
          Course c= new Course(CourseName);
          this.courseList.add(c);
         return c;
        
    }
       public Course findCourse(String courseID)
    {
        for(Course c: this.courseList) {
            if(c.getCourseID().equals(courseID)) {
                return c;
            }
        }      
        return null;
    }
       
    public ArrayList<Course> findCoursesByProfessorName(String profName)
    {
        ArrayList<Course> courses = new ArrayList<Course>();
        for(Course c: this.courseList) {
            if(c.getProfessor().getName().equals(profName)) {
                courses.add(c);
            }
        }      
        return courses;
    }
    
    public ArrayList<Course> findCoursesByLanguage(String lang)
    {
        ArrayList<Course> courses = new ArrayList<Course>();
        for(Course c: this.courseList) {
            if(c.getLanguage().equals(lang)) {
                courses.add(c);
            }
        }      
        return courses;
    }
    
    public ArrayList<Course> findCoursesByTopic(String topic)
    {
        ArrayList<Course> courses = new ArrayList<Course>();
        for(Course c: this.courseList) {
            if(c.getTopic().equals(topic)) {
                courses.add(c);
            }
        }      
        return courses;
    }
    
    public ArrayList<Course> findCoursesByRegion(String region)
    {
        ArrayList<Course> courses = new ArrayList<Course>();
        for(Course c: this.courseList) {
            if(c.getProfessor().getLocation().equals(region)) {
                courses.add(c);
            }
        }      
        return courses;
    }
       
}
