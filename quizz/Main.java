import java.util.List;

public class Main {
    public static void main(String[] args) {
     
        Customer c1 = new Customer(1, "Budi Santoso", "Jl. Merdeka No. 10, Malang", "081234567890");
        c1.addCustomer();

     
        Product p1 = new Product(101, 15000f, "Makanan Ringan");
        Product p2 = new Product(102, 25000f, "Minuman");
        p1.addProduct();
        p2.addProduct();

        p1.tambahStock(new Stock(50, 1));
        p1.tambahStock(new Stock(30, 2));
        p2.tambahStock(new Stock(100, 1));

        System.out.println("Total stok " + p1.getProductType() + " (ID " + p1.getProductId()
                + "): " + p1.totalStok() + " unit");

        Order order1 = new Order(5001, c1);
        order1.createOrder();

        order1.tambahProduct(p1);
        order1.tambahProduct(p2);

        System.out.println(order1);
        System.out.println("Daftar order milik " + c1.getCustomerName() + ": " + c1.getOrders().size());

        List<Product> semuaProduk = List.of(p1, p2);
        Product hasil = Product.selectProduct(102, semuaProduk);
        System.out.println("Hasil pencarian produk ID 102: " + hasil);
    }
}