package Question_2;
public class ProductBill {
    private String priceText;
    private String quantityText;
    
    // Constructor to initialize both values
    public ProductBill(String priceText, String quantityText) {
        this.priceText = priceText;
        this.quantityText = quantityText;
    }
    
    public double calculateTotal() {
        double price = Double.parseDouble(priceText);
        int quantity = Integer.parseInt(quantityText);
        return price * quantity;
    }
}
