package Function;

import java.util.Comparator;

public class AnyClass {
    private String name;
    private Double price;

    public AnyClass(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static String staticUpperCaseName(AnyClass a) {
        return a.getName().toUpperCase();
    }

    public String nonStaticUpperCaseName() {
        return name.toUpperCase();
    }
}
