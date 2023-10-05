/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;


import Course.CourseDirectory;
import Role.StudentRole;
import UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class StudentDirectory {
     ArrayList<Student> studentlist;
    
    public StudentDirectory() {
        this.studentlist = new ArrayList<Student>();
        
    } 

    public ArrayList<Student> getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(ArrayList<Student> studentlist) {
        this.studentlist = studentlist;
    }
    
    
    
    public Student createStudent(String studentName,String degreeName,String email,String username,String password)
    {
        Student student= new Student(studentName);
          
        //student.setStudentId(studentID);
        //student.setName(studentName);
        student.setDegreeName(degreeName);
        student.setEmail(email);
        UserAccount ua = new UserAccount();
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setRole(new StudentRole());
        ua.setPersonId(student.getId());
        student.setUserAcc(ua);
        student.setRegisteredCourses(new CourseDirectory());
        //student.getUseraccount().setUsername(username);
        //student.getUseraccount().setPassword(password);
        
        this.studentlist.add(student);

         return student;
        
    }
    
        public boolean checkIfStudentExists(int studentId ){
            for(Student s: this.studentlist) {
                if(s.getPersonID().equals(studentId))
                {
                    return true;
                }
            }
         return false;
        }
            
        
         public Student findStudent(String studentId)
    {
        for(Student s: this.studentlist) {
            if(s.getPersonID().equals(studentId)) {
                return s;
            }
        }      
        return null;
    }
}