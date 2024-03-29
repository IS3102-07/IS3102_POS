package POS;

import java.awt.Color;
import java.awt.Container;
import java.util.List;
import storetransaction.retailinventory.RetailInventoryWebService;
import storetransaction.retailinventory.RetailInventoryWebService_Service;

public class LoginUI extends javax.swing.JFrame {

    LoginUI loginGUI = this;
    private Container cp;

    public LoginUI() {
        initComponents();
        cp = getContentPane();
        cp.setBackground(Color.white);
        this.setSize(1280, 960);

        ReadFile readFile = new ReadFile();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        pnlHader = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblMessage = new javax.swing.JLabel();
        lblPassword1 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Island Furniture");
        setBackground(new java.awt.Color(0, 255, 153));
        setBounds(new java.awt.Rectangle(0, 0, 1280, 960));
        setForeground(java.awt.Color.white);
        setUndecorated(true);

        pnlHader.setBackground(new java.awt.Color(153, 0, 0));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 82)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-label.png"))); // NOI18N

        javax.swing.GroupLayout pnlHaderLayout = new javax.swing.GroupLayout(pnlHader);
        pnlHader.setLayout(pnlHaderLayout);
        pnlHaderLayout.setHorizontalGroup(
            pnlHaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHaderLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );
        pnlHaderLayout.setVerticalGroup(
            pnlHaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHaderLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(lblHeader)
                .addGap(45, 45, 45))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        btnLogin.setBackground(new java.awt.Color(153, 0, 0));
        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(153, 0, 0));
        btnClear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(153, 0, 0));
        btnExit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEmail.setText("Email");

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPassword.setText("Password");

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        lblMessage.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 51, 51));
        lblMessage.setText(" ");

        lblPassword1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPassword1.setText("Supervisor ContactNo.");

        txtContact.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMessage)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPassword)
                                        .addComponent(lblPassword1))
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtContact)
                                        .addComponent(txtPassword)
                                        .addComponent(txtEmail)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(870, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(lblMessage)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword1)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 121, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtEmail.setText("");
        txtPassword.setText("");
        txtContact.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String passText = new String(txtPassword.getPassword());

        if (txtEmail.getText().isEmpty() && txtPassword.getPassword().length == 0) {
            lblMessage.setText("Error: Email and Password cannot be blank.");
        } else if (txtEmail.getText().isEmpty()) {
            lblMessage.setText("Error: Email cannot be blank.");
        } else if (txtContact.getText().isEmpty()) {
            lblMessage.setText("Error: Contact cannot be blank.");
        } else if (txtPassword.getPassword().length == 0) {
            lblMessage.setText("Error: Password cannot be blank.");
        } else {
            try {
                Integer.parseInt(txtContact.getText());
                String staffName = posLoginStaff(txtEmail.getText(), passText);
                if (staffName == null) {
                    lblMessage.setText("Invalid credential. Please try again.");
                } else {
                    POS.staffName = staffName;
                    POS.supervisorContactNo = getCountryCode(POS.storeID) + txtContact.getText();
                    POS.staffEmail = txtEmail.getText();
                    POS.staffPassword = txtPassword.getPassword();

                    List<String> store = getStoreAddressByID(POS.storeID);
                    POS.storeAddress = store.get(0);
                    POS.storePostal = store.get(1);
                    POS.storeCountry = store.get(2);

                    //POS.POS_storePostal = store.get
                    MainMenuUI mainMenuUI = new MainMenuUI();
                    mainMenuUI.setVisible(true);
                    this.setVisible(false);
                }
            } catch (NumberFormatException ex) {
                lblMessage.setText("Invalid Phone number");
            } catch (Exception ex) {
                ex.printStackTrace();
                lblMessage.setText("Error: Unable to initalize POS. Check hardware connection & configuration file.");
            }
        }

    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JPanel pnlHader;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

    private static String getCountryCode(java.lang.Long storeID) {
        RetailInventoryWebService_Service service = new RetailInventoryWebService_Service();
        RetailInventoryWebService port = service.getRetailInventoryWebServicePort();
        return port.getCountryCode(storeID);
    }

    private static java.util.List<java.lang.String> getStoreAddressByID(java.lang.Long storeID) {
        RetailInventoryWebService_Service service = new RetailInventoryWebService_Service();
        RetailInventoryWebService port = service.getRetailInventoryWebServicePort();
        return port.getStoreAddressByID(storeID);
    }

    private static String posLoginStaff(java.lang.String email, java.lang.String password) {
        commoninfrastructure.accountmanagement.AccountManagementWebService_Service service = new commoninfrastructure.accountmanagement.AccountManagementWebService_Service();
        commoninfrastructure.accountmanagement.AccountManagementWebService port = service.getAccountManagementWebServicePort();
        return port.posLoginStaff(email, password);
    }

}
