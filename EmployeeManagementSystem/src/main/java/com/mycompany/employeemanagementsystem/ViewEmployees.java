/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.employeemanagementsystem;

import java.awt.Component;
import java.awt.Font;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author ashley
 */
public class ViewEmployees extends javax.swing.JFrame {
    
    ArrayList<Job> jobs;
    ArrayList<Employee> employees;

    /**
     * Creates new form ViewEmployees
     */
    public ViewEmployees() {
        initComponents();
        jobs = new ArrayList<>(); // Initialize jobs ArrayList
        employees = new ArrayList<>(); // Initialize employees ArrayList
        headerToBold();
        populateArrayList();
        populateTable();
    }
    
    
    
      public void populateArrayList(){
        try{
            
            FileInputStream file = new FileInputStream("Jobs.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);
            
            // check if its not the end of file
            boolean endOfFile = false;
            
            while(!endOfFile){
                try{
                    
                    jobs.add((Job) inputFile.readObject());
                
                }catch(EOFException e){
                    endOfFile = true;
                    
                }catch(Exception f){
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
                
            }
            
            inputFile.close();
        
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        try{
            
            FileInputStream file2 = new FileInputStream("Employees.dat");
            ObjectInputStream inputFile2 = new ObjectInputStream(file2);
            
            // check if its not the end of file
            boolean endOfFile = false;
            
            while(!endOfFile){
                try{
                    
                    employees.add((Employee) inputFile2.readObject());
                
                }catch(EOFException e){
                    endOfFile = true;
                    
                }catch(Exception f){
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
                
            }
            
            inputFile2.close();
        
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
    public void populateTable() {
    String columns[] = {"Staff Number", "Name", "Surname", "Email", "Job"};

    // Check if employees list is not empty
    if (!employees.isEmpty()) {
        Object[][] data = new Object[employees.size()][columns.length];

        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            data[i][0] = emp.getStaffNr();   // Replace with actual method to get staff number
            data[i][1] = emp.getName();     // Replace with actual method to get name
            data[i][2] = emp.getSurname();  // Replace with actual method to get surname
            data[i][3] = emp.getEmail();
            data[i][4] = emp.getJob().getNameOfJob();      // Replace with actual method to get job
        }

        DefaultTableModel model = new DefaultTableModel(data, columns){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Disable editing of all cells
            }
        };
        jTable1.setModel(model);
        adjustColumnWidths();
    } else {
        // If employees list is empty, display a message or handle as needed
        JOptionPane.showMessageDialog(null, "Employees list is empty.");
        // Optionally, you might want to clear the table or set default data
        DefaultTableModel emptyModel = new DefaultTableModel(new Object[][]{}, columns){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Disable editing of all cells
            }
        };
        jTable1.setModel(emptyModel);
    }
}
    
    
    private void adjustColumnWidths() {
    TableColumnModel columnModel = jTable1.getColumnModel();
    for (int column = 0; column < jTable1.getColumnCount(); column++) {
        int width = 15; // Min width
        for (int row = 0; row < jTable1.getRowCount(); row++) {
            TableCellRenderer renderer = jTable1.getCellRenderer(row, column);
            Component comp = jTable1.prepareRenderer(renderer, row, column);
            width = Math.max(comp.getPreferredSize().width +1 , width);
        }
        if(width > 300)
            width = 300;
        columnModel.getColumn(column).setPreferredWidth(width);
    }
}
    
    private void headerToBold(){
        JTableHeader head = jTable1.getTableHeader();
        head.setFont(new Font("Liberation Sans", Font.BOLD, 15));
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 3, 24)); // NOI18N
        jLabel1.setText("View All Employees");

        jTable1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/9004799_arrow_direction_left_back_icon.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(303, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEmployees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
