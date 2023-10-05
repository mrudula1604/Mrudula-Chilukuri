/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

import Course.Course;
import Role.StudentRole;
import Student.Student;
import UserAccount.UserAccount;
import java.util.ArrayList;
import Course.CourseDirectory;
import Role.ProfessorRole;

/**
 *
 * @author divya
 */
public class ProfessorDirectory {
  ArrayList<Professor> proflist;
    CourseDirectory coursedir;
    public ProfessorDirectory() {
        this.proflist = new ArrayList<Professor>();
        //this.coursedir = coursedir; 
    } 

  

    public ArrayList<Professor> getProflist() {
        return proflist;
    }

    public void setProflist(ArrayList<Professor> proflist) {
        this.proflist = proflist;
    }
    
      public CourseDirectory getCoursedir() {
        return coursedir;
    }

    public void setCoursedir(CourseDirectory coursedir) {
        this.coursedir = coursedir;
    }
    public Professor createProfessor(String professorName,String email,boolean subPaid,String location,String username, String password)
    {
          Professor p= new Professor(professorName);
          //p.setId(professorId);
          //p.setName(professorName);
          p.setEmailId(email);
          p.setSubPaid(subPaid);
          p.setLocation(location);
          p.setTotalRevenue(Float.parseFloat("0.00"));
         // p.setLanguage(language);
         // p.setTopic(topic);
          
          UserAccount ua = new UserAccount();
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setRole(new ProfessorRole());
        ua.setPersonId(p.getId());
        p.setUserAcc(ua);
          this.proflist.add(p);
         return p;
        
    }
    
        public boolean checkIfProfessorExists(String profId){
            for(Professor p: this.proflist) {
                if(p.getId().equals(profId))
                {
                    return true;
                }
            }
         return false;
        }
            
        
         public Professor findProfessor(String profId)
    {
        for(Professor p: this.proflist) {
            if(p.getProfId().equals(profId)) {
                return p;
            }
        }      
        return null;
    }

   
}
