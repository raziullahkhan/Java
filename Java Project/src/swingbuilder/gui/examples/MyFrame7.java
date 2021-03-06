/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swingbuilder.gui.examples;

import java.awt.Color;

/**
 *
 * @author HP
 */
public class MyFrame7 extends javax.swing.JFrame {

    /** Creates new form MyFrame7 */
    public MyFrame7() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myPanel = new javax.swing.JPanel();
        chkRed = new javax.swing.JCheckBox();
        chkGreen = new javax.swing.JCheckBox();
        chkBlue = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        myPanel.setBackground(new java.awt.Color(0, 0, 0));
        myPanel.setForeground(new java.awt.Color(240, 240, 240));

        chkRed.setBackground(new java.awt.Color(0, 0, 0));
        chkRed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkRed.setForeground(new java.awt.Color(240, 240, 240));
        chkRed.setText("RED");
        chkRed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkStateChanged(evt);
            }
        });

        chkGreen.setBackground(new java.awt.Color(0, 0, 0));
        chkGreen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkGreen.setForeground(new java.awt.Color(240, 240, 240));
        chkGreen.setText("GREEN");
        chkGreen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkStateChanged(evt);
            }
        });

        chkBlue.setBackground(new java.awt.Color(0, 0, 0));
        chkBlue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkBlue.setForeground(new java.awt.Color(240, 240, 240));
        chkBlue.setText("BLUE");
        chkBlue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkStateChanged(evt);
            }
        });

        javax.swing.GroupLayout myPanelLayout = new javax.swing.GroupLayout(myPanel);
        myPanel.setLayout(myPanelLayout);
        myPanelLayout.setHorizontalGroup(
            myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(chkRed)
                .addGap(37, 37, 37)
                .addComponent(chkGreen)
                .addGap(34, 34, 34)
                .addComponent(chkBlue)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        myPanelLayout.setVerticalGroup(
            myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkRed)
                    .addComponent(chkGreen)
                    .addComponent(chkBlue))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkStateChanged
        int cl1=0,cl2=0,cl3=0;
        if(chkRed.isSelected()){
            cl1=255;
        }
        if(chkGreen.isSelected()){
            cl2=255;
        }
        if(chkBlue.isSelected()){
            cl3=255;
        }
        Color cl=new Color(cl1,cl2,cl3);
        myPanel.setBackground(cl);
    }//GEN-LAST:event_chkStateChanged

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
            java.util.logging.Logger.getLogger(MyFrame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyFrame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyFrame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyFrame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFrame7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkBlue;
    private javax.swing.JCheckBox chkGreen;
    private javax.swing.JCheckBox chkRed;
    private javax.swing.JPanel myPanel;
    // End of variables declaration//GEN-END:variables

}
