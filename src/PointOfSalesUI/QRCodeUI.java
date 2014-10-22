package PointOfSalesUI;

import com.onbarcode.barcode.IBarcode;
import com.onbarcode.barcode.QRCode;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QRCodeUI extends javax.swing.JPanel {

    public QRCodeUI() {
        try {
            initComponents();

            QRCode barcode = new QRCode();
            barcode.setData("HUAT LIAO");
            barcode.setDataMode(QRCode.M_AUTO);
            barcode.setVersion(10);
            barcode.setEcl(QRCode.ECL_M);

            barcode.setProcessTilde(false);

            barcode.setUom(IBarcode.UOM_PIXEL);
            // QR Code barcode module width in pixel
            barcode.setX(3f);

            barcode.setLeftMargin(10f);
            barcode.setRightMargin(10f);
            barcode.setTopMargin(10f);
            barcode.setBottomMargin(10f);
            // barcode image resolution in dpi
            barcode.setResolution(72);

            barcode.drawBarcode("C:\\qrcode.gif");

            
        } catch (Exception ex) {
            Logger.getLogger(QRCodeUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(625, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
