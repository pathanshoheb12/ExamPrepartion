package smartcitymanagementsystem.useofcollections;

import smartcitymanagementsystem.citizens.Resident;
import smartcitymanagementsystem.citizens.Tourist;
import smartcitymanagementsystem.services.EmergencyService;

import java.util.*;

public class Details {
    private List<Resident> residentCitizens;
    private List<Tourist> touristCitizens;
    private HashMap<String, Integer> resources;
    private Queue<String> emergencyQueue;

    public Details() {
        residentCitizens = new ArrayList<>();
        touristCitizens = new ArrayList<>();
        resources = new HashMap<>();
        emergencyQueue = new LinkedList<>();
    }

    public void addResidentCitizens(Resident citizen) {
        residentCitizens.add(citizen);
    }

    public void addTouristCitizens(Tourist citizen) {
        touristCitizens.add(citizen);
    }

    public void addResources(String resource, int number) {
        resources.put(resource, number);
    }

    public HashMap<String, Integer> getResources() {
        return resources;
    }

    public void addEmergencyRequest(String request) {
        EmergencyService service = new EmergencyService();
        emergencyQueue.add(request);

        service.setEmergencyRequests(emergencyQueue);
    }

    public List<Resident> getAllResidents() {
        return residentCitizens;
    }

    public List<Tourist> getTouristCitizens() {
        return touristCitizens;
    }
}
