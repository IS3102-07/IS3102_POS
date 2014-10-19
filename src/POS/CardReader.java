package POS;

import java.util.*;
import javax.smartcardio.*;

public class CardReader {

    List<CardTerminal> terminals;
    CardTerminal terminal;

    public CardReader() {
        try {
            TerminalFactory factory = TerminalFactory.getInstance("PC/SC", null);
            System.out.println(factory);

            terminals = factory.terminals().list();
            System.out.println("Terminals: " + terminals);
            if (terminals.isEmpty()) {
                throw new Exception("No card terminals available");
            }

            terminal = terminals.get(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();

    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        int v;
        for (int j = 0; j < bytes.length; j++) {
            v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }

    public String getCardUID() throws Exception {

        if (terminal.isCardPresent()) {

            // Keep looping looking for cards until the application is closed
            terminal.waitForCardPresent(0);
            try {
                Card card = terminal.connect("*");
                CardChannel channel = card.getBasicChannel();

                CommandAPDU command = new CommandAPDU(new byte[]{(byte) 0xFF, (byte) 0xCA, (byte) 0x00, (byte) 0x00, (byte) 0x04});
                ResponseAPDU response = channel.transmit(command);

                byte[] byteArray = response.getBytes();

                System.out.println(bytesToHex(byteArray));
                return bytesToHex(byteArray);
            } catch (CardException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            return "Card cannot be found!";
        }

    }

}
