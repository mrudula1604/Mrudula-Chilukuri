/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.Business;
import UI.Admin.SystemAdminJFrame;
import UI.CertifyingAuthority.CAJFrame;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author divya
 */

public class CertifyingAuthorityRole extends Role {

    @Override
    public JFrame createWorkArea(Business business, UserAccount useraccount) {
        return new CAJFrame(business,useraccount);
    }
    
}