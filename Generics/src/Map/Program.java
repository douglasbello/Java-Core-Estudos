package Map;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main (String[] args) {
        Map<String,String> cookies = new TreeMap<>();

        cookies.put("username","thundercat");
        cookies.put("email","thundercat@gmail.com");
        cookies.put("phone","985909427");

        cookies.remove("email");

        cookies.put("phone","123124123"); // essa key phone sobreescreverá o phone antigo, pois o Map não aceita
        // keys repetidas.

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));

        System.out.println("ALL COOKIES: ");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}
