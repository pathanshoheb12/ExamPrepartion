package smartcitymanagementsystem.services;

import smartcitymanagementsystem.exceptionhandler.ServiceNotAvailableException;

public class WaterSupply implements CityService {
    private int waterUsage;

    public WaterSupply() {
        waterUsage = 200;
    }

    @Override
    public void provideService() {
        System.out.println(" Supplying Clean water ....");
    }

    public void processRequest() {
        System.out.println("Processing Water Supply.. ");
    }

    public void trackUsage(int enterUsages) {
        if (enterUsages < waterUsage) {
            processRequest();
        } else {
            throw new ServiceNotAvailableException("Provided Water Limit is :" + waterUsage + " Your Usages is " + enterUsages + "Litter Water limit exceeds .");
        }
    }
}

