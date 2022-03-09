package chapter8inheritance;

// creates inheritance with 'extends' keyword - super class/parent class/base class
public class TaxableItem extends Item { // Taxable item is a sub class/child class/derived class

    private double taxRate;

    public TaxableItem(String name, String sku, double unitPrice, int quantity, double taxRate) {
        // you MUST call the superclass constructor if it doesn't have a no argument / default constructor
        super(name, sku, unitPrice, quantity);
        setTaxRate(taxRate);
    }
    
    @Override
    public double getTotalPrice(){
        return super.getTotalPrice() * ( 1 + taxRate);
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        if (taxRate > 0) {
            this.taxRate = taxRate;
        } else {
            this.taxRate = 0;
        }
    }

}
