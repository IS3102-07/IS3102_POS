package PointOfSalesUI;

import POS.*;
import com.onbarcode.barcode.IBarcode;
import com.onbarcode.barcode.QRCode;
import commoninfrastructure.accountmanagement.ItemHelper;
import java.awt.Color;
import java.awt.Container;
import java.io.File;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.SwingWorker;
import operationalcrm.loyaltyandrewards.LoyaltyAndRewardsWebService;
import operationalcrm.loyaltyandrewards.LoyaltyAndRewardsWebService_Service;

public class QRCodeUI extends javax.swing.JFrame {

    private Container cp;
    private boolean isSelfCheckoutUI;
    private Date date;
    private SwingWorker<Void, Void> worker;
    private SelfCheckOutUI selfCheckOutUI;
    private CashierCheckoutUI cashierCheckoutUI;
    final String filePath = new File("").getAbsolutePath();

    public QRCodeUI() {
    }

    public QRCodeUI(SelfCheckOutUI selfCheckOutUI) {
        this.selfCheckOutUI = selfCheckOutUI;
        isSelfCheckoutUI = true;
        initFrame();
    }

    public QRCodeUI(CashierCheckoutUI cashierCheckoutUI) {
        this.cashierCheckoutUI = cashierCheckoutUI;
        isSelfCheckoutUI = false;
        initFrame();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHader = new javax.swing.JPanel();
        lblHeader1 = new javax.swing.JLabel();
        qrCodePanel = new javax.swing.JPanel();
        lblQRcode = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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

        qrCodePanel.setBackground(new java.awt.Color(255, 255, 255));
        qrCodePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        qrCodePanel.setName(""); // NOI18N

        lblQRcode.setText(" ");

        javax.swing.GroupLayout qrCodePanelLayout = new javax.swing.GroupLayout(qrCodePanel);
        qrCodePanel.setLayout(qrCodePanelLayout);
        qrCodePanelLayout.setHorizontalGroup(
            qrCodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, qrCodePanelLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(lblQRcode, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        qrCodePanelLayout.setVerticalGroup(
            qrCodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qrCodePanelLayout.createSequentialGroup()
                .addComponent(lblQRcode, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Scan QR Code");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Please switch on your mobile app to Sync...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
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
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(526, 526, 526)
                        .addComponent(qrCodePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(551, 551, 551)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(482, 482, 482)
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlHader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(qrCodePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if (isSelfCheckoutUI) {
            selfCheckOutUI.setVisible(true);
            this.setVisible(false);
        } else {
            cashierCheckoutUI.setVisible(true);
            this.setVisible(false);
        }

        if (POS.qrIsPressed) {
            worker.cancel(true);
            POS.qrIsPressed = false;
        }

        try {
            String currentPath = filePath.concat("\\src\\images\\" + POS.qrImageName + ".png");
            File file = new File(currentPath);
            if (file.delete()) {
                System.out.println(file.getName() + " is deleted!");
            } else {
                System.out.println(file.getName() + " Delete operation is failed.!");
            }
        } catch (Exception e) {
            //e.printStackTrace();
        }
        dispose();
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblQRcode;
    private javax.swing.JPanel pnlHader;
    private javax.swing.JPanel qrCodePanel;
    // End of variables declaration//GEN-END:variables

    public void swingWorker() {
        worker = new SwingWorker<Void, Void>() {

            @Override
            protected Void doInBackground() throws Exception {
                try {
                    System.out.println("swingworker doInBackground");
                    String memberEmail = getSyncWithPhoneStatus(date.getTime() + "");
                    System.out.println("memberEmail: " + memberEmail + " | " + date.getTime());
                    int count = 0;
                    int currentDot = 1;
                    while (memberEmail == null) {
                        System.out.println("swingWorker memberEmail: " + memberEmail + " | " + date.getTime());
                        Thread.sleep(250);
                        count++;
                        memberEmail = getSyncWithPhoneStatus(date.getTime() + "");

                        if (count == 8) {
                            lblMessage.setText("     Waiting for phone.");
                        } else if (count > 8) {
                            if (currentDot == 3) {
                                lblMessage.setText("     Waiting for phone.");
                                currentDot = 1;
                            } else if (currentDot == 1) {
                                lblMessage.setText("     Waiting for phone..");
                                currentDot = 2;
                            } else if (currentDot == 2) {
                                lblMessage.setText("     Waiting for phone...");
                                currentDot = 3;
                            }
                        }
                        if (memberEmail != null) {
                            System.out.println("memberEmail " + memberEmail);
                            List<ItemHelper> shoppingList = getMemberShoppingList(memberEmail);
                            System.out.println("shoppingList " + shoppingList.size());
                            if (isSelfCheckoutUI) {
                                lblMessage.setText("Synchronising for phone...");
                                SelfCheckOutUI selfCheckOutUI = new SelfCheckOutUI(shoppingList);
                                selfCheckOutUI.setVisible(true);
                            } else {
                                lblMessage.setText("Synchronising for phone...");
                                CashierCheckoutUI cashierCheckoutUI = new CashierCheckoutUI(shoppingList);
                                cashierCheckoutUI.setVisible(true);
                            }
                            worker.cancel(true);
                            setVisible(false);
                            POS.qrIsPressed = false;

                            String line2 = String.format("%20s", "synchronized!");
                            //POS.displayPoleMessage("Mobile Sync", line2);

                            try {
                                String currentPath = filePath.concat("\\src\\images\\" + POS.qrImageName + ".png");
                                File file = new File(currentPath);
                                if (file.delete()) {
                                    System.out.println(file.getName() + " is deleted!");
                                } else {
                                    System.out.println(file.getName() + " Delete operation is failed.!");
                                }
                            } catch (Exception e) {
                                //e.printStackTrace();
                            }

                            dispose();
                            break;
                        }
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                return null;
            }
        };
        worker.execute();
    }

    private void initFrame() {
        this.setSize(1280, 960);
        cp = getContentPane();
        cp.setBackground(Color.white);
        initComponents();
//        dispose();
//        setUndecorated(true);
    }

    public void generateQR() {
        try {
            QRCode barcode = new QRCode();
            date = new Date();
            System.out.println("generateQR  " + date.getTime());
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

            POS.qrImageName = date.getTime() + "";
            String currentPath = filePath.concat("\\src\\images\\" + POS.qrImageName + ".png");
            System.out.println(currentPath);
            barcode.drawBarcode(currentPath);

            lblQRcode.setIcon(new ImageIcon(currentPath));
            revalidate();
            repaint();
        } catch (Exception ex) {
            //ex.printStackTrace();
        }
    }

    private static Boolean createSyncWithPhoneRequest(java.lang.String qrCode) {
        LoyaltyAndRewardsWebService_Service service = new LoyaltyAndRewardsWebService_Service();
        LoyaltyAndRewardsWebService port = service.getLoyaltyAndRewardsWebServicePort();
        return port.createSyncWithPhoneRequest(qrCode);
    }

    private static String getSyncWithPhoneStatus(java.lang.String qrCode) {
        LoyaltyAndRewardsWebService_Service service = new LoyaltyAndRewardsWebService_Service();
        LoyaltyAndRewardsWebService port = service.getLoyaltyAndRewardsWebServicePort();
        return port.getSyncWithPhoneStatus(qrCode);
    }

    private static java.util.List<commoninfrastructure.accountmanagement.ItemHelper> getMemberShoppingList(java.lang.String email) {
        commoninfrastructure.accountmanagement.AccountManagementWebService_Service service = new commoninfrastructure.accountmanagement.AccountManagementWebService_Service();
        commoninfrastructure.accountmanagement.AccountManagementWebService port = service.getAccountManagementWebServicePort();
        return port.getMemberShoppingList(email);
    }

}
