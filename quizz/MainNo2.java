public class MainNo2 {
    public static void main(String[] args) {

        CustomerNo2 customer1 = new CustomerNo2(
                "Budi",
                "081234567890"
        );

        CustomerNo2 customer2 = new CustomerNo2(
                "Andi",
                "082345678901"
        );
 
        VehicleNo2 car = new VehicleNo2(
                "N 1234 AB",
                "Toyota",
                "Avanza",
                "Car"
        );

        VehicleNo2 motorcycle = new VehicleNo2(
                "N 5678 CD",
                "Honda",
                "Vario",
                "Motorcycle"
        );

        customer1.addVehicle(car);
        customer2.addVehicle(motorcycle);

        EmployeeNo2 employee1 = new EmployeeNo2(
                "E001",
                "Joko",
                "Mechanic"
        );

        EmployeeNo2 employee2 = new EmployeeNo2(
                "E002",
                "Doni",
                "Mechanic"
        );

        ServiceNo2 service1 = new ServiceNo2(
                "Engine Service",
                500000,
                car,
                employee1
        );

        ServiceNo2 service2 = new ServiceNo2(
                "Oil Change",
                100000,
                motorcycle,
                employee2
        );

        System.out.println("===== CUSTOMER 1 =====");
        System.out.println("Name        : " + customer1.getName());
        System.out.println("Phone       : " + customer1.getPhoneNumber());

        System.out.println("\nVehicle:");
        customer1.displayVehicles();

        System.out.println("\n===== SERVICE INFORMATION =====");
        service1.displayServiceInfo();

        System.out.println("\n===== CUSTOMER 2 =====");
        System.out.println("Name        : " + customer2.getName());
        System.out.println("Phone       : " + customer2.getPhoneNumber());

        System.out.println("\nVehicle:");
        customer2.displayVehicles();

        System.out.println("\n===== SERVICE INFORMATION =====");
        service2.displayServiceInfo();
    }
}