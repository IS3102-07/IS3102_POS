package PointOfSalesUI;

public class MemberLookup extends Thread {

    private String time;

    public MemberLookup(String time) {
        this.time = time;
    }

    public void run() {
        try {
            String memberEmail = getSyncWithPhoneStatus(time);

            int count = 10;
            while (memberEmail == null && count > 0) {
                count--;
                Thread.sleep(1000);
                System.out.println("countdown" + count);
            }

            //ord
            if (memberEmail == null) {
                System.out.println("hi");
            } else {
                System.out.println("out");
            }

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private static String getSyncWithPhoneStatus(java.lang.String arg0) {
        PointOfSalesUI.LoyaltyAndRewardsWebService_Service service = new PointOfSalesUI.LoyaltyAndRewardsWebService_Service();
        PointOfSalesUI.LoyaltyAndRewardsWebService port = service.getLoyaltyAndRewardsWebServicePort();
        return port.getSyncWithPhoneStatus(arg0);
    }
    
    

}
