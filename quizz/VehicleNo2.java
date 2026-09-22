public class VehicleNo2 {
    private String plateNumber;
    private String brand;
    private String model;
    private String vehicleType;
    private CustomerNo2 customer;

    public VehicleNo2(String plateNumber, String brand, String model, String vehicleType) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.model = model;
        this.vehicleType = vehicleType;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public CustomerNo2 getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerNo2 customer) {
        this.customer = customer;
    }

    public void displayInfo() {
        System.out.println("Plate Number : " + plateNumber);
        System.out.println("Brand        : " + brand);
        System.out.println("Model        : " + model);
        System.out.println("Vehicle Type : " + vehicleType);
    }
}