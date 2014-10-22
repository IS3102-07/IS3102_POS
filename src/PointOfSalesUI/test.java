package PointOfSalesUI;

import com.onbarcode.barcode.IBarcode;
import com.onbarcode.barcode.QRCode;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class test extends javax.swing.JFrame {

    private ImageIcon _image1;
    private JLabel _mainLabel;

    public test() {
        try {

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

            String filePath = new File("").getAbsolutePath();
            String currentPath = filePath.concat("\\src\\images\\qrcode.gif");

            System.out.println(currentPath);

            //barcode.drawBarcode("C:\\IS3102_POS\\images\\qrcode.gif");
            barcode.drawBarcode(currentPath);

            _image1 = new ImageIcon(currentPath);
            _mainLabel = new JLabel(_image1);
            add(_mainLabel);

            pack(); // to tell the layout managers to set up the GUI
            initComponents();
        } catch (Exception ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagelabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imagelabel.setText("test");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(imagelabel)
                .addContainerGap(276, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(imagelabel)
                .addContainerGap(243, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagelabel;
    // End of variables declaration//GEN-END:variables
}
