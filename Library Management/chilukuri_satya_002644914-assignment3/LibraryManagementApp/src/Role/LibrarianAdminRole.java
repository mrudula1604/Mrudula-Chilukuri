/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Role;

import Business.Branch;
import Business.Business;
import UI.BranchManagerPanels.BranchManagerJFrame;
import Business.UserAccount;
import UI.LibrarianPanels.LibrarianJFrame;
import javax.swing.JFrame;

/**
 *
 * @author chilukuri
 */
public class LibrarianAdminRole extends Role {

    @Override
    public JFrame createWorkArea(Business business, Branch branch, UserAccount useraccount) {
       return new LibrarianJFrame(business, branch, useraccount);
    }
    
}
