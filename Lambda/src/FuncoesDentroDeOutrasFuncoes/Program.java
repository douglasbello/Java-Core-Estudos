package FuncoesDentroDeOutrasFuncoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        List<Product2> list = new ArrayList<>();

        list.add(new Product2("Tv",900.00));
        list.add(new Product2("Mouse",50.00));
        list.add(new Product2("Tablet",350.50));
        list.add(new Product2("HD Case",80.90));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getPrice() < 100.0);

        System.out.println("Sum = " + String.format("%.2f",sum));

    }
}
