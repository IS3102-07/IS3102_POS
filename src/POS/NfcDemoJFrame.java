package POS;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.ByteBuffer;
import javax.smartcardio.Card;
import javax.smartcardio.CardChannel;
import javax.smartcardio.CardException;
import javax.smartcardio.CardTerminal;
import javax.smartcardio.TerminalFactory;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class NfcDemoJFrame extends javax.swing.JFrame {

    private CardTerminal acr122uCardTerminal = null;

    public NfcDemoJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPaneMain = new javax.swing.JScrollPane();
        jTextAreaMain = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAttachedReader = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCardPresent = new javax.swing.JTextField();
        jButtonAPDUGetUID = new javax.swing.JButton();
        jButtonAPDULoadAuthenticationKey = new javax.swing.JButton();
        jButtonAPDUAuthentication = new javax.swing.JButton();
        jButtonAPDUReadBinaryBlock = new javax.swing.JButton();
        jButtonAPDUUpdateBinaryBlock1 = new javax.swing.JButton();
        jButtonAPDUUpdateBinaryBlock2 = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("NFC Demo");

        jTextAreaMain.setColumns(20);
        jTextAreaMain.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextAreaMain.setRows(5);
        jScrollPaneMain.setViewportView(jTextAreaMain);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Attached Reader:");

        jTextFieldAttachedReader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Card Present:");

        jTextFieldCardPresent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldCardPresent.setForeground(new java.awt.Color(255, 0, 0));
        jTextFieldCardPresent.setText("No");

        jButtonAPDUGetUID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAPDUGetUID.setText("Get UID");
        jButtonAPDUGetUID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAPDUGetUIDActionPerformed(evt);
            }
        });

        jButtonAPDULoadAuthenticationKey.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAPDULoadAuthenticationKey.setText("Load Authentication Key");
        jButtonAPDULoadAuthenticationKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAPDULoadAuthenticationKeyActionPerformed(evt);
            }
        });

        jButtonAPDUAuthentication.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAPDUAuthentication.setText("Authentication");
        jButtonAPDUAuthentication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAPDUAuthenticationActionPerformed(evt);
            }
        });

        jButtonAPDUReadBinaryBlock.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAPDUReadBinaryBlock.setText("Read Binary Block");
        jButtonAPDUReadBinaryBlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAPDUReadBinaryBlockActionPerformed(evt);
            }
        });

        jButtonAPDUUpdateBinaryBlock1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAPDUUpdateBinaryBlock1.setText("Update Binary Block 1");
        jButtonAPDUUpdateBinaryBlock1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAPDUUpdateBinaryBlock1ActionPerformed(evt);
            }
        });

        jButtonAPDUUpdateBinaryBlock2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAPDUUpdateBinaryBlock2.setText("Update Binary Block 2");
        jButtonAPDUUpdateBinaryBlock2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAPDUUpdateBinaryBlock2ActionPerformed(evt);
            }
        });

        jButtonClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonAPDUUpdateBinaryBlock1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonAPDUGetUID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButtonAPDULoadAuthenticationKey)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonAPDUAuthentication)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonAPDUReadBinaryBlock))
                                    .addComponent(jButtonAPDUUpdateBinaryBlock2, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneMain)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldAttachedReader, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldCardPresent, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldAttachedReader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCardPresent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPaneMain, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAPDUGetUID)
                    .addComponent(jButtonAPDULoadAuthenticationKey)
                    .addComponent(jButtonAPDUAuthentication)
                    .addComponent(jButtonAPDUReadBinaryBlock))
                .addGap(44, 44, 44)
                .addComponent(jButtonAPDUUpdateBinaryBlock1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAPDUUpdateBinaryBlock2)
                    .addComponent(jButtonClear))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        jScrollPaneMain.setViewportView(jTextAreaMain);

        try {
            ActionListener actionListenerQuitOnNoReaderAttached = new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    quitOnNoReaderAttached();
                }
            };

            Timer timerQuitOnNoReaderAttached = new Timer(5000, actionListenerQuitOnNoReaderAttached);
            timerQuitOnNoReaderAttached.setRepeats(false);
            timerQuitOnNoReaderAttached.start();

            TerminalFactory terminalFactory = TerminalFactory.getDefault();

            if (!terminalFactory.terminals().list().isEmpty()) {
                for (CardTerminal cardTerminal : terminalFactory.terminals().list()) {
                    if (cardTerminal.getName().contains("ACS ACR122")) {
                        acr122uCardTerminal = cardTerminal;

                        break;
                    }
                }

                if (acr122uCardTerminal != null) {
                    timerQuitOnNoReaderAttached.stop();

                    jTextFieldAttachedReader.setText(acr122uCardTerminal.getName());

                    ActionListener actionListenerCheckCardPresent = new ActionListener() {
                        public void actionPerformed(ActionEvent event) {
                            checkCardPresent();
                        }
                    };

                    Timer timerCheckCardPresent = new Timer(1000, actionListenerCheckCardPresent);
                    timerCheckCardPresent.setRepeats(true);
                    timerCheckCardPresent.start();

                    JOptionPane.showMessageDialog(this, "ACS ACR122U Reader detected successfully", "Reader Detected Successful", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Unable to detect ACS ACR122U Reader", "Reader Detected Failure", JOptionPane.ERROR_MESSAGE);
                    this.setVisible(false);
                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "No card reader is attached", "Reader Detected Failure", JOptionPane.ERROR_MESSAGE);
                this.setVisible(false);
                this.dispose();
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButtonAPDUGetUIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAPDUGetUIDActionPerformed
        byte[] byteArrayReadUID = {(byte) 0xFF, (byte) 0xCA, (byte) 0x00, (byte) 0x00, (byte) 0x00};

        jTextAreaMain.append("Get UID: " + connectToCard(byteArrayReadUID) + "\r\n");
    }//GEN-LAST:event_jButtonAPDUGetUIDActionPerformed

    private void jButtonAPDULoadAuthenticationKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAPDULoadAuthenticationKeyActionPerformed
        byte[] byteArrayLoadAuthenticationKey = {(byte) 0xFF, (byte) 0x82, (byte) 0x00, (byte) 0x00, (byte) 0x06, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};

        jTextAreaMain.append("Load Authentication Key: " + connectToCard(byteArrayLoadAuthenticationKey) + "\r\n");
    }//GEN-LAST:event_jButtonAPDULoadAuthenticationKeyActionPerformed

    private void jButtonAPDUAuthenticationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAPDUAuthenticationActionPerformed
        byte[] byteArrayAuthentication = {(byte) 0xFF, (byte) 0x86, (byte) 0x00, (byte) 0x00, (byte) 0x05, (byte) 0x01, (byte) 0x00, (byte) 0x04, (byte) 0x60, (byte) 0x00};

        jTextAreaMain.append("Authentication Block 0x04: " + connectToCard(byteArrayAuthentication) + "\r\n");
    }//GEN-LAST:event_jButtonAPDUAuthenticationActionPerformed

    private void jButtonAPDUReadBinaryBlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAPDUReadBinaryBlockActionPerformed
        byte[] byteArrayRead0 = {(byte) 0xFF, (byte) 0xB0, (byte) 0x00, (byte) 0x00, (byte) 0x10};

        jTextAreaMain.append("Read Binary Block 0x00: " + connectToCard(byteArrayRead0) + "\r\n");

        byte[] byteArrayRead1 = {(byte) 0xFF, (byte) 0xB0, (byte) 0x00, (byte) 0x01, (byte) 0x10};

        jTextAreaMain.append("Read Binary Block 0x01: " + connectToCard(byteArrayRead1) + "\r\n");

        byte[] byteArrayRead2 = {(byte) 0xFF, (byte) 0xB0, (byte) 0x00, (byte) 0x02, (byte) 0x10};

        jTextAreaMain.append("Read Binary Block 0x02: " + connectToCard(byteArrayRead2) + "\r\n");

        byte[] byteArrayRead3 = {(byte) 0xFF, (byte) 0xB0, (byte) 0x00, (byte) 0x03, (byte) 0x10};

        jTextAreaMain.append("Read Binary Block 0x03: " + connectToCard(byteArrayRead3) + "\r\n");

        byte[] byteArrayRead4 = {(byte) 0xFF, (byte) 0xB0, (byte) 0x00, (byte) 0x04, (byte) 0x10};

        jTextAreaMain.append("Read Binary Block 0x04: " + connectToCard(byteArrayRead4) + "\r\n");
    }//GEN-LAST:event_jButtonAPDUReadBinaryBlockActionPerformed

    private void jButtonAPDUUpdateBinaryBlock1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAPDUUpdateBinaryBlock1ActionPerformed
        byte[] byteArrayUpdate1 = {(byte) 0xFF, (byte) 0xD6, (byte) 0x00, (byte) 0x04, (byte) 0x10, (byte) 0x00, (byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04, (byte) 0x05, (byte) 0x06, (byte) 0x07, (byte) 0x08, (byte) 0x09, (byte) 0x0A, (byte) 0x0B, (byte) 0x0C, (byte) 0x0D, (byte) 0x0E, (byte) 0x0F};

        jTextAreaMain.append("Update Binary Block 1 0x04: " + connectToCard(byteArrayUpdate1) + "\r\n");
    }//GEN-LAST:event_jButtonAPDUUpdateBinaryBlock1ActionPerformed

    private void jButtonAPDUUpdateBinaryBlock2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAPDUUpdateBinaryBlock2ActionPerformed
        byte[] byteArrayUpdate1 = {(byte) 0xFF, (byte) 0xD6, (byte) 0x00, (byte) 0x04, (byte) 0x10, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00};

        jTextAreaMain.append("Update Binary Block 1 0x04: " + connectToCard(byteArrayUpdate1) + "\r\n");
    }//GEN-LAST:event_jButtonAPDUUpdateBinaryBlock2ActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        jTextAreaMain.setText("");
    }//GEN-LAST:event_jButtonClearActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NfcDemoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NfcDemoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NfcDemoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NfcDemoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NfcDemoJFrame nfcDemoJFrame = new NfcDemoJFrame();
                nfcDemoJFrame.setVisible(true);
                //nfcDemoJFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    private void quitOnNoReaderAttached() {
        JOptionPane.showMessageDialog(this, "No card reader is attached", "Reader Detected Failure", JOptionPane.ERROR_MESSAGE);
        this.setVisible(false);
        this.dispose();
    }

    private void checkCardPresent() {
        try {
            if (acr122uCardTerminal.isCardPresent()) {
                jTextFieldCardPresent.setText("Yes");
                jTextFieldCardPresent.setForeground(Color.GREEN);
            } else {
                jTextFieldCardPresent.setText("No");
                jTextFieldCardPresent.setForeground(Color.RED);
            }
        } catch (Exception ex) {
        }
    }

    private String connectToCard(byte[] byteArrayReadUID) {
        try {
            acr122uCardTerminal.waitForCardPresent(0);
            Card card = acr122uCardTerminal.connect("T=1");
            CardChannel cardChannel = card.getBasicChannel();

            return send(byteArrayReadUID, cardChannel);
        } catch (Exception ex) {
            return "";
        }
    }

    public String send(byte[] command, CardChannel cardChannel) {
        String response = "";

        byte[] byteArrayResponse = new byte[258];
        ByteBuffer bufferedCommand = ByteBuffer.wrap(command);
        ByteBuffer bufferedResponse = ByteBuffer.wrap(byteArrayResponse);

        // output = The length of the received response APDU
        int output = 0;

        try {
            output = cardChannel.transmit(bufferedCommand, bufferedResponse);
        } catch (CardException ex) {
            ex.printStackTrace();
        }

        for (int i = 0; i < output; i++) {
            response += String.format("%02X", byteArrayResponse[i]);
        }

        return response;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAPDUAuthentication;
    private javax.swing.JButton jButtonAPDUGetUID;
    private javax.swing.JButton jButtonAPDULoadAuthenticationKey;
    private javax.swing.JButton jButtonAPDUReadBinaryBlock;
    private javax.swing.JButton jButtonAPDUUpdateBinaryBlock1;
    private javax.swing.JButton jButtonAPDUUpdateBinaryBlock2;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPaneMain;
    private javax.swing.JTextArea jTextAreaMain;
    private javax.swing.JTextField jTextFieldAttachedReader;
    private javax.swing.JTextField jTextFieldCardPresent;
    // End of variables declaration//GEN-END:variables
}
