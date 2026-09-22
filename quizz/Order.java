import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private int orderId;
    private Date orderDate;
    private float amount;
    private Customer customer;             
    private List<Product> products = new ArrayList<>(); 

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderDate = new Date();
        this.amount = 0f;
    }

    public void createOrder() {
        customer.tambahOrder(this);
        System.out.println("[Order] Order #" + orderId + " dibuat untuk " + customer.getCustomerName());
    }

    public void editOrder(int orderId) {
        System.out.println("[Order] Order #" + orderId + " diedit.");
    }

    
    public void tambahProduct(Product product) {
        products.add(product);
        this.amount += product.getProductPrice();
    }

    public int getOrderId() {
        return orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public float getAmount() {
        return amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String toString() {
        return "Order (id=" + orderId + ", customer=" + customer.getCustomerName()
                + ", jumlahProduk=" + products.size() + ", total=" + amount + ")";
    }
}