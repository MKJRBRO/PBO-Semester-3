public class ServiceNo2 {
    private String serviceName;
    private double servicePrice;
    private VehicleNo2 vehicle;
    private EmployeeNo2 employee;

    public ServiceNo2(String serviceName, double servicePrice,
        VehicleNo2 vehicle, EmployeeNo2 employee) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
        this.vehicle = vehicle;
        this.employee = employee;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }

    public VehicleNo2 getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleNo2 vehicle) {
        this.vehicle = vehicle;
    }

    public EmployeeNo2 getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeNo2 employee) {
        this.employee = employee;
    }

    public double calculateTotalCost() {
        if (vehicle.getVehicleType().equalsIgnoreCase("Car")) {
            return servicePrice + 50000;
        } else if (vehicle.getVehicleType().equalsIgnoreCase("Motorcycle")) {
            return servicePrice + 20000;
        }

        return servicePrice;
    }

    public void displayServiceInfo() {
        System.out.println("Service Name : " + serviceName);
        System.out.println("Service Cost : Rp" + servicePrice);
        System.out.println("Vehicle      : "
                + vehicle.getBrand() + " " + vehicle.getModel());
        System.out.println("Vehicle Type : " + vehicle.getVehicleType());
        System.out.println("Employee     : " + employee.getName());
        System.out.println("Total Cost   : Rp" + calculateTotalCost());
    }
}