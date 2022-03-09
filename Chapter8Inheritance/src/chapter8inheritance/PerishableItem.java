package chapter8inheritance;

import java.util.Date;


public class PerishableItem extends Item {
    
    private Date expirationDate;
    
    public PerishableItem(String name, String sku, double unitPrice, int quantity, Date expirationDate) {
        super(name, sku, unitPrice, quantity);
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }
    
    public boolean isExpired(){
        return new Date().before(expirationDate);
    }
    
    @Override
    public double getTotalPrice(){
        if (isExpired()){
            return 0;
        }
        return super.getTotalPrice();
    }
    
}
