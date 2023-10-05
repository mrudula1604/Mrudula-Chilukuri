/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CertifyingAuthority;

import Student.Student;

/**
 *
 * @author MC
 */
public class TranscriptRequest {
    private static int count = 0;
    String trId;
    Student student;
    
    public String getTrId() {
        return trId;
    }

    public void setTrId(String trId) {
        this.trId = trId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudentId(Student student) {
        this.student = student;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    String status;
    
    public TranscriptRequest(Student student){
        this.trId = "TR-" + count++;
        this.student = student;
        this.status = "requested";
    }
    
}
