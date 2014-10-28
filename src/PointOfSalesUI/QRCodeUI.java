package PointOfSalesUI;

import com.onbarcode.barcode.IBarcode;
import com.onbarcode.barcode.QRCode;
import commoninfrastructure.accountmanagement.ShoppingListEntity;
import java.awt.Color;
import java.awt.Container;
import java.io.File;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingWorker;

public class QRCodeUI extends javax.swing.JFrame {

    private ImageIcon _image1;
    private JLabel _mainLabel;
    private Container cp;
    private boolean isSelfCheckoutUI;
    private Date date;
    private SwingWorker<Void, Void> worker;

    public QRCodeUI() {
        this.setSize(1280, 960);
        cp = getContentPane();
        cp.setBackground(Color.white);
        generateQR();
        pack();
        initComponents();
        centerFrame.add(_mainLabel);
        dispose();
        setUndecorated(true);
        swingWorker();
    }

    public QRCodeUI(SelfCheckOutUI selfCheckOutUI) {
        isSelfCheckoutUI = true;
        this.setSize(1280, 960);
        cp = getContentPane();
        cp.setBackground(Color.white);
        generateQR();
        pack();
        initComponents();
        centerFrame.add(_mainLabel);
        dispose();
        setUndecorated(true);
        swingWorker();
    }

