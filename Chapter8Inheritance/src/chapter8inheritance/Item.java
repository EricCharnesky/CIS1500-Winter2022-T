package chapter8inheritance;

public class Item {

    private String name;
    private String sku;
    private double unitPrice;
    private int quantity;

    public Item(String name, String sku, double unitPrice, int quantity) {
        this.name = name;
        this.sku = sku;
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public double getTotalPrice() {
        return unitPrice * quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
            return true;
        }
        this.quantity = 0;
        return false;

    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice > 0) {
            this.unitPrice = unitPrice;
        } else {
            this.unitPrice = 0;
        }
    }

    public String getName() {
        return name;
    }

    public String getSku() {
        return sku;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

}
