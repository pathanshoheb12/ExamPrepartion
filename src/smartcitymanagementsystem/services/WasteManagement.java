package smartcitymanagementsystem.services;

import java.util.HashMap;
import java.util.Date;
import java.util.Scanner;

public class WasteManagement implements CityService {

    private HashMap<Date, String> collectionSchedule;
    Scanner sc = new Scanner(System.in);
    public WasteManagement() {
        collectionSchedule = new HashMap<>();
    }

    @Override
    public void provideService() {
        System.out.println("Collecting and processing Waste ...");
    }

    @Override
    public void processRequest() {

        System.out.println("Can you please provide Shift");

    }


    public void scheduleCollection(String schedule) {
        Date date = new Date();  // date time api
        collectionSchedule.put(date, schedule);
    }
}
