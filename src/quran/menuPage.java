/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quran;

import java.awt.Toolkit;

public class menuPage extends javax.swing.JFrame {

    /**
     * Creates new form menuPage
     */
    public menuPage() {
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        Toolkit tk= Toolkit.getDefaultToolkit();
        int xsize=(int) tk.getScreenSize().getWidth();
        int ysize= (int)tk.getScreenSize().getHeight();
        this.setSize(xsize,ysize);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Read_MenuButton = new javax.swing.JButton();
        SearchWord_MenuButton = new javax.swing.JButton();
        subject_MenuButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("DejaVu Serif Condensed", 3, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 236, 236));
        jLabel1.setText("Indeed, this Qur'an guides to that which is most suitable and gives good tidings to the believers who do righteous deeds that they will have a great reward. [17:9]");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 100, 1240, 43);

        Read_MenuButton.setBackground(new java.awt.Color(244, 247, 249));
        Read_MenuButton.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        Read_MenuButton.setForeground(new java.awt.Color(15, 8, 49));
        Read_MenuButton.setText("Read Quran");
        Read_MenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Read_MenuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Read_MenuButton);
        Read_MenuButton.setBounds(90, 230, 250, 54);

        SearchWord_MenuButton.setBackground(new java.awt.Color(241, 245, 248));
        SearchWord_MenuButton.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        SearchWord_MenuButton.setForeground(new java.awt.Color(15, 8, 49));
        SearchWord_MenuButton.setText("Search Word from a Quran");
        SearchWord_MenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchWord_MenuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SearchWord_MenuButton);
        SearchWord_MenuButton.setBounds(360, 230, 370, 54);

        subject_MenuButton.setBackground(new java.awt.Color(249, 249, 250));
        subject_MenuButton.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        subject_MenuButton.setForeground(new java.awt.Color(15, 8, 49));
        subject_MenuButton.setText("Search Topic from a Quran");
        subject_MenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subject_MenuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(subject_MenuButton);
        subject_MenuButton.setBounds(740, 230, 380, 54);

        jButton2.setBackground(new java.awt.Color(234, 240, 244));
        jButton2.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(15, 8, 49));
        jButton2.setText("Menu");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(410, 20, 240, 68);

        jButton3.setBackground(new java.awt.Color(234, 240, 244));
        jButton3.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(15, 8, 49));
        jButton3.setText("Menu");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(410, 20, 240, 68);

        jButton4.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(15, 8, 49));
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(460, 430, 150, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quran/desktopwallpapers.org.ua-6378.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(950, 190, 450, 750);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quran/islamic-pattern-1.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(930, 0, 650, 190);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quran/islamic-pattern-1.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 430, 190);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quran/desktopwallpapers.org.ua-6378.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 190, 950, 660);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quran/islamic-pattern-1.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(430, 0, 590, 190);

        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(170, 400, 49, 17);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Read_MenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Read_MenuButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Read().setVisible(true);
        
    }//GEN-LAST:event_Read_MenuButtonActionPerformed

    private void SearchWord_MenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchWord_MenuButtonActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        new SearchWord().setVisible(true);
       
    }//GEN-LAST:event_SearchWord_MenuButtonActionPerformed

    private void subject_MenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subject_MenuButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new subjects().setVisible(true);
        
    }//GEN-LAST:event_subject_MenuButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(menuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Read_MenuButton;
    private javax.swing.JButton SearchWord_MenuButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton subject_MenuButton;
    // End of variables declaration//GEN-END:variables
}
