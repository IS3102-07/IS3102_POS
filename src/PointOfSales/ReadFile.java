package PointOfSales;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;

public class ReadFile {

    public int storeID;
    //public 

    public ReadFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\IS3102_POS\\src\\PointOfSales\\setup.txt"));
            String data;

            while ((data = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(data, ",");
                Store.storeID = st.nextToken();
                Store.storeName = st.nextToken();
            }
            br.close();

        } catch (FileNotFoundException eek) {
            System.out.println(eek.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
