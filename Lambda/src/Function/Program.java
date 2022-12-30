package Function;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main (String[] args) {

        List<AnyClass> list = new ArrayList<>();

        list.add(new AnyClass("TV",900.00));
        list.add(new AnyClass("Mouse",50.00));
        list.add(new AnyClass("Tablet",350.50));
        list.add(new AnyClass("HD Case",80.90));

        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        // Comparator<String> compareString = Comparator.comparing(String::toUpperCase);


        // abaixo utilizando método estático
        //List<String> names2 = list.stream().map(AnyClass::staticUpperCaseName).collect(Collectors.toList());

        // utilizando método não estático
        //List<String> names2 = list.stream().map(AnyClass::nonStaticUpperCaseName).collect(Collectors.toList());

        // usando expressão lambda
        //Function<AnyClass,String> func = a -> a.getName().toUpperCase();
        //List<String> names2 = list.stream().map(func).collect(Collectors.toList());


        // expressão lambda inline
        List<String> names2 = list.stream().map(a -> a.getName().toUpperCase()).collect(Collectors.toList());

        Comparator<String> compareString = (str1,str2) -> str1.toUpperCase().compareTo(str2.toUpperCase());

        names2.sort(compareString);
        names2.forEach(System.out::println);
        names.sort(compareString);
        names.forEach(System.out::println);

    }
}
