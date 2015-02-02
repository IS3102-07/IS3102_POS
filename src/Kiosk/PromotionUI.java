package Kiosk;

import java.awt.Color;
import java.awt.Container;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import operationalcrm.promotionalsales.PromotionalSalesWebService;
import operationalcrm.promotionalsales.PromotionalSalesWebService_Service;

public class PromotionUI extends javax.swing.JFrame {

    private Container cp;
    private int currentPos;
    private List<String> images;
    private URL url;

    public PromotionUI() {
        try {
            this.setTitle("Island Furniture - Kiosk");
            this.setSize(1600, 900);
            cp = getContentPane();
            cp.setBackground(Color.white);
            initComponents();
            dispose();
            setUndecorated(true);

            //call webservice
            images = getActivePromotionInCountry(Kiosk.storeID);
            currentPos = 0;

            url = new URL("http://192.168.1.200:8080" + images.get(currentPos));
            imageLabel.setIcon(new ImageIcon(url));
        } catch (MalformedURLException ex) {
            Logger.getLogger(PromotionUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHader = new javax.swing.JPanel();
        lblHeader2 = new javax.swing.JLabel();
        centerFrame = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        lblLeft = new javax.swing.JLabel();
        lblRight = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        centerFrame.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout centerFrameLayout = new javax.swing.GroupLayout(centerFrame);
        centerFrame.setLayout(centerFrameLayout);
        centerFrameLayout.setHorizontalGroup(
            centerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerFrameLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 1106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        centerFrameLayout.setVerticalGroup(
            centerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnReturn.setBackground(new java.awt.Color(153, 0, 0));
        btnReturn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setText("Return to Main Menu");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        lblLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left.png"))); // NOI18N
        lblLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLeftMousePressed(evt);
            }
        });

        lblRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/right.png"))); // NOI18N
        lblRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRightMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblLeft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(centerFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(lblRight)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(666, 666, 666)
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(centerFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(lblRight)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLeft)
                .addGap(327, 327, 327))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        KioskUI kioskUI = new KioskUI();
        kioskUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void lblRightMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRightMousePressed
        if (currentPos < images.size() - 1) {
            try {
                currentPos++;
                url = new URL("http://192.168.1.200:8080" + images.get(currentPos));
                                System.out.println(url);
                imageLabel.setIcon(new ImageIcon(url));
                revalidate();
                repaint();
            } catch (MalformedURLException ex) {
                Logger.getLogger(PromotionUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblRightMousePressed

    private void lblLeftMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLeftMousePressed
        if (currentPos > 0) {
            try {
                currentPos--;
                url = new URL("http://192.168.1.200:8080" + images.get(currentPos));
                imageLabel.setIcon(new ImageIcon(url));
                revalidate();
                repaint();
            } catch (MalformedURLException ex) {
                Logger.getLogger(PromotionUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblLeftMousePressed

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
            java.util.logging.Logger.getLogger(PromotionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PromotionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PromotionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PromotionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PromotionUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JPanel centerFrame;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel lblHeader2;
    private javax.swing.JLabel lblLeft;
    private javax.swing.JLabel lblRight;
    private javax.swing.JPanel pnlHader;
    // End of variables declaration//GEN-END:variables

    private static java.util.List<java.lang.String> getActivePromotionInCountry(java.lang.Long storeID) {
        PromotionalSalesWebService_Service service = new PromotionalSalesWebService_Service();
        PromotionalSalesWebService port = service.getPromotionalSalesWebServicePort();
        return port.getActivePromotionInCountry(storeID);
    }

}
