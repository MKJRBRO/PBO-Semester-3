/**
 * Kelas Stock (bagian/part dari Product melalui agregasi).
 */
public class Stock {
    private int quantity;
    private int shopNo;

    public Stock(int quantity, int shopNo) {
        this.quantity = quantity;
        this.shopNo = shopNo;
    }

    public void addStock() {
        System.out.println("[Stock] Stok baru ditambahkan di toko " + shopNo + ": " + quantity + " unit.");
    }

    public void modifyStock(int productId) {
        System.out.println("[Stock] Stok untuk produk ID " + productId + " di toko " + shopNo + " diperbarui.");
    }

    public Stock selectStockItem(int productId) {
        System.out.println("[Stock] Menampilkan stok produk ID " + productId + " di toko " + shopNo);
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getShopNo() {
        return shopNo;
    }

    public String toString() {
        return "Stock{jumlah=" + quantity + ", toko=" + shopNo + "}";
    }
}