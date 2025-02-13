package smartcitymanagementsystem.choice;

import smartcitymanagementsystem.services.WasteManagement;
import smartcitymanagementsystem.services.WaterSupply;
import smartcitymanagementsystem.useofcollections.Details;

import java.util.Scanner;
//cammand patterns
public class ServiceHandling {


    public static void getAllServices() {
        Scanner sc = new Scanner(System.in);
        Details details = new Details();
        while (true) {
            System.out.println("1 Water Supply \n 2 Waste Management \n 3 Traffic Management \n 4 Emergency Services ");
            System.out.println("----------------------------------------------------------------------------------------------------");
            int service = sc.nextInt();

            switch (service) {
                case 1:
                    WaterSupply waterSupply = new WaterSupply();
                    waterSupply.provideService();
                    System.out.println("Enter the your Water Usages in litter ");
                    int usages = sc.nextInt();
                    waterSupply.trackUsage(usages);
                    break;

                case 2 :
                    WasteManagement wasteManagement = new WasteManagement();

            }
        }


    }
}
