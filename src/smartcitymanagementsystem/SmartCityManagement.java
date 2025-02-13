package smartcitymanagementsystem;

import smartcitymanagementsystem.citizens.Resident;
import smartcitymanagementsystem.citizens.Tourist;
import smartcitymanagementsystem.filehandler.CitizensDataFileHandler;
import smartcitymanagementsystem.services.trafficservice.SignalColors;
import smartcitymanagementsystem.services.trafficservice.TrafficService;
import smartcitymanagementsystem.services.trafficservice.TrafficSignal;
import smartcitymanagementsystem.useofcollections.Details;

import java.io.IOException;

public class SmartCityManagement {

    public static void main(String[] args) throws InterruptedException {
        Details details = new Details();
        Resident residential1 = new Resident(1, "Rahul", 9145674121L, "Gachibowli Hyderabad", "Apartment");
        Resident residential2 = new Resident(2, "Sham", 9145674121L, "HITechCity Hyderabad", "House");

        details.addResidentCitizens(residential1);
        details.addResidentCitizens(residential2);

        Tourist tourist1 = new Tourist(3, "Allen", 75653653L, "USA", 101);
        Tourist tourist2 = new Tourist(6, "Jokky", 132657898L, "Australia", 104);

        details.addTouristCitizens(tourist1);
        details.addTouristCitizens(tourist2);


        details.addResources("Police", 100);
        details.addResources("ambulance", 108);
        details.addResources("Garbage Collector", 12345);

        String residentCsvFilePath = "C:\\Users\\ShohebPathan\\IdeaProjects\\ExamPrepartion\\src\\smartcitymanagementsystem\\filehandler\\residentData.csv";
        // String jsonPath = "C:\\Users\\ShohebPathan\\IdeaProjects\\ExamPrepartion\\src\\smartcitymanagementsystem\\filehandler\\JSonFile.json";
        String touristCsvFilePath = "C:\\Users\\ShohebPathan\\IdeaProjects\\ExamPrepartion\\src\\smartcitymanagementsystem\\filehandler\\touristData.csv";
        try {

            CitizensDataFileHandler.saveResidentDataToCSV(details.getAllResidents(), residentCsvFilePath);
            CitizensDataFileHandler.saveTouristDataToCSV(details.getTouristCitizens(), touristCsvFilePath);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Traffic Signal
        TrafficService trafficService = new TrafficService();


        trafficService.addTrafficSignal(new TrafficSignal("Intersection 1", SignalColors.Red));
        trafficService.addTrafficSignal(new TrafficSignal("Intersection 2", SignalColors.Yellow));
        trafficService.addTrafficSignal(new TrafficSignal("Intersection 3", SignalColors.Green));


        trafficService.simulateTrafficControl(5);



    }
}
