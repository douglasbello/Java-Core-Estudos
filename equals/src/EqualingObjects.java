public class EqualingObjects {
    public static void main(String[] args) {
        MyObject a = new MyObject("hello", 0);
        MyObject b = new MyObject("hello", 0);

        /* dois objetos com os mesmos valores nos atributos, comparados utilizando o operador '==' retorná falso
        porque ele está comparando a referência
        já utilizando o método equals, ele retorna verdadeiro, porque só compara os valores, mas vale lembrar que
        se usar o equals default do seu objeto, esse equals será a mesma coisa que um operador ==, portanto é preciso
        fazer a implementação do equals e hashcode no seu objeto, assim ele irá comparar apenas os valores,
        ignorando a referência
         */
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}