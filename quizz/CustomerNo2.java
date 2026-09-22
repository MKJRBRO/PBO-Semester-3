import java.util.ArrayList;
import java.util.List;

public class CustomerNo2 {
    private String name;
    private String phoneNumber;
    private List<VehicleNo2> vehicles;

    public CustomerNo2(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.vehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<VehicleNo2> getVehicles() {
        return vehicles;
    }

    public void addVehicle(VehicleNo2 vehicle) {
        vehicles.add(vehicle);
        vehicle.setCustomer(this);
    }

    public void displayVehicles() {
        for (VehicleNo2 vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }
}