import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String customerName;
    private String address;
    private String phone;
    private List<Order> orders = new ArrayList<>();

    public Customer(int customerId, String customerName, String address, String phone) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
    }

    public void addCustomer() {
        System.out.println("[Customer] Data pelanggan baru ditambahkan: " + customerName);
    }

    public void editCustomer() {
        System.out.println("[Customer] Data pelanggan '" + customerName + "' diperbarui.");
    }

    public void deleteCustomer() {
        System.out.println("[Customer] Pelanggan '" + customerName + "' dihapus.");
    }

    void tambahOrder(Order order) {
        orders.add(order);
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "Customer{id=" + customerId + ", nama='" + customerName + "', alamat='" + address
                + "', telp='" + phone + "'}";
    }
}