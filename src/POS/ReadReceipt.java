package POS;

import POS.POS;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;

public class ReadReceipt {

    public ReadReceipt() {
        try {
            String filePath = new File("").getAbsolutePath();
            BufferedReader br = new BufferedReader(new FileReader(filePath.concat("\\src\\PointOfSales\\receipt.txt")));
            String data = "<style type=\"text/css\">";

            while ((br.readLine()) != null) {
                data += br.readLine();
            }
            POS.test = data;
            System.out.println(data + "");
            br.close();

        } catch (FileNotFoundException eek) {
            System.out.println(eek.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
