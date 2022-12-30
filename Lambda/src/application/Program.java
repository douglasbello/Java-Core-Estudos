package application;
import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main (String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV",900.00));
        list.add(new Product("Notebook",1200.00));
        list.add(new Product("Tablet",450.00));


        // FUNÇÃO ANÔNIMA -> do lado esquerdo os parametros (não é necessário colocar o tipo dos parâmetros) '->' e a
        // implementação da função dentro das chaves

        // esse tipo de função também é chamada de arrow function

        // função anônima, expressão lambda
        Comparator<Product> comp = (p1,p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        Comparator<Product> comp2 = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());


//      Comparator<Product> comp = new Comparator<Product>() {      // ---> classe anônima
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//            }
//        };

        list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        //list.sort(comp2);
        //list.sort(new MyComparator());
        for (Product p : list) {
            System.out.println(p);
        }
    }
}
