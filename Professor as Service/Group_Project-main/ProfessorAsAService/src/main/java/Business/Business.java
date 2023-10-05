/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import CertifyingAuthority.TranscriptRequestDirectory;
import Course.CourseDirectory;
import Professor.ProfessorDirectory;
import Role.CertifyingAuthorityRole;
import Role.SystemAdminRole;
import Student.StudentDirectory;
import UserAccount.UserAccountDirectory;

/**
 *
 * @author divya
 */
public class Business {
   UserAccountDirectory topLevelUserAccountDirectory;
   StudentDirectory studentDir;
   ProfessorDirectory profDir;
   CourseDirectory courseDir;
   TranscriptRequestDirectory transcriptRequests;


    public Business() {
        this.topLevelUserAccountDirectory = new UserAccountDirectory();
        this.studentDir= new StudentDirectory();
        this.profDir = new ProfessorDirectory();
        this.courseDir = new CourseDirectory();
        this.transcriptRequests = new TranscriptRequestDirectory();
        this.topLevelUserAccountDirectory.createUserAccount("admin", "admin", new SystemAdminRole());
        this.topLevelUserAccountDirectory.createUserAccount("ca", "ca", new CertifyingAuthorityRole());
    }
    
    public TranscriptRequestDirectory getTranscriptRequests() {
        return transcriptRequests;
    }

    public void setTranscriptRequests(TranscriptRequestDirectory transcriptRequests) {
        this.transcriptRequests = transcriptRequests;
    }

    public UserAccountDirectory getTopLevelUserAccountDirectory() {
        return topLevelUserAccountDirectory;
    }

    public void setTopLevelUserAccountDirectory(UserAccountDirectory topLevelUserAccountDirectory) {
        this.topLevelUserAccountDirectory = topLevelUserAccountDirectory;
    }

    public StudentDirectory getStudentDir() {
        return studentDir;
    }

    public void setStudentDir(StudentDirectory studentDir) {
        this.studentDir = studentDir;
    }

    public ProfessorDirectory getProfDir() {
        return profDir;
    }

    public void setProfDir(ProfessorDirectory profDir) {
        this.profDir = profDir;
    }

    public CourseDirectory getCourseDir() {
        return courseDir;
    }

    public void setCourseDir(CourseDirectory courseDir) {
        this.courseDir = courseDir;
    }
    
    
     public static Business getInstance() {
        return new Business();
    }
   
}