    public QRCodeUI(CashierCheckoutUI cashierCheckoutUI) {
        isSelfCheckoutUI = false;
        this.setSize(1280, 960);
        cp = getContentPane();
        cp.setBackground(Color.white);
        generateQR();
        pack();
        initComponents();
        centerFrame.add(_mainLabel);
        dispose();
        setUndecorated(true);
        swingWorker();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHader = new javax.swing.JPanel();
        lblHeader1 = new javax.swing.JLabel();
        centerFrame = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlHader.setBackground(new java.awt.Color(153, 0, 0));

        lblHeader1.setFont(new java.awt.Font("Tahoma", 1, 82)); // NOI18N
        lblHeader1.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-label.png"))); // NOI18N

        javax.swing.GroupLayout pnlHaderLayout = new javax.swing.GroupLayout(pnlHader);
        pnlHader.setLayout(pnlHaderLayout);
        pnlHaderLayout.setHorizontalGroup(
            pnlHaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHaderLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(lblHeader1)
                .addContainerGap(235, Short.MAX_VALUE))
        );
        pnlHaderLayout.setVerticalGroup(
            pnlHaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHaderLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(lblHeader1)
                .addGap(45, 45, 45))
        );

        centerFrame.setBackground(new java.awt.Color(255, 255, 255));
        centerFrame.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        centerFrame.setName(""); // NOI18N

        javax.swing.GroupLayout centerFrameLayout = new javax.swing.GroupLayout(centerFrame);
        centerFrame.setLayout(centerFrameLayout);
        centerFrameLayout.setHorizontalGroup(
            centerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );
        centerFrameLayout.setVerticalGroup(
            centerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Scan QR Code");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("To syncronise the your shopping list, please go to...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBack.setBackground(new java.awt.Color(153, 0, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Return");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblMessage.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(153, 0, 0));
        lblMessage.setText("                ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26))
                            .addComponent(centerFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(535, 535, 535))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(454, 454, 454))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlHader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(centerFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(lblMessage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if (isSelfCheckoutUI) {
            SelfCheckOutUI selfCheckOutUI = new SelfCheckOutUI();
            selfCheckOutUI.setVisible(true);
            worker.cancel(true);
            dispose();
        } else {
            CashierCheckoutUI cashierCheckoutUI = new CashierCheckoutUI();
            cashierCheckoutUI.setVisible(true);
            worker.cancel(true);
            dispose();
        }
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(QRCodeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QRCodeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QRCodeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QRCodeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QRCodeUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel centerFrame;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JPanel pnlHader;
    // End of variables declaration//GEN-END:variables

    private void swingWorker() {
        worker = new SwingWorker<Void, Void>() {

            @Override
            protected Void doInBackground() throws Exception {
                try {
                    String memberEmail = getSyncWithPhoneStatus(date.getTime() + "");
                    int count = 0;
                    int currentDot = 1;
                    while (memberEmail == null) {
                        Thread.sleep(250);
                        count++;
                        memberEmail = getSyncWithPhoneStatus(date.getTime() + "");

                        if (count == 8) {
                            lblMessage.setText("Synchronising for phone.");
                        } else if (count > 8) {
                            if (currentDot == 3) {
                                lblMessage.setText("Synchronising for phone.");
                                currentDot = 1;
                            } else if (currentDot == 1) {
                                lblMessage.setText("Synchronising for phone..");
                                currentDot = 2;
                            } else if (currentDot == 2) {
                                lblMessage.setText("Synchronising for phone...");
                                currentDot = 3;
                            }
                        }
                        if (memberEmail != null) {
                            //ShoppingListEntity shoppingList = getMemberShoppingList(memberEmail);
                            //ShoppingListEntity shoppingList = new ShoppingListEntity();

                            //if coming from self service checkout
                            if (isSelfCheckoutUI) {
                                //SelfCheckOutUI selfCheckOutUI = new SelfCheckOutUI(shoppingList);
//                                selfCheckOutUI.setVisible(true);
//                                worker.cancel(true);
//                                dispose();

                            } else {
                                //if coming from cashier checkout

                            }

                            break;

                        }
                        System.out.println("countdown" + count);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                return null;
            }
        };
        worker.execute();
    }

    private void generateQR() {
        try {
            QRCode barcode = new QRCode();

            date = new Date();
            createSyncWithPhoneRequest(date.getTime() + "");

            barcode.setData(date.getTime() + "");
            barcode.setDataMode(QRCode.M_AUTO);
            barcode.setVersion(10);
            barcode.setEcl(QRCode.ECL_M);
            barcode.setProcessTilde(false);
            barcode.setUom(IBarcode.UOM_PIXEL);
            barcode.setX(3f);
            barcode.setLeftMargin(10f);
            barcode.setRightMargin(10f);
            barcode.setTopMargin(10f);
            barcode.setBottomMargin(10f);
            barcode.setResolution(72);

            String filePath = new File("").getAbsolutePath();
            String currentPath = filePath.concat("\\src\\images\\qrcode.gif");
            barcode.drawBarcode(currentPath);

            _image1 = new ImageIcon(currentPath);
            _mainLabel = new JLabel(_image1);
            add(_mainLabel);

        } catch (Exception ex) {
            Logger.getLogger(QRCodeUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static Boolean createSyncWithPhoneRequest(java.lang.String qrCode) {
        PointOfSalesUI.LoyaltyAndRewardsWebService_Service service = new PointOfSalesUI.LoyaltyAndRewardsWebService_Service();
        PointOfSalesUI.LoyaltyAndRewardsWebService port = service.getLoyaltyAndRewardsWebServicePort();
        return port.createSyncWithPhoneRequest(qrCode);
    }

    private static String getSyncWithPhoneStatus(java.lang.String qrCode) {
        PointOfSalesUI.LoyaltyAndRewardsWebService_Service service = new PointOfSalesUI.LoyaltyAndRewardsWebService_Service();
        PointOfSalesUI.LoyaltyAndRewardsWebService port = service.getLoyaltyAndRewardsWebServicePort();
        return port.getSyncWithPhoneStatus(qrCode);
    }

    private static ShoppingListEntity getMemberShoppingList(java.lang.String email) {
        commoninfrastructure.accountmanagement.AccountManagementWebService_Service service = new commoninfrastructure.accountmanagement.AccountManagementWebService_Service();
        commoninfrastructure.accountmanagement.AccountManagementWebService port = service.getAccountManagementWebServicePort();
        return port.getMemberShoppingList(email);
    }

}
