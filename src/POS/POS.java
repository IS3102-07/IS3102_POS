package POS;

import gnu.io.CommPortIdentifier;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import javax.swing.JOptionPane;

public class POS {

    public static Long storeID;
    public static String storeAddress;
    public static String storePostal;
    public static String storeCountry;
    public static String name;

    public static String staffName;
    public static String staffEmail;
    public static char[] staffPassword;
    public static String supervisorContactNo;

    public static Transaction transaction;

    public static int tmpQty = 0;
    public static boolean transactionCompleted;

    public static String PORT_Pole;

    public static OutputStream partnerPoleDisplayOutputStream;
    public static SerialPort serialPort;

    public static void displayPoleMessage(String line1, String line2) {
        //line 1 write left to right
        //line 2 write right to left
        byte[] clear = {0x0C};
        byte[] newLine = {0x0A};
        byte[] carriageReturn = {0x0D};
        byte[] message1 = new String(line1).getBytes();
        byte[] message2 = new String(line2).getBytes();
        try {
            partnerPoleDisplayOutputStream.write(clear);
            partnerPoleDisplayOutputStream.write(message1);
            partnerPoleDisplayOutputStream.write(newLine);
            partnerPoleDisplayOutputStream.write(carriageReturn);
            partnerPoleDisplayOutputStream.write(message2);
        } catch (IOException ex) {
            ex.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Unable to write to Partner Pole Display: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void initPartnerPoleDisplay() {
        Enumeration<CommPortIdentifier> commPortList = CommPortIdentifier.getPortIdentifiers();
        while (commPortList.hasMoreElements()) {
            CommPortIdentifier commPort = (CommPortIdentifier) commPortList.nextElement();
            if (commPort.getName().equals(PORT_Pole)) {
                try {
                    serialPort = (SerialPort) commPort.open("IT07POS", 5000);
                    partnerPoleDisplayOutputStream = serialPort.getOutputStream();
                } catch (PortInUseException | IOException ex) {
                    JOptionPane.showMessageDialog(null, "Unable to initialize Partner Pole Display: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

}
