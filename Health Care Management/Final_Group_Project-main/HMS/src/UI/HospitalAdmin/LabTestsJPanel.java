/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.HospitalAdmin;

import Business.Business;
import Insurance.InsurancePlans;
import Reports.TestReport;
import UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author divya
 */
public class LabTestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabTestsJPanel
     */
    public LabTestsJPanel() {
        initComponents();
        displayReports();
        
    }
  public Business business;
    public UserAccount userAccount;
    DefaultTableModel reportTableModel;
    
    public LabTestsJPanel(Business business, UserAccount userAccount) {
        initComponents();
        this.business = business;
        this.userAccount = userAccount;
        this.reportTableModel = (DefaultTableModel) patientReportTable.getModel();
        
        displayReports();
    }
public void displayReports()
    {
        ArrayList<TestReport> trs = this.business.getReports().getReports();
        if(trs.size() >= 0) {
            reportTableModel.setRowCount(0);
            for(TestReport p: trs) {
               // if (p.getPatient().getId().equals(userAccount.getPersonId()))
               // {
                    Object row[] = new Object[7];
                    row[0] = p.getDoctor().getFirstName() + ' ' + p.getDoctor().getLastName();
                    row[1] = p.getPatient().getFirstName() + ' ' + p.getPatient().getLastName();
                    row[2] = p.getLabtest().getProcedureName();
                    row[3] = p.getStatus();
                    row[4] = p.getLabtest().getPrice();
                    if (p.getPatient().getInsurancePlan() != null)
                    {
                        InsurancePlans ip = p.getPatient().getInsurancePlan();
                        Float coverage = ip.getCoveragePercentage();
                        
                        row[5]= p.getLabtest().getPrice() *  coverage;
                        row[6]= p.getLabtest().getPrice() - p.getLabtest().getPrice() * coverage;

                        //row[6] = (p.getMedicine().getPrice() * p.getQuantity()) * coverage;
                        //row[7] = (p.getMedicine().getPrice() * p.getQuantity()) - ((p.getMedicine().getPrice() * p.getQuantity()) * coverage);

                    } 
                    else{
                        row[5] = 0.00;
                        row[6] = p.getLabtest().getPrice(); 
                    }
                    reportTableModel.addRow(row);
               // } 
            }
        }        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        patientReportTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));

        patientReportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Doctor", "Patient", "Test", "Status", "Total Price", "Amt covered by insurance", "Amt paid by patient"
            }
        ));
        jScrollPane1.setViewportView(patientReportTable);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hospital Management System");
        jPanel2.add(jLabel5);

        jPanel1.add(jPanel2);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Lab Tests");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientReportTable;
    // End of variables declaration//GEN-END:variables
}
