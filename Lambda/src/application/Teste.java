package application;

import entities.Bla;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Teste {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        List<Bla> ble = new ArrayList<>();

        ble.add(new Bla("um",1.0));
        ble.add(new Bla("dois",2.0));

        Consumer<Bla> con = n -> n.setUmdoistres(n.getUmdoistres() * 4.0);


        // outro jeito de escrever a expressão lambda
        Consumer<Bla> con2 = n -> {
            n.setUmdoistres(n.getUmdoistres() * 4.0);
        };

        ble.forEach(n -> n.setUmdoistres(n.getUmdoistres() * 4.0));

        ble.forEach(con);
        ble.forEach(n -> System.out.println(n.getName() + " " + String.format("%.2f",n.getUmdoistres())));
    }

}
