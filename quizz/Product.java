import java.util.ArrayList;
import java.util.List;

public class Product {
    private int productId;
    private float productPrice;
    private String productType;
    private List<Stock> stocks = new ArrayList<>();

    public Product(int productId, float productPrice, String productType) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    public void addProduct() {
        System.out.println("[Product] Produk baru ditambahkan: ID " + productId);
    }

    public void modifyProduct() {
        System.out.println("[Product] Produk ID " + productId + " diperbarui.");
    }

    public static Product selectProduct(int productId, List<Product> daftarProduk) {
        for (Product p : daftarProduk) {
            if (p.getProductId() == productId) {
                return p;
            }
        }
        return null;
    }

    public void tambahStock(Stock stock) {
        stocks.add(stock);
    }

    public int getProductId() {
        return productId;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public String getProductType() {
        return productType;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public int totalStok() {
        int total = 0;
        for (Stock s : stocks) {
            total += s.getQuantity();
        }
        return total;
    }

    public String toString() {
        return "Product{id=" + productId + ", harga=" + productPrice + ", tipe='" + productType + "'}";
    }
}