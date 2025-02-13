package smartcitymanagementsystem.services.trafficservice;

import smartcitymanagementsystem.services.CityService;

import java.util.ArrayList;
import java.util.List;

public class TrafficService implements CityService {

    private List<String> trafficViolations;
    private List<TrafficSignal> trafficSignals;

    public TrafficService() {
        trafficViolations = new ArrayList<>();
        trafficSignals = new ArrayList<>();
    }

    @Override
    public void provideService() throws InterruptedException {
        System.out.println("Managing Traffic and monitoring violations ...");
        manageTrafficSignals();
    }

    @Override
    public void processRequest() {
        System.out.println("Traffic Related Request : ");
    }

    public void recordViolation(String violation) {
        trafficViolations.add(violation);
    }

    public List<String> getTrafficViolations() {
        return trafficViolations;
    }

    public void addTrafficSignal(TrafficSignal signal) {
        trafficSignals.add(signal);
    }

    public void manageTrafficSignals() {
        for (TrafficSignal signal : trafficSignals) {
          try {
              signal.changeState();
              signal.displayStatus();
              Thread.sleep(signal.getState().getDuration());
          } catch (InterruptedException e) {
              e.printStackTrace();
          }


        }
    }

    public void simulateTrafficControl(int cycles) {
        for (int i = 0; i < cycles; i++) {

            try {
                System.out.println("Cycle " + (i + 1) + ":");
                manageTrafficSignals();
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
