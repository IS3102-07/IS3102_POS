package PointOfSales;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;

public class ReadFile {

    public void readFile(String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Documents and Settings\\p0733599\\Desktop\\latest ajp\\AJP_assignment01\\SampleTextFiles\\" + filename));
            String data;
            String storeFileText = "";
            String word = "";

            while ((data = br.readLine()) != null) {
                storeFileText += data;
                StringTokenizer st = new StringTokenizer(data, " ");
                // total = st.countTokens();
            }
            br.close();

        } catch (FileNotFoundException eek) {
            System.out.println(eek.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
