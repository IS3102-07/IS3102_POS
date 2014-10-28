package PointOfSalesUI;

import com.onbarcode.barcode.Code128;
import java.awt.Color;
import java.awt.Container;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingWorker;

public class testBarCode extends javax.swing.JFrame {

    private ImageIcon _image1;
    private JLabel _mainLabel;
    private Container cp;
    private boolean isSelfCheckoutUI;
    private Date date;
    private SwingWorker<Void, Void> worker;

    public testBarCode() {
        this.setSize(1280, 960);
        cp = getContentPane();
        cp.setBackground(Color.white);
        generateQR();
        pack();
        initComponents();
        //centerFrame.add(_mainLabel);
        dispose();
        setUndecorated(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHader = new javax.swing.JPanel();
        lblHeader1 = new javax.swing.JLabel();
        centerFrame = new javax.swing.JPanel();
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGap(0, 754, Short.MAX_VALUE)
        );
        centerFrameLayout.setVerticalGroup(
            centerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        lblMessage.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblMessage.setText("                ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(centerFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(411, 411, 411))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlHader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(lblMessage))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(centerFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(224, 224, 224))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(testBarCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testBarCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testBarCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testBarCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testBarCode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel centerFrame;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JPanel pnlHader;
    // End of variables declaration//GEN-END:variables

    private void generateQR() {
        try {

            Code128 barcode = new Code128(); 
            barcode.setData("Barcode-in-Java");
            barcode.setX(1); 
            barcode.drawBarcode("C://barcode-code128.gif"); 
            barcode.drawBarcode("C://barcode-code128.jpg"); 
//            EAN13 barcode = new EAN13();
//            barcode.setData("Barcode-in-Java");
//            barcode.setUom(IBarcode.UOM_PIXEL);
//            barcode.setX(3f);
//            barcode.setY(75f);
//            barcode.setLeftMargin(0f);
//            barcode.setRightMargin(0f);
//            barcode.setTopMargin(0f);
//            barcode.setBottomMargin(0f);
//            barcode.setResolution(72);
//            barcode.setShowText(true);
//            barcode.setTextFont(new Font("Arial", 0, 12));
//            barcode.setTextMargin(6);
//            barcode.setRotate(IBarcode.ROTATE_0);
//            barcode.drawBarcode("C://barcode-code128.jpg");
//            
//            String filePath = new File("").getAbsolutePath();
//            String currentPath = filePath.concat("\\src\\images\\barcode.gif");
            //barcode.drawBarcode(currentPath);

//            _image1 = new ImageIcon(currentPath);
//            _mainLabel = new JLabel(_image1);
//            add(_mainLabel);
            //QRCode barcode = new QRCode();
//            date = new Date();
//            createSyncWithPhoneRequest(date.getTime() + "");
//
//            barcode.setData(date.getTime() + "");
//            barcode.setDataMode(QRCode.M_AUTO);
//            barcode.setVersion(10);
//            barcode.setEcl(QRCode.ECL_M);
//            barcode.setProcessTilde(false);
//            barcode.setUom(IBarcode.UOM_PIXEL);
//            barcode.setX(3f);
//            barcode.setLeftMargin(10f);
//            barcode.setRightMargin(10f);
//            barcode.setTopMargin(10f);
//            barcode.setBottomMargin(10f);
//            barcode.setResolution(72);
//            String filePath = new File("").getAbsolutePath();
//            String currentPath = filePath.concat("\\src\\images\\qrcode.gif");
//            barcode.drawBarcode(currentPath);
//
//            _image1 = new ImageIcon(currentPath);
//            _mainLabel = new JLabel(_image1);
//            add(_mainLabel);
        } catch (Exception ex) {
            Logger.getLogger(testBarCode.class.getName()).log(Level.SEVERE, null, ex);
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

}
