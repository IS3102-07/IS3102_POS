package PointOfSalesUI;

import POS.*;
import java.awt.Color;
import java.awt.Window;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.SwingUtilities;

public class PaymentUI_Cash extends javax.swing.JPanel {

    private List<LineItem> lineItems;
    private Date date;

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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReceiptMessage = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

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

        txtReceiptMessage.setContentType("text/html"); // NOI18N
        jScrollPane1.setViewportView(txtReceiptMessage);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnComplete)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnConputeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConputeActionPerformed
        try {
            double received = Integer.parseInt(txtReceived.getText());
            double change = POS.transaction.getNetPrice() - received;

            if (received < POS.transaction.getNetPrice()) {
                txtReceived.setForeground(Color.red);
            } else {
                txtReceived.setForeground(Color.black);
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

                try {
                    if (POS.staffEmail != null && POS.staffPassword != null) {
                        date = new Date();

                        submitSalesRecord(POS.staffEmail, new String(POS.staffPassword), POS.storeID, POS.name, SKUs, quantities, POS.transaction.getTotalPrice(), POS.transaction.getNetPrice(), POS.transaction.getDiscountPrice(), pointsDeducting, memberEmail, date.getTime() + "");

                        //print receipt
                        printReceipt();

                        //display pole message
                        String string1 = String.format("%20s", "Come back again!");
                        //POS.displayPoleMessage("Thank you!", string1);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } catch (Exception ex) {
            txtReceived.setForeground(Color.red);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtChange;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextPane txtReceiptMessage;
    private javax.swing.JTextField txtReceived;
    // End of variables declaration//GEN-END:variables

    private void printReceipt() {
        try {
            Double margin = 1.0;
            Integer lines = 50;
            PrinterJob printerJob = PrinterJob.getPrinterJob();
            PageFormat pageFormat = printerJob.defaultPage();
            Paper paper = new Paper();
            paper.setSize(180.0, (double) (paper.getHeight() + lines * 10.0));

            paper.setImageableArea(margin, margin, paper.getWidth() - margin * 2, paper.getHeight() - margin * 2);
            pageFormat.setPaper(paper);
            pageFormat.setOrientation(PageFormat.PORTRAIT);

            lineItems = POS.transaction.getLineItems();

            //formating receipt
            String receiptString1 = "<html><table><tr align='center'><td colspan=\"2\"><b>Island Furniture<br>"
                    + "" + POS.storeAddress + "<br>"
                    + "" + POS.storeCountry + " " + POS.storePostal + "</b></td></tr>";

            //if member - card
            if (POS.transaction.getDiscountPrice() > 0) {
                receiptString1 += "<tr align='center'><td colspan=\"2\">Member " + POS.transaction.getMember().loyaltyCardId + "<br>"
                        + "Teir: " + POS.transaction.getMember().loyaltyTier + "</td></tr>";
            }
            receiptString1 += "<tr><td colspan=\"2\">------------------------------------------</td></tr><tr><td>Description</td><td>Amount</td></tr>";

            //loop items
            for (int i = 0; i < lineItems.size(); i++) {
                String receipLineItem = lineItems.get(i).getQuantity() + " " + lineItems.get(i).getDescription();
                if (receipLineItem.length() > 15) {
                    receipLineItem = receipLineItem.substring(0, 15);
                }

                receiptString1 += "<tr><td>" + receipLineItem + "</td><td>" + lineItems.get(i).getPrice() + "</td></tr>";
            }

            receiptString1 += "<tr><td colspan=\"2\">------------------------------------------</td></tr>";

            //if member - disc
            if (POS.transaction.getDiscountPrice() > 0) {
                receiptString1 += "<tr><td>Subtotal </td><td>" + POS.transaction.getTotalPrice() + "</td></tr>";
                receiptString1 += "<tr><td>&nbsp Member Disc</td>" + "<td>- " + POS.transaction.getDiscountPrice() + "</td></tr>";
            }

            //total price
            receiptString1 += "<tr><td>Total</td><td>" + POS.transaction.getNetPrice() + "</td></tr><tr>"
                    + "<td>Item Count</td><td>" + POS.transaction.getTotalItems() + "</td></tr>"
                    + "<tr><td colspan=\"2\">------------------------------------------</td></tr>";

            //receipt no
            receiptString1 += "<tr align='center'><td colspan=\"2\">Receipt: " + date.getTime() + "<br>";

            //receipt date
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy hh:mm a");
            receiptString1 += "Date: " + sdf.format(date) + "<br>";

            //POS name and cashier
            receiptString1 += "" + POS.name + "<br>"
                    + "Cashier: " + POS.staffName + "</td></tr>"
                    + "<tr><td colspan=\"2\">------------------------------------------</td></tr>"
                    + "<tr align='center'><td colspan=\"2\">Thank you for <br>Shopping at Island Furniture!</td></tr></table></html>";

            txtReceiptMessage.setText(receiptString1);
            printerJob.setPrintable(txtReceiptMessage.getPrintable(null, null), pageFormat);
            if (printerJob.printDialog()) {
                printerJob.print();
            }
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }

    private static Boolean submitSalesRecord(java.lang.String staffEmail, java.lang.String password, java.lang.Long storeID, java.lang.String posName, java.util.List<java.lang.String> itemsPurchasedSKU, java.util.List<java.lang.Integer> itemsPurchasedQty, java.lang.Double amountDue, java.lang.Double amountPaid, java.lang.Double amountPaidUsingPoints, java.lang.Integer loyaltyPointsDeducted, java.lang.String memberEmail, java.lang.String receiptNo) {
        PointOfSalesUI.SalesReportingWebService_Service service = new PointOfSalesUI.SalesReportingWebService_Service();
        PointOfSalesUI.SalesReportingWebService port = service.getSalesReportingWebServicePort();
        return port.submitSalesRecord(staffEmail, password, storeID, posName, itemsPurchasedSKU, itemsPurchasedQty, amountDue, amountPaid, amountPaidUsingPoints, loyaltyPointsDeducted, memberEmail, receiptNo);
    }

}
