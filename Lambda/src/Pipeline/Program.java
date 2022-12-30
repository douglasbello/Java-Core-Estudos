package Pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main (String[] args) {
        List<Integer> list = Arrays.asList(3,4,5,10,7);

        Stream<Integer> str1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(str1.toArray()));

        int soma = list.stream().reduce(0, Integer::sum);
        System.out.println("Sum = " + soma);

        List<Integer> newList = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());

        System.out.println(Arrays.toString(newList.toArray()));
    }
}
