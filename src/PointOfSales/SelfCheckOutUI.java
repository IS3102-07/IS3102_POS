package PointOfSales;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SelfCheckOutUI extends javax.swing.JFrame {

    private Container cp;
    private List<LineItem> lineItems;
    private LineItem lineItem;
    private ItemEntity item;
    private ItemCountryEntity itemCountry;
    private String SKUString;

    public SelfCheckOutUI() {
        initComponents();
        this.setTitle("Island Furniture Self Checkout");
        this.setSize(1280, 960);
        cp = getContentPane();
        cp.setBackground(Color.white);
        SKUString = "";
        POS.transaction = new Transaction();
        lineItems = POS.transaction.getLineItems();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHader = new javax.swing.JPanel();
        lblHeader1 = new javax.swing.JLabel();
        btnPay = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLineItem = new javax.swing.JTable();
        btnLoyaltyCard = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnUpdateQuantity = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        btnTest1 = new javax.swing.JButton();
        btnTestContent = new javax.swing.JButton();
        btnTest2 = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

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
                .addGap(162, 162, 162)
                .addComponent(lblHeader1)
                .addContainerGap(273, Short.MAX_VALUE))
        );
        pnlHaderLayout.setVerticalGroup(
            pnlHaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHaderLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(lblHeader1)
                .addGap(45, 45, 45))
        );

        btnPay.setBackground(new java.awt.Color(255, 153, 51));
        btnPay.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        btnPay.setForeground(new java.awt.Color(255, 255, 255));
        btnPay.setText("PAY");
        btnPay.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("N: Items");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Total:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Discount:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("0.00");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("0.00");

        tblLineItem.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tblLineItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Description", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLineItem.setAutoscrolls(false);
        tblLineItem.setGridColor(new java.awt.Color(153, 0, 0));
        tblLineItem.setRowHeight(50);
        tblLineItem.setSelectionBackground(new java.awt.Color(153, 0, 0));
        tblLineItem.getTableHeader().setReorderingAllowed(false);
        tblLineItem.setUpdateSelectionOnSort(false);
        tblLineItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblLineItemKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblLineItem);
        tblLineItem.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tblLineItem.getColumnModel().getColumnCount() > 0) {
            tblLineItem.getColumnModel().getColumn(0).setPreferredWidth(500);
            tblLineItem.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblLineItem.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        btnLoyaltyCard.setBackground(new java.awt.Color(153, 0, 0));
        btnLoyaltyCard.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnLoyaltyCard.setForeground(new java.awt.Color(255, 255, 255));
        btnLoyaltyCard.setText("Loyalty Card");
        btnLoyaltyCard.setBorder(new javax.swing.border.MatteBorder(null));
        btnLoyaltyCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoyaltyCardActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(153, 0, 0));
        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete Item");
        btnDelete.setBorder(new javax.swing.border.MatteBorder(null));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnHelp.setBackground(new java.awt.Color(204, 204, 204));
        btnHelp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHelp.setText("<html><h3 align='center'>Help</h3></htm>");
        btnHelp.setBorder(new javax.swing.border.MatteBorder(null));
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        btnUpdateQuantity.setBackground(new java.awt.Color(153, 0, 0));
        btnUpdateQuantity.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUpdateQuantity.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateQuantity.setText("Update Quantity");
        btnUpdateQuantity.setBorder(new javax.swing.border.MatteBorder(null));
        btnUpdateQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateQuantityActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkout_background.png"))); // NOI18N

        lblMessage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(153, 0, 0));
        lblMessage.setText("lable");

        btnTest1.setText("test add F1");
        btnTest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTest1ActionPerformed(evt);
            }
        });

        btnTestContent.setText("Test Content");
        btnTestContent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestContentActionPerformed(evt);
            }
        });

        btnTest2.setText("test add F2");
        btnTest2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTest2ActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(153, 0, 0));
        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.setBorder(new javax.swing.border.MatteBorder(null));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnTest1)
                        .addGap(5, 5, 5)
                        .addComponent(btnTest2)
                        .addGap(18, 18, 18)
                        .addComponent(btnTestContent)
                        .addGap(18, 18, 18)
                        .addComponent(lblMessage)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(9, 9, 9)))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnHelp, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnPay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnLoyaltyCard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdateQuantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
            .addComponent(pnlHader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdateQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLoyaltyCard, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTest1)
                            .addComponent(btnTestContent)
                            .addComponent(btnTest2)
                            .addComponent(lblMessage))))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        JDialog dialog = new JDialog();
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        final int x = (screenSize.width - dialog.getWidth()) / 4;
        final int y = (screenSize.height - dialog.getHeight()) / 4;
        dialog.setLocation(x, y);
        dialog.setModal(true);
        dialog.setUndecorated(true);
        dialog.add(new PaymentUI());
        dialog.pack();
        dialog.setVisible(true);
        tblLineItem.requestFocus();
    }//GEN-LAST:event_btnPayActionPerformed

    private void btnLoyaltyCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoyaltyCardActionPerformed
        JDialog dialog = new JDialog();
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        final int x = (screenSize.width - dialog.getWidth()) / 4;
        final int y = (screenSize.height - dialog.getHeight()) / 4;
        dialog.setLocation(x, y);
        dialog.setModal(true);
        dialog.setUndecorated(true);
        dialog.add(new LoyaltyCardUI());
        dialog.pack();
        dialog.setVisible(true);
        tblLineItem.requestFocus();
    }//GEN-LAST:event_btnLoyaltyCardActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblLineItem.getModel();
        if (tblLineItem.getSelectedRow() != -1 && tblLineItem.getRowCount() != 0) {
            lineItems.remove(tblLineItem.getSelectedRow());
            model.removeRow(tblLineItem.getSelectedRow());
        }
        tblLineItem.requestFocus();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        tblLineItem.requestFocus();
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnUpdateQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateQuantityActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblLineItem.getModel();
        if (tblLineItem.getSelectedRow() != -1 && tblLineItem.getRowCount() != 0) {
            JDialog dialog = new JDialog();
            dialog.setLocationRelativeTo(null);
            dialog.setModal(true);
            dialog.setUndecorated(true);
            dialog.add(new QuantityUI(lineItems.get(tblLineItem.getSelectedRow()).getQuantity()));
            dialog.pack();
            dialog.setVisible(true);

            lineItems.get(tblLineItem.getSelectedRow()).setQuantity(POS.tmpQty);
            model.setValueAt(POS.tmpQty, tblLineItem.getSelectedRow(), 2);
        }
        tblLineItem.requestFocus();
    }//GEN-LAST:event_btnUpdateQuantityActionPerformed


    private void tblLineItemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblLineItemKeyReleased
        //this is for barcode scanner
        //SKUString= evt.getKeyCode()+ "|"+evt.getKeyChar();
        String currentKeyCode = evt.getKeyCode() + "";
        System.out.println(currentKeyCode);
        if (currentKeyCode.equals("16") || currentKeyCode.equals("17") || currentKeyCode.equals("74")) {
            //ignore
        } else if (currentKeyCode.equals("10")) {
            submitSKU(SKUString);
            SKUString = "";
        } else {
            SKUString += evt.getKeyChar() + "";
        }
    }//GEN-LAST:event_tblLineItemKeyReleased

    private void btnTest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTest1ActionPerformed

        //hard code can delete when done
        String SKU = "F1";
        POS.storeID = 1 + "";

        boolean isExist = false;

        item = getItemBySKU(SKU);
        if (item != null) {

            itemCountry = getItemCountryBySKU(SKU, Long.parseLong(POS.storeID));
            //   if (itemCountry != null) {
            //check arraylist if this lineitem exist, if have increase quantity, 
            for (int i = 0; i < lineItems.size(); i++) {
                if (lineItems.get(i).getSKU().equals(SKU)) {
                    int quantity = lineItems.get(i).getQuantity();
                    lineItems.get(i).setQuantity(++quantity);
                    isExist = true;
                }
            }
            //else add new lineitem to the list
            if (!isExist) {
                lineItem = new LineItem(SKU, item.getName(), 10.00, 1);
                //lineItem = new LineItem(SKU, item.getName(), itemCountry.getRetailPrice(), 1);
                lineItems.add(lineItem);
            }

            //done with adding to List, update the table
            refreshTable();
            // }
        }
    }//GEN-LAST:event_btnTest1ActionPerformed

    private void btnTestContentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestContentActionPerformed
        if (lineItems == null || lineItems.isEmpty()) {
            System.out.println("LineItems is empty");
        } else {
            for (int i = 0; i < lineItems.size(); i++) {
                System.out.println("--------");
                System.out.println("Description " + lineItems.get(i).getDescription());
                System.out.println("SKU " + lineItems.get(i).getSKU());
                System.out.println("Price " + lineItems.get(i).getPrice());
                System.out.println("Qty " + lineItems.get(i).getQuantity());
                System.out.println("--------\n\n");
            }
        }

    }//GEN-LAST:event_btnTestContentActionPerformed

    private void btnTest2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTest2ActionPerformed
        //hard code can delete when done
        String SKU = "F2";
        POS.storeID = 1 + "";

        boolean isExist = false;

        item = getItemBySKU(SKU);
        if (item != null) {
            itemCountry = getItemCountryBySKU(SKU, Long.parseLong(POS.storeID));
            //   if (itemCountry != null) {
            //check arraylist if this lineitem exist, if have increase quantity, 
            for (int i = 0; i < lineItems.size(); i++) {
                if (lineItems.get(i).getSKU().equals(SKU)) {
                    int quantity = lineItems.get(i).getQuantity();
                    lineItems.get(i).setQuantity(++quantity);
                    isExist = true;
                }
            }
            //else add new lineitem to the list
            if (!isExist) {
                lineItem = new LineItem(SKU, item.getName(), 10.00, 1);
                //lineItem = new LineItem(SKU, item.getName(), itemCountry.getRetailPrice(), 1);
                lineItems.add(lineItem);
            }

            //done with adding to List, update the table
            refreshTable();
            // }
        }
    }//GEN-LAST:event_btnTest2ActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblLineItem.getModel();
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        POS.transaction = new Transaction();
        lineItems = POS.transaction.getLineItems();
        tblLineItem.requestFocus();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        Integer currentKeyCode = evt.getKeyCode();
        System.out.println(currentKeyCode);
        if (!((currentKeyCode>=48) && (currentKeyCode>=57)) || !((currentKeyCode>=65) && (currentKeyCode<=90)) || !((currentKeyCode>=97) && (currentKeyCode<=122))) {
            //ignore
        } else if (currentKeyCode==10) {
            submitSKU(SKUString);
            SKUString = "";
        } else {
            SKUString += evt.getKeyChar() + "";
        }
    }//GEN-LAST:event_formKeyReleased

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
            java.util.logging.Logger.getLogger(SelfCheckOutUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelfCheckOutUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelfCheckOutUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelfCheckOutUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelfCheckOutUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnLoyaltyCard;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnTest1;
    private javax.swing.JButton btnTest2;
    private javax.swing.JButton btnTestContent;
    private javax.swing.JButton btnUpdateQuantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JPanel pnlHader;
    private javax.swing.JTable tblLineItem;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblLineItem.getModel();
            int rows = model.getRowCount();
            for (int i = rows - 1; i >= 0; i--) {
                model.removeRow(i);
            }

            for (int i = 0; i < lineItems.size(); i++) {
                model.addRow(new Object[]{lineItems.get(i).getDescription(), lineItems.get(i).getPrice(), lineItems.get(i).getQuantity()});
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "An unknown error has occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void submitSKU(String SKU) {
        //this is for barcode scanner
        POS.storeID = 1 + "";

        System.out.println("SKU " + SKU);

        boolean isExist = false;

        item = getItemBySKU(SKU);
        if (item != null) {
            itemCountry = getItemCountryBySKU(SKU, Long.parseLong(POS.storeID));
            //   if (itemCountry != null) {
            //check arraylist if this lineitem exist, if have increase quantity, 
            for (int i = 0; i < lineItems.size(); i++) {
                if (lineItems.get(i).getSKU().equals(SKU)) {
                    int quantity = lineItems.get(i).getQuantity();
                    lineItems.get(i).setQuantity(++quantity);
                    isExist = true;
                }
            }
            //else add new lineitem to the list
            if (!isExist) {
                lineItem = new LineItem(SKU, item.getName(), 20.00, 1);
                lineItems.add(lineItem);
            }

            //done with adding to List, update the table
            refreshTable();
            // }
        }
    }

    private static ItemEntity getItemBySKU(java.lang.String sku) {
        PointOfSales.StoreWebServiceBean_Service service = new PointOfSales.StoreWebServiceBean_Service();
        PointOfSales.StoreWebServiceBean port = service.getStoreWebServiceBeanPort();
        return port.getItemBySKU(sku);
    }

    private static ItemCountryEntity getItemCountryBySKU(java.lang.String sku, java.lang.Long storeID) {
        PointOfSales.StoreWebServiceBean_Service service = new PointOfSales.StoreWebServiceBean_Service();
        PointOfSales.StoreWebServiceBean port = service.getStoreWebServiceBeanPort();
        return port.getItemCountryBySKU(sku, storeID);
    }

}
