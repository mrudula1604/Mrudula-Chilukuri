/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.Business;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author divya
 */
public abstract class Role {
    
    private static String[] roles = {"student", "professor", "admin", "certificationAuthority"};
    
    public static String[] getAllRoles() {
        return roles;
    }
    
    public abstract JFrame createWorkArea(Business business, UserAccount ua);
}
