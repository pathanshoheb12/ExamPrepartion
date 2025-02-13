package smartcitymanagementsystem.services.trafficservice;

public class TrafficSignal {
    private String intersection;
    private SignalColors state;

    public TrafficSignal(String intersection, SignalColors initialState) {
        this.intersection = intersection;
        this.state=initialState;

    }

    public String getIntersection() {
        return intersection;
    }

    public SignalColors getState() {
        return state;
    }

    public void setState(SignalColors state) {
        this.state = state;
    }

    public void changeState() {
        switch (state) {
            case SignalColors.Red:
                state = SignalColors.Green;
                break;
            case SignalColors.Green:
                state = SignalColors.Yellow;
                break;
            case SignalColors.Yellow:
                state = SignalColors.Red;
                break;
        }

    }

    public void displayStatus() {
        System.out.println("Intersection " + intersection + ": " + state);
    }
}
