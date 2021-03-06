/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.IF3000.BiblioTech.Interface;

import File.StudentFile;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Max
 */
public class SearchStudent extends javax.swing.JFrame {

    /**
     * Creates new form SearchStudent
     */
    public SearchStudent() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Search = new javax.swing.JLabel();
        tfd_Search = new javax.swing.JTextField();
        lbl_ResultSearch = new javax.swing.JLabel();
        btn_SearchSeacrhStudent = new javax.swing.JButton();
        cb_choise = new javax.swing.JComboBox<>();
        btn_BackSearchStudent = new javax.swing.JButton();
        lbl_Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(945, 522));
        setResizable(false);
        getContentPane().setLayout(null);

        lbl_Search.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_Search.setText("Verify if student is recorded");
        getContentPane().add(lbl_Search);
        lbl_Search.setBounds(106, 21, 310, 34);

        tfd_Search.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(tfd_Search);
        tfd_Search.setBounds(106, 73, 267, 50);

        lbl_ResultSearch.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_ResultSearch.setText("...");
        lbl_ResultSearch.setPreferredSize(new java.awt.Dimension(266, 29));
        getContentPane().add(lbl_ResultSearch);
        lbl_ResultSearch.setBounds(416, 94, 266, 29);

        btn_SearchSeacrhStudent.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_SearchSeacrhStudent.setText("Search");
        btn_SearchSeacrhStudent.setMaximumSize(new java.awt.Dimension(63, 25));
        btn_SearchSeacrhStudent.setMinimumSize(new java.awt.Dimension(63, 25));
        btn_SearchSeacrhStudent.setPreferredSize(new java.awt.Dimension(63, 25));
        btn_SearchSeacrhStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchSeacrhStudentActionPerformed(evt);
            }
        });
        getContentPane().add(btn_SearchSeacrhStudent);
        btn_SearchSeacrhStudent.setBounds(106, 141, 100, 40);

        cb_choise.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cb_choise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loans", "Book", "AudioVisual" }));
        cb_choise.setEnabled(false);
        cb_choise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_choiseActionPerformed(evt);
            }
        });
        getContentPane().add(cb_choise);
        cb_choise.setBounds(110, 220, 110, 40);

        btn_BackSearchStudent.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_BackSearchStudent.setText("Back");
        btn_BackSearchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackSearchStudentActionPerformed(evt);
            }
        });
        getContentPane().add(btn_BackSearchStudent);
        btn_BackSearchStudent.setBounds(110, 400, 100, 40);

        lbl_Background.setIcon(new javax.swing.ImageIcon("C:\\Users\\Max\\Desktop\\Manfred\\Segundo año\\Programacion II\\Proyectos\\Proyecto1\\fondoBasico.jpg")); // NOI18N
        getContentPane().add(lbl_Background);
        lbl_Background.setBounds(0, 0, 940, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BackSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackSearchStudentActionPerformed
        // TODO add your handling code here:
        Principal p = new Principal();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_BackSearchStudentActionPerformed

    private void btn_SearchSeacrhStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchSeacrhStudentActionPerformed
        // TODO add your handling code here:
        try {
        String ID=tfd_Search.getText();
        File file = new File("./student.dat");
        StudentFile studentFile = new StudentFile(file);
        
            
            
            if(studentFile.searchExistStudent(ID)==true){
                lbl_ResultSearch.setText("Student Found");
                cb_choise.setEnabled(true);
            }else{
                lbl_ResultSearch.setText("Student is not recorded");
            }
        } catch (IOException ex) {
            System.err.println("File not found");
        }
        tfd_Search.setText("");
    }//GEN-LAST:event_btn_SearchSeacrhStudentActionPerformed

    private void cb_choiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_choiseActionPerformed
        // TODO add your handling code here:
        String item=cb_choise.getSelectedItem().toString();
        if(item.equals("Book")){
//            LoanBook ln = new LoanBook();
//            ln.setVisible(true);
//            this.setVisible(false);
        }else if (item.equals("AudioVisual")){
        
            
       }
        
    }//GEN-LAST:event_cb_choiseActionPerformed

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
            java.util.logging.Logger.getLogger(SearchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_BackSearchStudent;
    private javax.swing.JButton btn_SearchSeacrhStudent;
    private javax.swing.JComboBox<String> cb_choise;
    private javax.swing.JLabel lbl_Background;
    private javax.swing.JLabel lbl_ResultSearch;
    private javax.swing.JLabel lbl_Search;
    private javax.swing.JTextField tfd_Search;
    // End of variables declaration//GEN-END:variables
}
