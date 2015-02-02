package PointOfSalesUI;

import POS.*;
import com.onbarcode.barcode.Code128;
import java.awt.Color;
import java.awt.Window;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.SwingUtilities;
import storetransaction.retailinventory.RetailInventoryWebService;
import storetransaction.retailinventory.RetailInventoryWebService_Service;
import storetransaction.salesreporting.SalesReportingWebService;
import storetransaction.salesreporting.SalesReportingWebService_Service;

public class PaymentUI_Cash extends javax.swing.JPanel {

    private List<LineItem> lineItems;
    private Date date;
    final String filePath = new File("").getAbsolutePath();
    private DecimalFormat df = new DecimalFormat("#.00");

    public PaymentUI_Cash() {
        initComponents();
        txtPrice.setText(POS.transaction.getNetPrice() + "");

        String string1 = String.format("%-9s", "Sub Total");
        String string2 = String.format("%9s", df.format(POS.transaction.getTotalPrice()));
        String line1 = string1 + string2;

        String string11 = String.format("%-9s", df.format(POS.transaction.getDiscountRate()) + "%");
        String string22 = String.format("%10s", "[" + df.format(POS.transaction.getNetPrice()) + "]");
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
        btnBack = new javax.swing.JButton();

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

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnConpute, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtChange)
                            .addComponent(txtReceived, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConpute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtChange, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnComplete)
                        .addContainerGap(22, Short.MAX_VALUE))
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
            String skuQty = "";

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
                    skuQty += lineItems.get(i).getSKU() + "," + lineItems.get(i).getQuantity() + ",";
                }

                int pointsDeducting = 0;
                if (POS.transaction.getDiscountRate() == 5) {
                    pointsDeducting = 50;
                } else if (POS.transaction.getDiscountRate() == 10) {
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

                        //sales log
                        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(filePath.concat("\\src\\POS\\saleslog.csv"), true)));
                        String salesLog = date.toString() + "," + POS.staffEmail + "," + POS.name + "," + memberEmail + "," + POS.transaction.getTotalPrice() + "," + POS.transaction.getNetPrice() + "," + POS.transaction.getDiscountPrice() + "," + pointsDeducting + ",";
                        salesLog += skuQty;
                        out.println(salesLog);
                        out.close();

                        //print receipt
                        printReceipt();
                        
                        btnConpute.setEnabled(false);

                        //display pole message
                        String string1 = String.format("%20s", "Come back again!");
                        POS.displayPoleMessage("Thank you!", string1);
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
            POS.displayPoleMessage("Welcome to", line2);
            txtChange.setText("");
            txtPrice.setText("");
            txtReceived.setText("");
            Window w = SwingUtilities.getWindowAncestor(PaymentUI_Cash.this);
            w.setVisible(false);
        }
    }//GEN-LAST:event_btnCompleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        txtChange.setText("");
        txtPrice.setText("");
        txtReceived.setText("");
        Window w = SwingUtilities.getWindowAncestor(PaymentUI_Cash.this);
        w.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
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
            Double margin = 1.5;
            Integer lines = 50;
            PrinterJob printerJob = PrinterJob.getPrinterJob();
            PageFormat pageFormat = printerJob.defaultPage();
            Paper paper = new Paper();
            paper.setSize(180.0, (double) (paper.getHeight() + lines * 10.0));

            paper.setImageableArea(margin, margin, paper.getWidth() - margin * 2, paper.getHeight() - margin * 2);
            pageFormat.setPaper(paper);
            pageFormat.setOrientation(PageFormat.PORTRAIT);

            lineItems = POS.transaction.getLineItems();

            //Header
            String receiptString1 = "<html><table><tr align='center'><td colspan=\"2\"><b>Island Furniture<br>"
                    + "" + POS.storeAddress + "<br>"
                    + "" + POS.storeCountry + " " + POS.storePostal + "</b></td></tr>";

            //if member - card
            if (POS.transaction.getMember() != null) {

                String name = POS.transaction.getMember().getName();
                if (name == null) {
                    name = "";
                }

                receiptString1 += "<tr align='center'><td colspan=\"2\">" + name + "<br>"
                        + "Tier: " + POS.transaction.getMember().getLoyaltyTier() + "</td></tr>";
                System.out.println("POS.transaction.getMember().loyaltyTier " + POS.transaction.getMember().getLoyaltyTier());
            }
            receiptString1 += "<tr><td colspan=\"2\">------------------------------------------</td></tr><tr><td>Description</td><td>Amount</td></tr>";

            //loop items
            for (int i = 0; i < lineItems.size(); i++) {
                String receipLineItem = lineItems.get(i).getQuantity() + " x " + lineItems.get(i).getDescription();
                if (receipLineItem.length() > 15) {
                    receipLineItem = receipLineItem.substring(0, 15);
                }

                receiptString1 += "<tr><td>" + receipLineItem + "</td><td>" + df.format(lineItems.get(i).getPrice()) + "</td></tr>";
            }

            receiptString1 += "<tr><td colspan=\"2\">------------------------------------------</td></tr>";

            //if member - disc
            if (POS.transaction.getDiscountPrice() > 0) {
                receiptString1 += "<tr><td>Subtotal </td><td>" + df.format(POS.transaction.getTotalPrice()) + "</td></tr>";
                receiptString1 += "<tr><td>&nbsp Member Disc</td>" + "<td>- " + df.format(POS.transaction.getDiscountPrice()) + "</td></tr>";
            }

            //total price
            receiptString1 += "<tr><td>Total</td><td>" + df.format(POS.transaction.getNetPrice()) + "</td></tr><tr>"
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
                    + "<tr><td colspan=\"2\">------------------------------------------</td></tr>";

            //check if need to print barcode
            if (checkIfCustomerNeedToWaitForPicker(date.getTime() + "")) {
                receiptString1 += "<tr align='center'><td colspan=\"2\">Please proceed<br>to the collection point.</td></tr>";

                Code128 barcode = new Code128();
                barcode.setData(date.getTime() + "");
                barcode.setX(0.5f);

                String currentPath = filePath.concat("\\src\\images\\barcode-code128.png");
                barcode.drawBarcode(currentPath);

                receiptString1 += "<tr align='center'><td colspan=\"2\"><img width='160' src='file:" + currentPath + "'></img></td></tr>";

                String converTimetoString = date.getTime() + "";
                String queueNo = converTimetoString.substring(converTimetoString.length() - 4, converTimetoString.length());
                receiptString1 += "<tr align='center'><td colspan=\"2\">Queue No: " + queueNo + "</td></tr>";

                if (POS.transaction.getMember() != null && POS.transaction.getMember().getPhone() != null && !POS.transaction.getMember().getPhone().equals("")) {
                    receiptString1 += "<tr align='center'><td colspan=\"2\">You will be notify via SMS for the collection.";
                }
            } else {
                receiptString1 += "<tr align='center'><td colspan=\"2\">Thank you for<br>Shopping at Island Furniture!</td></tr>";
            }

            receiptString1 += "</table></html>";

            txtReceiptMessage.setText(receiptString1);
            printerJob.setPrintable(txtReceiptMessage.getPrintable(null, null), pageFormat);
            //if (printerJob.printDialog()) {
            printerJob.print();
            //}
        } catch (PrinterException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static Boolean submitSalesRecord(java.lang.String staffEmail, java.lang.String password, java.lang.Long storeID, java.lang.String posName, java.util.List<java.lang.String> itemsPurchasedSKU, java.util.List<java.lang.Integer> itemsPurchasedQty, java.lang.Double amountDue, java.lang.Double amountPaid, java.lang.Double amountPaidUsingPoints, java.lang.Integer loyaltyPointsDeducted, java.lang.String memberEmail, java.lang.String receiptNo) {
        SalesReportingWebService_Service service = new SalesReportingWebService_Service();
        SalesReportingWebService port = service.getSalesReportingWebServicePort();
        return port.submitSalesRecord(staffEmail, password, storeID, posName, itemsPurchasedSKU, itemsPurchasedQty, amountDue, amountPaid, amountPaidUsingPoints, loyaltyPointsDeducted, memberEmail, receiptNo);
    }

    private static Boolean checkIfCustomerNeedToWaitForPicker(java.lang.String receiptNo) {
        RetailInventoryWebService_Service service = new RetailInventoryWebService_Service();
        RetailInventoryWebService port = service.getRetailInventoryWebServicePort();
        return port.checkIfCustomerNeedToWaitForPicker(receiptNo);
    }

}
