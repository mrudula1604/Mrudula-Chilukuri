/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.LibrarianPanels;

import Business.Branch;
import Business.BranchDirectory;
import Customer.Customer;
import Material.Book;
import Services.RentalRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chilukuri
 */
public class CustomerRentalRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LibRentalRequestsJPanel
     */
    private Branch branch;
    DefaultTableModel renRequestsTableModel;
    
    public CustomerRentalRequestsJPanel(Branch branch) {
        initComponents();
        this.branch = branch;
        this.renRequestsTableModel = (DefaultTableModel) libRenRequestsJTable.getModel();
        
        displayRentalRequests();
    }
    
    private void displayRentalRequests() {
        ArrayList<RentalRequest> rr = this.branch.getLibrary().getRentals().getOrderlist();
        if(rr.size() >= 0) {
            renRequestsTableModel.setRowCount(0);
            for(RentalRequest r: rr) {
                Object row[] = new Object[7];
                row[0] = r.getOrderId();
                row[1] = r.getMaterialId();
                row[2] = r.getCustomer().getPersonID();
                row[3] = r.getBranch().getBranchId();
                row[4] = r.getPrice();
                row[5] = r.getStatus();
                row[6] = r.getDuration();
                renRequestsTableModel.addRow(row);           
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
        libRenRequestsJTable = new javax.swing.JTable();
        approveRRBtn = new javax.swing.JButton();
        rejectRRBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        libRenRequestsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Material Id", "Customer Id", "Branch Id", "Price", "Status", "Duration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(libRenRequestsJTable);

        approveRRBtn.setText("Approve");
        approveRRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveRRBtnActionPerformed(evt);
            }
        });

        rejectRRBtn.setText("Reject");
        rejectRRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectRRBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(approveRRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(rejectRRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(approveRRBtn)
                    .addComponent(rejectRRBtn))
                .addContainerGap(217, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void approveRRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveRRBtnActionPerformed
        int selectedRowIndex = libRenRequestsJTable.getSelectedRow();
        String orderId = libRenRequestsJTable.getValueAt(selectedRowIndex, 0).toString();
        String status = libRenRequestsJTable.getValueAt(selectedRowIndex, 5).toString();
        String branchId = libRenRequestsJTable.getValueAt(selectedRowIndex, 3).toString();
        String customerId = libRenRequestsJTable.getValueAt(selectedRowIndex, 2).toString();
        String materialId = libRenRequestsJTable.getValueAt(selectedRowIndex, 1).toString();
        if (status != "returned" || status !="rejected")
        {

            RentalRequest currentOrder =  this.branch.getLibrary().getRentals().findRentalRequest(orderId);
            currentOrder.setStatus("approved");
            
            Book book = this.branch.getLibrary().getBooks().findBook(materialId);
            if (book != null)
            {
                book.setIsAvailable(false);
            }
            else
            {
                this.branch.getLibrary().getMagazines().findMagazine(materialId).setIsAvailable(false);
            }
            
            this.branch.getLibrary().getRentals().findRentalRequest(orderId).setStatus("approved");
            
            displayRentalRequests();
        }
        else{
            JOptionPane.showMessageDialog(null, "This material is already returned");
        } 
    }//GEN-LAST:event_approveRRBtnActionPerformed

    private void rejectRRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectRRBtnActionPerformed
        int selectedRowIndex = libRenRequestsJTable.getSelectedRow();
        String orderId = libRenRequestsJTable.getValueAt(selectedRowIndex, 0).toString();
        String status = libRenRequestsJTable.getValueAt(selectedRowIndex, 5).toString();
        String branchId = libRenRequestsJTable.getValueAt(selectedRowIndex, 3).toString();
        String customerId = libRenRequestsJTable.getValueAt(selectedRowIndex, 2).toString();
        String materialId = libRenRequestsJTable.getValueAt(selectedRowIndex, 1).toString();
        if (status.toLowerCase() == "requested")
        {
            RentalRequest currentOrder =  this.branch.getLibrary().getRentals().findRentalRequest(orderId);
            currentOrder.setStatus("rejected");
            
            Book book = this.branch.getLibrary().getBooks().findBook(materialId);
            if (book != null)
            {
                book.setIsAvailable(true);
            }
            else
            {
                this.branch.getLibrary().getMagazines().findMagazine(materialId).setIsAvailable(true);
            }
            
            this.branch.getLibrary().getRentals().findRentalRequest(orderId).setStatus("rejected");
            
            displayRentalRequests();
        }
        else{
            JOptionPane.showMessageDialog(null, "This material is already returned/rejected");
        } 
    }//GEN-LAST:event_rejectRRBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveRRBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable libRenRequestsJTable;
    private javax.swing.JButton rejectRRBtn;
    // End of variables declaration//GEN-END:variables
}
