import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Admin extends User {
    private Map<Integer, String> vehicles = new LinkedHashMap<>();
    private List<String> complaints = new ArrayList<>();
    private int nextVehicleId = 1;

    public Admin(int userId, String password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
        complaints.add("Vehicle arrived late");
        complaints.add("Wrong vehicle delivered");
    }

    public int addVehicle() {
        String model = Main.readLine("Vehicle model : ");
        int vehicleId = nextVehicleId++;
        vehicles.put(vehicleId, model);
        System.out.println("Vehicle #" + vehicleId + " (" + model + ") added");
        return vehicleId;
    }

    public void updateVehicleDetails(int vehicleId) {
        if (!vehicles.containsKey(vehicleId)) {
            System.out.println("Vehicle #" + vehicleId + " not found");
            return;
        }
        String model = Main.readLine("New model : ");
        vehicles.put(vehicleId, model);
        System.out.println("Vehicle #" + vehicleId + " updated to " + model);
    }

    public void retrieveComplain() {
        if (complaints.isEmpty()) {
            System.out.println("No complaints");
            return;
        }
        System.out.println("Complaints:");
        for (int i = 0; i < complaints.size(); i++) {
            System.out.println(" " + (i + 1) + ". " + complaints.get(i));
        }
    }

    public void verifyUser() {
        int id = Main.readInt("Customer user id : ");
        User user = Main.findUser(id);
        if (!(user instanceof Customer)) {
            System.out.println("Customer not found");
            return;
        }
        Customer customer = (Customer) user;
        if (customer.getProfile().getDoc() == null) {
            System.out.println(customer.getProfile().getName() + " has not submitted a document");
            return;
        }
        customer.setVerificationStatus(true);
        System.out.println(customer.getProfile().getName() + " has been verified");
    }
}