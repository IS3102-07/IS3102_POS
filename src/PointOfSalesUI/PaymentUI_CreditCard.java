package PointOfSalesUI;

import POS.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;

public class PaymentUI_CreditCard extends javax.swing.JPanel {

    private List<LineItem> lineItems;

    public PaymentUI_CreditCard() {
        initComponents();
        this.setSize(607, 400);
        txtCreditNumber.requestFocus();;

        String string1 = String.format("%-9s", "Sub Total");
        String string2 = String.format("%9s", POS.transaction.getTotalPrice());
        String line1 = string1 + string2;

        String string11 = String.format("%-9s", POS.transaction.getDiscountRate() + "%");
        String string22 = String.format("%10s", "[" + POS.transaction.getNetPrice() + "]");
        String line2 = string11 + string22;
        //POS.displayPoleMessage(line1, line2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtCreditNumber = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Swipe Credit Card:");

        txtCreditNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCreditNumberKeyReleased(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(153, 0, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-small.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mastercard-curved-64px.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visa-curved-64px.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/american-express-curved-64px.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/maestro-curved-64px.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/discover-curved-64px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(411, 411, 411)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCreditNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtCreditNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCreditNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreditNumberKeyReleased
        //prepare to submit sales record to web service
        POS.transactionCompleted = true;
        List<String> SKUs = new ArrayList();
        List<Integer> quantities = new ArrayList();

        lineItems = POS.transaction.getLineItems();
        for (int i = 0; i < lineItems.size(); i++) {
            SKUs.add(lineItems.get(i).getSKU());
            quantities.add(lineItems.get(i).getQuantity());
        }

        int pointsDeducting = 0;
        if (POS.transaction.getDiscountRate() == 10) {
            pointsDeducting = 150;
        } else if (POS.transaction.getDiscountRate() == 15) {
            pointsDeducting = 300;
        } else if (POS.transaction.getDiscountRate() == 20) {
            pointsDeducting = 500;
        }

        String memberEmail = "";
        if (POS.transaction.getMember() != null) {
            memberEmail = POS.transaction.getMember().getEmail();
        }

        try {
            submitSalesRecord(POS.staffEmail, new String(POS.staffPassword), POS.storeID, POS.POSName, SKUs, quantities, POS.transaction.getTotalPrice(), POS.transaction.getNetPrice(), POS.transaction.getDiscountPrice(), pointsDeducting, memberEmail);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        //print receipt
        printReceipt();

        //display pole message
        String string1 = String.format("%20s", "Come back again!");
        //POS.displayPoleMessage("Thank you!", string1);

        //done with submit sales record
        JDialog dialog = new JDialog();
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        final int x = (screenSize.width - dialog.getWidth()) / 4;
        final int y = (screenSize.height - dialog.getHeight()) / 4;
        dialog.setLocation(x, y);
        dialog.setModal(true);
        dialog.setUndecorated(true);
        dialog.add(new ProcessPaymentUI());
        dialog.pack();
        dialog.setVisible(true);

        //reset
        String line2 = String.format("%20s", "Island Furniture!");
        //POS.displayPoleMessage("Welcome to", line2);

        txtCreditNumber.setText("");
        Window w = SwingUtilities.getWindowAncestor(PaymentUI_CreditCard.this);
        w.setVisible(false);


    }//GEN-LAST:event_txtCreditNumberKeyReleased

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        txtCreditNumber.setText("");
        Window w = SwingUtilities.getWindowAncestor(PaymentUI_CreditCard.this);
        w.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCreditNumber;
    // End of variables declaration//GEN-END:variables

    private void printReceipt() {

    }

    private static ReturnHelper submitSalesRecord(java.lang.String staffEmail, java.lang.String password, java.lang.Long storeID, java.lang.String posName, java.util.List<java.lang.String> itemsPurchasedSKU, java.util.List<java.lang.Integer> itemsPurchasedQty, java.lang.Double amountDue, java.lang.Double amountPaid, java.lang.Double amountPaidUsingPoints, java.lang.Integer loyaltyPointsDeducted, java.lang.String memberEmail) {
        PointOfSalesUI.SalesReportingWebService_Service service = new PointOfSalesUI.SalesReportingWebService_Service();
        PointOfSalesUI.SalesReportingWebService port = service.getSalesReportingWebServicePort();
        return port.submitSalesRecord(staffEmail, password, storeID, posName, itemsPurchasedSKU, itemsPurchasedQty, amountDue, amountPaid, amountPaidUsingPoints, loyaltyPointsDeducted, memberEmail);
    }

}