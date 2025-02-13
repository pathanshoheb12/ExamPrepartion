package smartcitymanagementsystem.citizens;

public class Tourist extends Citizen {
    private int touristPassID;

    public Tourist(int citizenId, String name, long mobileNumber, String address, int touristPassID) {
        super(citizenId, name, mobileNumber, address);
        this.touristPassID = touristPassID;
    }

    public int getTouristPassID() {
        return touristPassID;
    }

    public void setTouristPassID(int touristPassID) {
        this.touristPassID = touristPassID;
    }

    @Override
    public String toString() {
        return super.toString() +
                "touristPassID=" + touristPassID+"\n";

    }
}
