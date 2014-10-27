package PointOfSalesUI;

import POS.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;

public class CashierCheckoutUI extends javax.swing.JFrame {

    private Container cp;
    private List<LineItem> lineItems;
    private LineItem lineItem;
    private String SKUString;
    private ItemHelper itemHelper;

    public CashierCheckoutUI() {
        initComponents();
        this.setTitle("Island Furniture Cashier Checkout");
        this.setSize(1280, 960);
        cp = getContentPane();
        cp.setBackground(Color.white);
        SKUString = "";
        POS.transaction = new Transaction();
        lineItems = POS.transaction.getLineItems();

        if (POS.staffEmail != null && POS.name != null) {
            lblDuty.setText("Cashier  : " + POS.staffEmail);
            lblPOSName.setText(POS.name);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHader = new javax.swing.JPanel();
        lblHeader1 = new javax.swing.JLabel();
        lblTotalItems = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLineItem = new javax.swing.JTable();
        btnLoyaltyCard = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnUpdateQuantity = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        btnTest1 = new javax.swing.JButton();
        btnTest2 = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblDiscount = new javax.swing.JLabel();
        lblTotalNet = new javax.swing.JLabel();
        btnPayCredit = new javax.swing.JButton();
        btnPayCash = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblPOSName = new javax.swing.JLabel();
        lblDuty = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnCancel1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

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

        lblTotalItems.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblTotalItems.setText("0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Sub total:");

        lblTotalPrice.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblTotalPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotalPrice.setText("0.0");

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
        btnDelete.setText("Void Item");
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

        lblMessage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(153, 0, 0));
        lblMessage.setText("Label");

        btnTest1.setText("test add F1");
        btnTest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTest1ActionPerformed(evt);
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

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText(" : items");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Discount:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Total:");

        lblDiscount.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblDiscount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDiscount.setText("0.0");

        lblTotalNet.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblTotalNet.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotalNet.setText("0.0");

        btnPayCredit.setBackground(new java.awt.Color(255, 153, 51));
        btnPayCredit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPayCredit.setForeground(new java.awt.Color(255, 255, 255));
        btnPayCredit.setText("<html><h1 align='center'>Payment by <br>Credit Card</h1></htm>");
        btnPayCredit.setBorder(new javax.swing.border.MatteBorder(null));
        btnPayCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayCreditActionPerformed(evt);
            }
        });

        btnPayCash.setBackground(new java.awt.Color(255, 153, 51));
        btnPayCash.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPayCash.setForeground(new java.awt.Color(255, 255, 255));
        btnPayCash.setText("<html><h1 align='center'>Payment by <br>CASH</h1></htm>");
        btnPayCash.setBorder(new javax.swing.border.MatteBorder(null));
        btnPayCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayCashActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.gray));

        lblPOSName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblPOSName.setText("POS: 1");

        lblDuty.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblDuty.setText("Cashier on Duty : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDuty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPOSName)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPOSName)
                    .addComponent(lblDuty))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBack.setText("Exit");
        btnBack.setBorder(new javax.swing.border.MatteBorder(null));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCancel1.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCancel1.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sync.jpg"))); // NOI18N
        btnCancel1.setBorder(new javax.swing.border.MatteBorder(null));
        btnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTotalItems)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnTest1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnTest2))))
                            .addComponent(lblMessage))
                        .addGap(379, 379, 379)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDiscount, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTotalPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTotalNet, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPayCash)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPayCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnUpdateQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCancel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnHelp)
                            .addComponent(btnLoyaltyCard, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
            .addComponent(pnlHader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdateQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLoyaltyCard, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPayCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPayCash, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalItems)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblMessage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnTest1)
                                    .addComponent(btnTest2))
                                .addGap(13, 13, 13))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblTotalPrice))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(lblDiscount))
                                .addGap(32, 32, 32))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(lblTotalNet))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        refreshTotalQuantityAndPrice();
    }//GEN-LAST:event_btnLoyaltyCardActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblLineItem.getModel();
        if (tblLineItem.getSelectedRow() != -1 && tblLineItem.getRowCount() != 0) {
            lineItems.remove(tblLineItem.getSelectedRow());
            model.removeRow(tblLineItem.getSelectedRow());
            POS.displayPoleMessage("Item Removed", "");
        }
        refreshTotalQuantityAndPrice();
        tblLineItem.requestFocus();

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        if (!POS.supervisorContactNo.isEmpty()) {
            System.out.println(POS.supervisorContactNo);
            //alertSupervisor(POS.name, POS.supervisorContactNo);
        }
        tblLineItem.requestFocus();
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnUpdateQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateQuantityActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblLineItem.getModel();
        if (tblLineItem.getSelectedRow() != -1 && tblLineItem.getRowCount() != 0) {
            JDialog dialog = new JDialog();
            dialog.setLocation(580, 400);
            dialog.setModal(true);
            dialog.setUndecorated(true);
            dialog.add(new QuantityUI(lineItems.get(tblLineItem.getSelectedRow()).getQuantity()));
            dialog.pack();
            dialog.setVisible(true);

            lineItems.get(tblLineItem.getSelectedRow()).setQuantity(POS.tmpQty);
            model.setValueAt(POS.tmpQty, tblLineItem.getSelectedRow(), 2);
        }

        refreshTotalQuantityAndPrice();
        //printLineItemPoleMessage(lineItems.get(tblLineItem.getSelectedRow()).getDescription(), lineItems.get(tblLineItem.getSelectedRow()).getPrice());
        tblLineItem.requestFocus();

    }//GEN-LAST:event_btnUpdateQuantityActionPerformed


    private void tblLineItemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblLineItemKeyReleased
        //----------barcode scanner--------------
        char c = evt.getKeyChar();
        if (Character.isLetterOrDigit(c)) {
            SKUString += evt.getKeyChar() + "";
        } else if (evt.getKeyCode() == 10) {
            submitSKU(SKUString);
            SKUString = "";
        } else {
            //ignore
        }
    }//GEN-LAST:event_tblLineItemKeyReleased

    private void btnTest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTest1ActionPerformed
        //hard code can delete when done
        String SKU = "F1";
        double itemCountryPrice;

        boolean isExist = false;
        try {
            itemHelper = getItemBySKU(SKU);
            if (itemHelper != null) {

                itemCountryPrice = getItemCountryPriceBySKU(SKU, POS.storeID);
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
                    lineItem = new LineItem(SKU, itemHelper.getItemName(), itemCountryPrice, 1);
                    lineItems.add(lineItem);
                }

                //done with adding to List, update the table
                refreshTable();
                refreshTotalQuantityAndPrice();
                tblLineItem.requestFocus();
                printLineItemPoleMessage(itemHelper.getItemName(), itemCountryPrice);
            }
        } catch (Exception ex) {
            lblMessage.setText("Item not available for checkout, contact customer service for assistance.");
        }
    }//GEN-LAST:event_btnTest1ActionPerformed

    private void btnTest2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTest2ActionPerformed
        //hard code can delete when done
        String SKU = "F2";
        double itemCountryPrice;

        boolean isExist = false;
        try {
            itemHelper = getItemBySKU(SKU);
            if (itemHelper != null) {
                itemCountryPrice = getItemCountryPriceBySKU(SKU, POS.storeID);
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
                    lineItem = new LineItem(SKU, itemHelper.getItemName(), itemCountryPrice, 1);
                    lineItems.add(lineItem);
                }

                //done with adding to List, update the table
                refreshTable();
                refreshTotalQuantityAndPrice();
                tblLineItem.requestFocus();
                printLineItemPoleMessage(itemHelper.getItemName(), itemCountryPrice);
            }
        } catch (Exception ex) {
            lblMessage.setText("Item not available for checkout, contact customer service for assistance.");
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
        refreshTotalQuantityAndPrice();
        tblLineItem.requestFocus();
        POS.displayPoleMessage("Items cleared", "");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnPayCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayCreditActionPerformed
        if (POS.transaction.getTotalItems() > 0) {
            JDialog dialog = new JDialog();
            final Toolkit toolkit = Toolkit.getDefaultToolkit();
            final Dimension screenSize = toolkit.getScreenSize();
            final int x = (screenSize.width - dialog.getWidth()) / 4;
            final int y = (screenSize.height - dialog.getHeight()) / 4;
            dialog.setLocation(x, y);
            dialog.setModal(true);
            dialog.setUndecorated(true);
            dialog.add(new PaymentUI_CreditCard());
            dialog.pack();
            dialog.setVisible(true);
            tblLineItem.requestFocus();

            if (POS.transactionCompleted) {
                DefaultTableModel model = (DefaultTableModel) tblLineItem.getModel();
                int rows = model.getRowCount();
                for (int i = rows - 1; i >= 0; i--) {
                    model.removeRow(i);
                }
                POS.transaction = new Transaction();
                lineItems = POS.transaction.getLineItems();
                refreshTotalQuantityAndPrice();
                tblLineItem.requestFocus();
                POS.transactionCompleted = false;
            }
        }
    }//GEN-LAST:event_btnPayCreditActionPerformed

    private void btnPayCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayCashActionPerformed
        if (POS.transaction.getTotalItems() > 0) {
            JDialog dialog = new JDialog();
            final Toolkit toolkit = Toolkit.getDefaultToolkit();
            final Dimension screenSize = toolkit.getScreenSize();
            final int x = (screenSize.width - dialog.getWidth()) / 4;
            final int y = (screenSize.height - dialog.getHeight()) / 4;
            dialog.setLocation(x, y);
            dialog.setModal(true);
            dialog.setUndecorated(true);
            dialog.add(new PaymentUI_Cash());
            dialog.pack();
            dialog.setVisible(true);
            tblLineItem.requestFocus();

            if (POS.transactionCompleted) {
                DefaultTableModel model = (DefaultTableModel) tblLineItem.getModel();
                int rows = model.getRowCount();
                for (int i = rows - 1; i >= 0; i--) {
                    model.removeRow(i);
                }
                POS.transaction = new Transaction();
                lineItems = POS.transaction.getLineItems();
                refreshTotalQuantityAndPrice();
                tblLineItem.requestFocus();
                POS.transactionCompleted = false;
            }
        }
    }//GEN-LAST:event_btnPayCashActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel1ActionPerformed
        QRCodeUI qrCodeUI = new QRCodeUI(this);
        qrCodeUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancel1ActionPerformed

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
            java.util.logging.Logger.getLogger(CashierCheckoutUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierCheckoutUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierCheckoutUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierCheckoutUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierCheckoutUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancel1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnLoyaltyCard;
    private javax.swing.JButton btnPayCash;
    private javax.swing.JButton btnPayCredit;
    private javax.swing.JButton btnTest1;
    private javax.swing.JButton btnTest2;
    private javax.swing.JButton btnUpdateQuantity;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblDuty;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblPOSName;
    private javax.swing.JLabel lblTotalItems;
    private javax.swing.JLabel lblTotalNet;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JPanel pnlHader;
    private javax.swing.JTable tblLineItem;
    // End of variables declaration//GEN-END:variables

    private void submitSKU(String SKU) {
        //this is for barcode scanner
        boolean isExist = false;
        double itemCountryPrice;

        try {
            itemHelper = getItemBySKU(SKU);
            if (itemHelper != null) {
                itemCountryPrice = getItemCountryPriceBySKU(SKU, POS.storeID);
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
                    lineItem = new LineItem(SKU, itemHelper.getItemName(), itemCountryPrice, 1);
                    lineItems.add(lineItem);
                }

                //done with adding to List, update the table
                refreshTable();
                refreshTotalQuantityAndPrice();
                tblLineItem.requestFocus();
                printLineItemPoleMessage(itemHelper.getItemName(), itemCountryPrice);
            }
        } catch (Exception ex) {
            lblMessage.setText("Item not available for checkout, contact customer service for assistance.");
        }
    }

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
            ex.printStackTrace();
        }
    }

    private void refreshTotalQuantityAndPrice() {
        int totalQuantity = 0;
        double totalPrice = 0;
        double netPrice = 0;
        double discounPrice = 0;
        double discountRate = 0;

        for (int i = 0; i < lineItems.size(); i++) {
            totalQuantity += lineItems.get(i).getQuantity();
            totalPrice += lineItems.get(i).getQuantity() * lineItems.get(i).getPrice();
        }

        //total item label
        POS.transaction.setTotalItems(totalQuantity);
        lblTotalItems.setText(totalQuantity + "");

        //sub total label
        POS.transaction.setTotalPrice(totalPrice);
        lblTotalPrice.setText(totalPrice + "");

        //discount label
        discountRate = POS.transaction.getDiscountRate();
        if (discountRate > 0) {
            discounPrice = totalPrice * (discountRate / 100);
            discounPrice = Math.round(discounPrice * 100.0) / 100.0;
            POS.transaction.setDiscountPrice(totalPrice);
            lblDiscount.setText(discounPrice + "");
        } else {
            lblDiscount.setText("0.0");
        }

        //total price label
        if (totalPrice > 0) {
            netPrice = totalPrice - discounPrice;
            POS.transaction.setNetPrice(netPrice);
            lblTotalNet.setText(netPrice + "");
        } else {
            lblTotalNet.setText(totalPrice + "");
        }
    }

    private void printLineItemPoleMessage(String itemName, double itemPrice) {
        String formatItemName = String.format("%-9s", itemName);
        String formatItemPrice = String.format("%9s", itemPrice);
        String line1 = formatItemName + formatItemPrice;

        String formatLabel = String.format("%-9s", "SUB-TOTAL");
        String formatItemSubPrice = String.format("%10s", "[" + POS.transaction.getTotalPrice() + "]");
        String line2 = formatLabel + formatItemSubPrice;

        System.out.println(line1 + "\n" + line2);
        POS.displayPoleMessage(line1, line2);
    }

    private static PointOfSalesUI.ItemHelper getItemBySKU(java.lang.String sku) {
        PointOfSalesUI.RetailInventoryWebService_Service service = new PointOfSalesUI.RetailInventoryWebService_Service();
        PointOfSalesUI.RetailInventoryWebService port = service.getRetailInventoryWebServicePort();
        return port.getItemBySKU(sku);
    }

    private static Double getItemCountryPriceBySKU(java.lang.String sku, java.lang.Long storeID) {
        PointOfSalesUI.RetailInventoryWebService_Service service = new PointOfSalesUI.RetailInventoryWebService_Service();
        PointOfSalesUI.RetailInventoryWebService port = service.getRetailInventoryWebServicePort();
        return port.getItemCountryPriceBySKU(sku, storeID);
    }

    private static Boolean alertSupervisor(java.lang.String posName, java.lang.String supervisorTel) {
        PointOfSalesUI.RetailInventoryWebService_Service service = new PointOfSalesUI.RetailInventoryWebService_Service();
        PointOfSalesUI.RetailInventoryWebService port = service.getRetailInventoryWebServicePort();
        return port.alertSupervisor(posName, supervisorTel);
    }

}
