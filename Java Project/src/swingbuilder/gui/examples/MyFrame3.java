/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_and1;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author HP
 */
public class MyFrame3 extends javax.swing.JFrame {

    /**
     * Creates new form MyFrame3
     */
    public MyFrame3() {
        initComponents();
        setLocationRelativeTo(null);
        Toolkit tk=Toolkit.getDefaultToolkit();
        Image img=tk.getImage("C:\\Users\\HP\\Desktop\\logo.png");
        setIconImage(img);
        ImageIcon img1=new ImageIcon("C:\\Users\\HP\\Desktop\\date.png");
        btnShowDateTime.setIcon(img1);
        btnShowDateTime.setToolTipText("CLick Me To Show Date And Time");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MyPanel = new javax.swing.JPanel();
        btnShowDateTime = new javax.swing.JButton();
        btnChangeColor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnShowDateTime.setBackground(new java.awt.Color(0, 0, 0));
        btnShowDateTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnShowDateTime.setForeground(new java.awt.Color(240, 240, 240));
        btnShowDateTime.setText("Show Date Time");
        btnShowDateTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDateTimeActionPerformed(evt);
            }
        });

        btnChangeColor.setBackground(new java.awt.Color(0, 0, 0));
        btnChangeColor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChangeColor.setForeground(new java.awt.Color(240, 240, 240));
        btnChangeColor.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\color.png")); // NOI18N
        btnChangeColor.setText("Change Color");
        btnChangeColor.setToolTipText("Click Me For Change Color");
        btnChangeColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MyPanelLayout = new javax.swing.GroupLayout(MyPanel);
        MyPanel.setLayout(MyPanelLayout);
        MyPanelLayout.setHorizontalGroup(
            MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MyPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnShowDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(btnChangeColor, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        MyPanelLayout.setVerticalGroup(
            MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyPanelLayout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChangeColor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(MyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowDateTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDateTimeActionPerformed
        Date today=new Date();
        setTitle(today.toString());
    }//GEN-LAST:event_btnShowDateTimeActionPerformed

    private void btnChangeColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeColorActionPerformed
        Random rd=new Random();
        Color cl=new Color(rd.nextInt(256),rd.nextInt(256),rd.nextInt(256));
        MyPanel.setBackground(cl);
        
    }//GEN-LAST:event_btnChangeColorActionPerformed

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
            java.util.logging.Logger.getLogger(MyFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFrame3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MyPanel;
    private javax.swing.JButton btnChangeColor;
    private javax.swing.JButton btnShowDateTime;
    // End of variables declaration//GEN-END:variables
}
