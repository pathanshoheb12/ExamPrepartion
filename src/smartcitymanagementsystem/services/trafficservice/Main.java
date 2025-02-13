package smartcitymanagementsystem.services.trafficservice;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TrafficService trafficService = new TrafficService();

        trafficService.addTrafficSignal(new TrafficSignal("Intersection 1", SignalColors.Red));
        trafficService.addTrafficSignal(new TrafficSignal("Intersection 2", SignalColors.Yellow));
        trafficService.addTrafficSignal(new TrafficSignal("Intersection 3", SignalColors.Green));

        trafficService.simulateTrafficControl(5);

    }

}
