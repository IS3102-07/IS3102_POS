package POS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;

public class ReadFile {

    public ReadFile() {
        try {
            String filePath = new File("").getAbsolutePath();
            BufferedReader br = new BufferedReader(new FileReader(filePath.concat("\\src\\POS\\setup.txt")));
            String data;

            while ((data = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(data, ",");
                POS.storeID = Long.parseLong(st.nextToken());
                POS.POSName = st.nextToken();
                POS.PORT_Pole = st.nextToken();
            }
            br.close();

        } catch (FileNotFoundException eek) {
            System.out.println(eek.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
