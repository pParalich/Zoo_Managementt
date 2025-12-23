package Main.example.Entities;

public class RentalService {

    private int serviceCode;

    public RentalService(int serviceCode) {
        this.serviceCode = serviceCode;
    }

    public int getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(int serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public String toString() {
        return "Service code: " + serviceCode;
    }
}
