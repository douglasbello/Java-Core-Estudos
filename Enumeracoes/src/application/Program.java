package application;

import entities.OrderStatus;
import java.util.Date;
import entities.Order;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.ENVIADO);
        System.out.println(order);

        // CONVERSÃO DE STRING PARA ENUM
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); //
        System.out.println(os1);
        System.out.println(os2);
    }
}
