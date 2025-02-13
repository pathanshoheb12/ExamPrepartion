package smartcitymanagementsystem.citizens;

public class Resident extends Citizen {

    private String residenceType;

    public Resident(int citizenId, String name, long mobileNumber, String address, String residenceType) {
        super(citizenId, name, mobileNumber, address);
        this.residenceType = residenceType;
    }

    public String getResidenceType() {
        return residenceType;
    }

    public void setResidenceType(String residenceType) {
        this.residenceType = residenceType;
    }

    @Override
    public String toString() {
        return super.toString() +
                "residenceType " + residenceType+"\n\n";
    }
}
