/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import Course.CourseDirectory;
import Person.Person;
import UserAccount.UserAccount;

/**
 *
 * @author divya
 */
public class Student extends Person {
    private static int count = 0;
    String degreeName;
    String email;
    UserAccount userAcc;
    CourseDirectory registeredCourses;

    public UserAccount getUserAcc() {
        return userAcc;
    }

    public void setUserAcc(UserAccount userAcc) {
        this.userAcc = userAcc;
    }
    
    public CourseDirectory getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(CourseDirectory courses) {
        this.registeredCourses = courses;
    }
    
    //String degreeRequirements;

    public Student() {
     this.userAcc = new UserAccount();   
    }

    public Student(String studentName) {
        super();
        this.id = "STU-" + count++;
        this.name=studentName;
        this.userAcc = new UserAccount();
    }

    public  String getStudentId() {
        return id;
    }

    public void setStudentId(String studentId) {
        this.id = studentId;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
}
