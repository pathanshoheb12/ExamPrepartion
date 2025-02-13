package smartcitymanagementsystem.services.trafficservice;

public enum SignalColors {
    Red(10000),
    Yellow(2000),
    Green(1000);
    private final int duration;

    SignalColors(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}

