package smartcitymanagementsystem.services;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyService implements CityService {

    private Queue<String> emergencyRequests;

    public EmergencyService() {
        emergencyRequests = new LinkedList<>();
    }

    @Override
    public void provideService() {
        System.out.println("Responding to emergency calls ...");

    }

    public void processRequest() {


    }

    public Queue<String> getEmergencyRequests() {
        return emergencyRequests;
    }

    public void setEmergencyRequests(Queue<String> emergencyRequests) {
        this.emergencyRequests = emergencyRequests;
    }

    public void respondToEmergency() {
        if (!emergencyRequests.isEmpty()) {
            String request = emergencyRequests.poll();
            System.out.println(request);
        }
    }
}

