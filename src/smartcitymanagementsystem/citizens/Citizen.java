package smartcitymanagementsystem.citizens;

import java.io.Serializable;

public class Citizen implements Serializable {
    private int citizenId;
    private String name;
    private long contactInfo;
    private String address;

    public Citizen(int citizenId, String name, long mobileNumber, String address) {
        this.citizenId = citizenId;
        this.name = name;
        this.contactInfo = mobileNumber;
        this.address = address;
    }


    public int getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(int citizenId) {
        this.citizenId = citizenId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(long contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Citizen : \n" +
                "CitizenId=" + citizenId +
                "\nname='" + name + "" +
                "\nmobileNumber=" + contactInfo +
                "\nAddress=" + address + "\n";
    }
}
