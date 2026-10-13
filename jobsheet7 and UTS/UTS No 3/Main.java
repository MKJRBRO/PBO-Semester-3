import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final Scanner scanner = new Scanner(System.in);
    static final List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        users.add(new Customer(101, "1234", "Alice", 25, "alice@mail.com"));
        users.add(new Customer(102, "4321", "Charlie", 30, "charlie@mail.com"));
        users.add(new Admin(1, "5678", "Bob", 40, "bob@mail.com"));

        boolean running = true;
        while (running) {
            System.out.println();
            System.out.println("=== Vehicle Service System ===");
            System.out.println("1. Log in");
            System.out.println("2. Recover password");
            System.out.println("0. Exit");
            int choice = readInt("Choose : ");
            switch (choice) {
                case 1: login(); break;
                case 2: recover(); break;
                case 0: running = false; break;
                default: System.out.println("Invalid option");
            }
        }
        System.out.println("Goodbye!");
    }

    static void login() {
        int id = readInt("User id  : ");
        int password = readInt("Password : ");
        User user = findUser(id);
        if (user == null) {
            System.out.println("Login failed: wrong user id or password");
            return;
        }
        if (!user.logIn(id, password)) {
            return;
        }
        if (user instanceof Admin) {
            adminMenu((Admin) user);
        } else if (user instanceof Customer) {
            customerMenu((Customer) user);
        }
    }

    static void recover() {
        User user = findUser(readInt("User id : "));
        if (user == null) {
            System.out.println("User not found");
        } else {
            user.recoverPassword();
        }
    }

    static void customerMenu(Customer customer) {
        UserProfile profile = customer.getProfile();
        int choice = -1;
        while (choice != 0) {
            System.out.println();
            System.out.println("--- Customer menu ---");
            System.out.println("1. Show profile");
            System.out.println("2. Edit profile");
            System.out.println("3. Show documents");
            System.out.println("4. Apply verification");
            System.out.println("5. Verification status");
            System.out.println("0. Log out");
            choice = readInt("Choose : ");
            switch (choice) {
                case 1:
                    System.out.println("User id : " + profile.getUserId());
                    System.out.println("Name    : " + profile.getName());
                    System.out.println("Age     : " + profile.getAge());
                    System.out.println("Email   : " + profile.getEmail());
                    break;
                case 2: profile.editProfile(); break;
                case 3: profile.showDocuments(); break;
                case 4: customer.applyVerification(readLine("Document file name (.jpg, .png, .pdf) : ")); break;
                case 5: System.out.println("Verified : " + customer.getVerificationStatus()); break;
                case 0: customer.logOut(); break;
                default: System.out.println("Invalid option");
            }
        }
    }

    static void adminMenu(Admin admin) {
        int choice = -1;
        while (choice != 0) {
            System.out.println();
            System.out.println("--- Admin menu ---");
            System.out.println("1. Add vehicle");
            System.out.println("2. Update vehicle details");
            System.out.println("3. Retrieve complaints");
            System.out.println("4. Verify user");
            System.out.println("0. Log out");
            choice = readInt("Choose : ");
            switch (choice) {
                case 1: admin.addVehicle(); break;
                case 2: admin.updateVehicleDetails(readInt("Vehicle id : ")); break;
                case 3: admin.retrieveComplain(); break;
                case 4: admin.verifyUser(); break;
                case 0: admin.logOut(); break;
                default: System.out.println("Invalid option");
            }
        }
    }

    static User findUser(int userId) {
        for (User user : users) {
            if (user.getProfile().getUserId() == userId) {
                return user;
            }
        }
        return null;
    }

    static String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.hasNextLine() ? scanner.nextLine().trim() : "";
    }

    static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (!scanner.hasNextLine()) {
                return 0;
            }
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }
        }
    }
}