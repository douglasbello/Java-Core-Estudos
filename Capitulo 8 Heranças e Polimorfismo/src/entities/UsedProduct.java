package entities;

import java.util.Date;

public final class UsedProduct extends Product {
    private Date manufactureDate;


    public UsedProduct() {
        super();
    }
    public UsedProduct(String name,Double price,Date manufactureDate) {
        super(name,price);
        this.manufactureDate = manufactureDate;
    }
    @Override
    public String priceTag() {
        return name + "(used) " + "$ " + price + "(Manufacture date: " + manufactureDate + ")";
    }
}
