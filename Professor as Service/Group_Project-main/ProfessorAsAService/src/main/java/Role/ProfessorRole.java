/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.Business;
import UI.Admin.SystemAdminJFrame;
import UI.Professor.ProfessorJFrame;
import UI.Professor.ProfessorJFrame;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author divya
 */

public class ProfessorRole extends Role {

    @Override
    public JFrame createWorkArea(Business business, UserAccount useraccount) {
        return new ProfessorJFrame(business,useraccount);
    }
    
}