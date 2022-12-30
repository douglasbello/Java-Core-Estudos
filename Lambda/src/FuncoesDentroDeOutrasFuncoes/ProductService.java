package FuncoesDentroDeOutrasFuncoes;

import entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filteredSum(List<Product2> list, Predicate<Product2> criteria) {
        double sum = 0.0;
        for (Product2 p : list) {
            if (criteria.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
