package Kiosk;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDialog;

public class RegistrationUI extends javax.swing.JFrame {

    private Container cp;

    public RegistrationUI() {
        initComponents();
        this.setTitle("Island Furniture - Kiosk");
        this.setSize(1600, 900);
        cp = getContentPane();
        cp.setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHader = new javax.swing.JPanel();
        lblHeader2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtRePassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        btnReset1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlHader.setBackground(new java.awt.Color(153, 0, 0));

        lblHeader2.setFont(new java.awt.Font("Tahoma", 1, 82)); // NOI18N
        lblHeader2.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-label.png"))); // NOI18N

        javax.swing.GroupLayout pnlHaderLayout = new javax.swing.GroupLayout(pnlHader);
        pnlHader.setLayout(pnlHaderLayout);
        pnlHaderLayout.setHorizontalGroup(
            pnlHaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHaderLayout.createSequentialGroup()
                .addContainerGap(386, Short.MAX_VALUE)
                .addComponent(lblHeader2)
                .addGap(369, 369, 369))
        );
        pnlHaderLayout.setVerticalGroup(
            pnlHaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHaderLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(lblHeader2)
                .addGap(45, 45, 45))
        );

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtRePassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("Re-Password");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("Email");

        btnSubmit.setBackground(new java.awt.Color(153, 0, 0));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");

        btnReset.setBackground(new java.awt.Color(153, 0, 0));
        btnReset.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        lblMessage.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(153, 0, 0));
        lblMessage.setText(" ");

        btnReset1.setBackground(new java.awt.Color(153, 0, 0));
        btnReset1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnReset1.setForeground(new java.awt.Color(255, 255, 255));
        btnReset1.setText("Return to Main Menu");
        btnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(270, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMessage)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(lblMessage)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtEmail.setText("");
        txtPassword.setText("");
        txtRePassword.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset1ActionPerformed
        KioskUI kioskUI = new KioskUI();
        kioskUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReset1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnReset1;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblHeader2;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JPanel pnlHader;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRePassword;
    // End of variables declaration//GEN-END:variables
}
