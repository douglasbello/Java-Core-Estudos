public class Test {
    public static void main(String[] args) {
        String i = "hello";

        String he = "he";
        String llo = "llo";

        String hello = he + llo;
        System.out.println(i == hello);
        System.out.println(System.identityHashCode(i));
        System.out.println(System.identityHashCode(hello));
    }
}
