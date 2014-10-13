package PointOfSales;

import java.awt.Window;
import javax.swing.SwingUtilities;

public class LoyaltyCardUI extends javax.swing.JPanel {

    private int memberPoints;
    private int pointsDeducting;
    private int discountRate;
    private String memberEmail;

    public LoyaltyCardUI() {
        initComponents();

        memberPoints = POS.transaction.getMemberPoints();
        pointsDeducting = POS.transaction.getPointsToDeduct();
        memberEmail = POS.transaction.getMemberEmail();

        if (memberEmail != null) {
            txtMemberEmail.setText(memberEmail);
        }

        if (memberPoints == 0) {
            lblCurrentPoints.setText("-");
        } else {
            lblCurrentPoints.setText(memberPoints + "");
        }

        if (pointsDeducting == 0) {
            lblRedeem.setText("-");
            btn5.setEnabled(false);
            btn10.setEnabled(false);
            btn15.setEnabled(false);
            btn20.setEnabled(false);
        } else {
            lblRedeem.setText(pointsDeducting + "");
            if (pointsDeducting >= 500) {
                btn5.setEnabled(true);
                btn10.setEnabled(true);
                btn15.setEnabled(true);
                btn20.setEnabled(true);
            } else if (pointsDeducting < 500 && pointsDeducting >= 300) {
                btn5.setEnabled(true);
                btn10.setEnabled(true);
                btn15.setEnabled(true);
                btn20.setEnabled(false);
            } else if (pointsDeducting < 300 && pointsDeducting >= 150) {
                btn5.setEnabled(true);
                btn10.setEnabled(true);
                btn15.setEnabled(false);
                btn20.setEnabled(false);
            } else if (pointsDeducting < 150 && pointsDeducting >= 50) {
                btn5.setEnabled(true);
                btn10.setEnabled(false);
                btn15.setEnabled(false);
                btn20.setEnabled(false);
            } else if (pointsDeducting < 50) {
                btn5.setEnabled(false);
                btn10.setEnabled(false);
                btn15.setEnabled(false);
                btn20.setEnabled(false);
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMemberEmail = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn5 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn10 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btn15 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btn20 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lblPoints10 = new javax.swing.JLabel();
        lblPoints11 = new javax.swing.JLabel();
        lblRedeem = new javax.swing.JLabel();
        lblCurrentPoints = new javax.swing.JLabel();

        jLabel6.setText("100 : Points");

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Scan Loyalty Card:");

        txtMemberEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMemberEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMemberEmailKeyReleased(evt);
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

        btn5.setBackground(new java.awt.Color(255, 153, 51));
        btn5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5%");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(153, 0, 0));
        btnClear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel4.setText("50 : Points");

        btn10.setBackground(new java.awt.Color(255, 153, 51));
        btn10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn10.setForeground(new java.awt.Color(255, 255, 255));
        btn10.setText("10%");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        jLabel9.setText("150 : Points");

        btn15.setBackground(new java.awt.Color(255, 153, 51));
        btn15.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn15.setForeground(new java.awt.Color(255, 255, 255));
        btn15.setText("15%");
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        jLabel10.setText("300 : Points");

        btn20.setBackground(new java.awt.Color(255, 153, 51));
        btn20.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn20.setForeground(new java.awt.Color(255, 255, 255));
        btn20.setText("20%");
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        jLabel11.setText("500 : Points");

        lblPoints10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPoints10.setText("Current Points : ");

        lblPoints11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPoints11.setText("Redeem Points : ");

        lblRedeem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRedeem.setText("950");

        lblCurrentPoints.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCurrentPoints.setText("1000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel11))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1))
                                .addComponent(txtMemberEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblPoints11))
                                        .addComponent(lblPoints10))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCurrentPoints, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblRedeem, javax.swing.GroupLayout.Alignment.TRAILING)))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurrentPoints)
                    .addComponent(lblPoints10))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblPoints11)
                    .addComponent(lblRedeem))
                .addGap(18, 18, 18)
                .addComponent(txtMemberEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMemberEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMemberEmailKeyReleased
        System.out.println("txtMemberEmailKeyReleased: " + evt.getKeyCode());
        //need to exract the email
        POS.transaction.setMemberEmail(evt.getKeyChar() + "");
        //memberPoints = getMemberLoyaltyPoints(memberEmail);
        memberPoints = 50;

        lblCurrentPoints.setText(memberPoints + "");
        lblRedeem.setText(pointsDeducting + "");

        if (memberPoints >= 500) {
            btn5.setEnabled(true);
            btn10.setEnabled(true);
            btn15.setEnabled(true);
            btn20.setEnabled(true);
        } else if (memberPoints < 500 && memberPoints >= 300) {
            btn5.setEnabled(true);
            btn10.setEnabled(true);
            btn15.setEnabled(true);
            btn20.setEnabled(false);
        } else if (memberPoints < 300 && memberPoints >= 150) {
            btn5.setEnabled(true);
            btn10.setEnabled(true);
            btn15.setEnabled(false);
            btn20.setEnabled(false);
        } else if (memberPoints < 150 && memberPoints >= 50) {
            btn5.setEnabled(true);
            btn10.setEnabled(false);
            btn15.setEnabled(false);
            btn20.setEnabled(false);
        } else if (memberPoints < 50) {
            btn5.setEnabled(false);
            btn10.setEnabled(false);
            btn15.setEnabled(false);
            btn20.setEnabled(false);
        }
    }//GEN-LAST:event_txtMemberEmailKeyReleased

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        POS.transaction.setPointsToDeduct(pointsDeducting);
        POS.transaction.setDiscountRate(discountRate);
        Window w = SwingUtilities.getWindowAncestor(LoyaltyCardUI.this);
        w.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        lblRedeem.setText(50 + "");
        pointsDeducting = 50;
        discountRate = 5;
    }//GEN-LAST:event_btn5ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        POS.transaction.setMemberEmail("");
        txtMemberEmail.setText("");
        lblCurrentPoints.setText("-");
        lblRedeem.setText("-");
        pointsDeducting = 0;
        discountRate = 0;
    }//GEN-LAST:event_btnClearActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        lblRedeem.setText(150 + "");
        pointsDeducting = 50;
        discountRate = 10;
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        lblRedeem.setText(300 + "");
        pointsDeducting = 300;
        discountRate = 15;
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        lblRedeem.setText(500 + "");
        pointsDeducting = 500;
        discountRate = 20;
    }//GEN-LAST:event_btn20ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCurrentPoints;
    private javax.swing.JLabel lblPoints10;
    private javax.swing.JLabel lblPoints11;
    private javax.swing.JLabel lblRedeem;
    private javax.swing.JTextField txtMemberEmail;
    // End of variables declaration//GEN-END:variables

    private static Integer getMemberLoyaltyPoints(java.lang.String memberEmail) {
        PointOfSales.HQWebServiceBean_Service service = new PointOfSales.HQWebServiceBean_Service();
        PointOfSales.HQWebServiceBean port = service.getHQWebServiceBeanPort();
        return port.getMemberLoyaltyPoints(memberEmail);
    }
}
