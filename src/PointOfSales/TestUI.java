package PointOfSales;

import gnu.io.CommPortIdentifier;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import javax.swing.JOptionPane;

public class TestUI extends javax.swing.JFrame {

    private Boolean startCreditCardMSR = false;
    private final String partnerPoleDisplayCOMPort = "COM4";
    private OutputStream partnerPoleDisplayOutputStream;
    SerialPort serialPort;
    private String creditCardNo;

    public TestUI() {
        initComponents();
        this.setSize(1280, 960);
        creditCardNo = "%B5264710306692512^ /NEO WEI                 ^16092210000000000000  449      ?";
        lbltest.setText(creditCardNo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnTestPole = new javax.swing.JButton();
        btnTestPrinter = new javax.swing.JButton();
        txtSwipeInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtReceiptMessage = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnTestCard = new javax.swing.JButton();
        lbltest = new javax.swing.JLabel();
        btnTestPole1 = new javax.swing.JButton();
        btnTestPole2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Island Furniture Test");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );

        btnTestPole.setBackground(new java.awt.Color(255, 255, 204));
        btnTestPole.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnTestPole.setText("Test Pole");
        btnTestPole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestPoleActionPerformed(evt);
            }
        });

        btnTestPrinter.setBackground(new java.awt.Color(255, 255, 204));
        btnTestPrinter.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnTestPrinter.setText("Test Printer");
        btnTestPrinter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestPrinterActionPerformed(evt);
            }
        });

        txtSwipeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSwipeInputActionPerformed(evt);
            }
        });
        txtSwipeInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSwipeInputKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Credit Card Number:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Receipt Message");

        btnClear.setBackground(new java.awt.Color(255, 255, 204));
        btnClear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnTestCard.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTestCard.setText("Test Credit Card Saving");
        btnTestCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestCardActionPerformed(evt);
            }
        });

        lbltest.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbltest.setText("Test");

        btnTestPole1.setBackground(new java.awt.Color(255, 255, 204));
        btnTestPole1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnTestPole1.setText("Stop Poke");
        btnTestPole1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestPole1ActionPerformed(evt);
            }
        });

        btnTestPole2.setBackground(new java.awt.Color(255, 255, 204));
        btnTestPole2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnTestPole2.setText("Test Pole");
        btnTestPole2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestPole2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(101, 101, 101)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtReceiptMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                        .addComponent(txtSwipeInput))
                                    .addGap(68, 68, 68)
                                    .addComponent(btnClear))
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTestPole, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTestPole2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnTestPrinter, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnTestPole1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTestCard, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltest))))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSwipeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtReceiptMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTestPole1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(btnTestPole, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnTestPrinter, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTestPole2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(lbltest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTestCard, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTestPoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestPoleActionPerformed
        byte[] clear = {0x0C};
        byte[] newLine = {0x0A};
        byte[] carriageReturn = {0x0D};
        byte[] message1 = new String("Hello World!").getBytes();
        byte[] message2 = new String("Jason SIM?").getBytes();
        try {
            partnerPoleDisplayOutputStream.write(clear);
            partnerPoleDisplayOutputStream.write(message1);
            partnerPoleDisplayOutputStream.write(newLine);
            partnerPoleDisplayOutputStream.write(carriageReturn);
            partnerPoleDisplayOutputStream.write(message2);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Unable to write to Partner Pole Display: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTestPoleActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //mainMenuUI.setVisible(true);

        if (serialPort != null) {
            try {
                byte[] clear = {0x0C};
                partnerPoleDisplayOutputStream.write(clear);
                partnerPoleDisplayOutputStream.close();
                serialPort.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_formWindowClosed

    private void txtSwipeInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSwipeInputKeyReleased
        String kbValue = txtSwipeInput.getText();

        if (!startCreditCardMSR) {
            if (kbValue != null && kbValue.trim().length() > 0) {
                kbValue = kbValue.trim();

                if (kbValue.length() >= 2) {
                    if (kbValue.startsWith("%B")) {
                        startCreditCardMSR = true;
                    }
                }
            }
        } else {
            if (kbValue != null && kbValue.trim().length() > 0) {
                kbValue = kbValue.trim();

                if (kbValue.length() >= 2) {
                    if (kbValue.endsWith("?")) {
                        startCreditCardMSR = false;
                    }
                }
            }
        }
    }//GEN-LAST:event_txtSwipeInputKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtSwipeInput.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String kbValue = txtSwipeInput.getText();

                if (kbValue != null && kbValue.trim().length() > 0) {
                    kbValue = kbValue.trim();
                    JOptionPane.showMessageDialog(null, kbValue, "Detected Keyboard Input", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        initPartnerPoleDisplay();
    }//GEN-LAST:event_formWindowOpened

    private void btnTestPrinterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestPrinterActionPerformed
        testPartnerThermalPrinterAndCashBox();
    }//GEN-LAST:event_btnTestPrinterActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtSwipeInput.setText(null);
        txtSwipeInput.requestFocus();
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSwipeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSwipeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSwipeInputActionPerformed

    private void btnTestCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestCardActionPerformed
        Boolean startCreditCardMSR1 = false;
        String kbValue = lbltest.getText();

        System.out.println("startCreditCardMSR1: " + startCreditCardMSR1);
        System.out.println("kbValue: " + kbValue);

        if (!startCreditCardMSR1) {
            if (kbValue != null && kbValue.trim().length() > 0) {
                kbValue = kbValue.trim();

                if (kbValue.length() >= 2) {
                    if (kbValue.startsWith("%B")) {
                        startCreditCardMSR1 = true;
                    }
                }
            }
        }
        if (startCreditCardMSR1) {
            if (kbValue != null && kbValue.trim().length() > 0) {
                kbValue = kbValue.trim();

                if (kbValue.length() >= 2) {
                    if (kbValue.endsWith("?")) {
                        startCreditCardMSR1 = false;
                        JOptionPane.showMessageDialog(null, kbValue, "Detected Credit Card MSR Input", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnTestCardActionPerformed

    private void btnTestPole1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestPole1ActionPerformed
        if (serialPort != null) {
            try {
                byte[] clear = {0x0C};
                partnerPoleDisplayOutputStream.write(clear);
                partnerPoleDisplayOutputStream.close();
                serialPort.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnTestPole1ActionPerformed

    private void btnTestPole2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestPole2ActionPerformed
        byte[] clear = {0x0C};
        byte[] newLine = {0x0A};
        byte[] carriageReturn = {0x0D};
        byte[] message1 = new String("Yang!").getBytes();
        byte[] message2 = new String("IS3102?").getBytes();
        try {
            partnerPoleDisplayOutputStream.write(clear);
            partnerPoleDisplayOutputStream.write(message1);
            partnerPoleDisplayOutputStream.write(newLine);
            partnerPoleDisplayOutputStream.write(carriageReturn);
            partnerPoleDisplayOutputStream.write(message2);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Unable to write to Partner Pole Display: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTestPole2ActionPerformed

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
            java.util.logging.Logger.getLogger(TestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnTestCard;
    private javax.swing.JButton btnTestPole;
    private javax.swing.JButton btnTestPole1;
    private javax.swing.JButton btnTestPole2;
    private javax.swing.JButton btnTestPrinter;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbltest;
    private javax.swing.JTextField txtReceiptMessage;
    private javax.swing.JTextField txtSwipeInput;
    // End of variables declaration//GEN-END:variables

    private void initPartnerPoleDisplay() {

        //  Enumeration<CommPortIdentifier> numPorts = CommPortIdentifier.getPortIdentifiers();
//        while (numPorts.hasMoreElements()) {
//            CommPortIdentifier commPortIdentifier = numPorts.nextElement();
//            System.out.println(commPortIdentifier.getName());
//        }
        Enumeration<CommPortIdentifier> commPortList = CommPortIdentifier.getPortIdentifiers();

        while (commPortList.hasMoreElements()) {
            CommPortIdentifier commPort = (CommPortIdentifier) commPortList.nextElement();
            //commPort.getPortType() == CommPortIdentifier.PORT_SERIAL && 
            if (commPort.getName().equals(partnerPoleDisplayCOMPort)) {

                try {
                    serialPort = (SerialPort) commPort.open("UnifiedPointOfSale", 5000);
                    partnerPoleDisplayOutputStream = serialPort.getOutputStream();
                } catch (PortInUseException | IOException ex) {
                    JOptionPane.showMessageDialog(null, "Unable to initialize Partner Pole Display: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private void testPartnerThermalPrinterAndCashBox() {
        ReadReceipt pr = new ReadReceipt();
        try {
            Double margin = 1.0;
            Integer lines = 16;

            PrinterJob printerJob = PrinterJob.getPrinterJob();
            PageFormat pageFormat = printerJob.defaultPage();
            Paper paper = new Paper();
            paper.setSize(180.00, 200.00);
            //paper.setSize(180.0, (double) (paper.getHeight() + 100));
            paper.setImageableArea(margin, margin, paper.getWidth(), paper.getHeight() - margin * 2);
            pageFormat.setPaper(paper);
            pageFormat.setOrientation(PageFormat.PORTRAIT);
            txtReceiptMessage.setText("12345678901234567890123456");
    //txtReceiptMessage.setText(POS.test);
            printerJob.setPrintable(txtReceiptMessage.getPrintable(null, null), pageFormat);
            printerJob.print();
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, "Unable to print to Partner Thermal Printer: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
