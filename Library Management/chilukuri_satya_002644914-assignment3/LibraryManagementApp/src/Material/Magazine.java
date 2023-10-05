/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Material;

import java.util.Date;

/**
 *
 * @author chilukuri
 */
public class Magazine extends Material{
    private String companyName;
    private String issueType;
    
    public Magazine(String serialNum, String name, Date registeredDate, boolean isAvailable,
            String companyName, String issueType) {
        super();
        this.serialNumber = serialNum;
        this.name = name;
        this.registeredDate = registeredDate;
        this.isAvailable = isAvailable;
        this.companyName = companyName;
        this.issueType = issueType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }
    
    
}
