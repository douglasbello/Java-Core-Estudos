public class Main {
    public static void main(String[] args) {
        String hello = "hello";
        String world = "hello";
        String t = new String("hello");

        System.out.println(hello == world);
        System.out.println(hello.equals(world));
        System.out.println(hello.hashCode());
        System.out.println(world.hashCode());
        System.out.println(hello == t);
        System.out.println(hello.equals(t));

        String v = "hello";
        System.out.println(hello == v);
        int i = 0;
        String x = "hello";
        System.out.println(hello == x);

        String he = "he";
        String lo = "llo";

        String hello2 = he + lo;

        System.out.println("---------------");
        System.out.println(hello == hello2);
        System.out.println(hello.equals(hello2));
    }
}