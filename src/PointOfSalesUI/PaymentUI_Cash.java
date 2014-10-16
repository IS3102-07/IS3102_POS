package PointOfSalesUI;

import POS.*;
import java.awt.Color;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class PaymentUI_Cash extends javax.swing.JPanel {

    private List<LineItem> lineItems;

    public PaymentUI_Cash() {
        initComponents();
        txtPrice.setText(POS.transaction.getNetPrice() + "");

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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtChange = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtReceived = new javax.swing.JTextField();
        btnConpute = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Total Price");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Cash Received");

        txtChange.setEditable(false);
        txtChange.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Change Due");

        txtPrice.setEditable(false);
        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtReceived.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        btnConpute.setBackground(new java.awt.Color(255, 153, 51));
        btnConpute.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        btnConpute.setForeground(new java.awt.Color(255, 255, 255));
        btnConpute.setText("Check out");
        btnConpute.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnConpute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConputeActionPerformed(evt);
            }
        });

        btnComplete.setBackground(new java.awt.Color(0, 102, 0));
        btnComplete.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        btnComplete.setForeground(new java.awt.Color(255, 255, 255));
        btnComplete.setText("Done");
        btnComplete.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConpute, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtChange)
                            .addComponent(txtReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(btnConpute)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtChange, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnComplete)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnConputeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConputeActionPerformed
        try {
            String string1 = String.format("%20s", "Come back again!");
            //POS.displayPoleMessage("Thank you!", string1);

            Border defaultLine = txtReceived.getBorder();

            double received = Integer.parseInt(txtReceived.getText());
            double change = POS.transaction.getNetPrice() - received;

            if (received < POS.transaction.getNetPrice()) {
                Border redline = BorderFactory.createLineBorder(Color.red);
                txtReceived.setBorder(redline);
            } else {
                txtReceived.setBorder(defaultLine);
                txtChange.setText(Math.abs(change) + "");

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
                //submitSalesRecord(POS.staffEmail, new String(POS.staffPassword), POS.storeID, POS.POSName, SKUs, quantities, POS.transaction.getTotalPrice(), POS.transaction.getNetPrice(), POS.transaction.getDiscountPrice(), pointsDeducting, memberEmail);
            }
        } catch (Exception ex) {
            Border redline = BorderFactory.createLineBorder(Color.red);
            txtReceived.setBorder(redline);
        }
    }//GEN-LAST:event_btnConputeActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        if (!txtChange.getText().isEmpty()) {
            String line2 = String.format("%20s", "Island Furniture!");
            //POS.displayPoleMessage("Welcome to", line2);
            txtChange.setText("");
            txtPrice.setText("");
            txtReceived.setText("");
            Window w = SwingUtilities.getWindowAncestor(PaymentUI_Cash.this);
            w.setVisible(false);
        }
    }//GEN-LAST:event_btnCompleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnConpute;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtChange;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtReceived;
    // End of variables declaration//GEN-END:variables
}
