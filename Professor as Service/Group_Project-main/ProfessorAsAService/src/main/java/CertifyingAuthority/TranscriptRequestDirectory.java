/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CertifyingAuthority;

import Student.Student;
import java.util.ArrayList;

/**
 *
 * @author MC
 */
public class TranscriptRequestDirectory {
    ArrayList<TranscriptRequest> transcriptRequests;

    public ArrayList<TranscriptRequest> getTranscriptRequests() {
        return transcriptRequests;
    }

    public void setTranscriptRequests(ArrayList<TranscriptRequest> transcriptRequests) {
        this.transcriptRequests = transcriptRequests;
    }
    
    public TranscriptRequestDirectory()
    {
        this.transcriptRequests = new ArrayList<TranscriptRequest>();
    }
    
    public TranscriptRequest createTranscript(Student student)
    {
        var transcriptRequest = new TranscriptRequest(student);
        this.transcriptRequests.add(transcriptRequest);
        return transcriptRequest;
    }
    
    public TranscriptRequest findTranscriptRequest(String transcriptId)
    {
        for(TranscriptRequest b: this.transcriptRequests) {
            if(b.getTrId().equals(transcriptId)) {
                return b;
            }
        }      
        return null;
    }
    
    public boolean isTranscriptApproved(Student student)
    {
        for(TranscriptRequest b: this.transcriptRequests) {
            if(b.getStudent().getId().equals(student.getId())) {
                if (b.getStatus().equals("approved"))
                {
                    return true;
                }
            }
        }      
        return false;
    }
    
}
