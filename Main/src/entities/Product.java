package entities;
public class Product {
    private String name;
    private double price;
    private int quantity;
    public Product() { // no Program.java é só fazer Product product = new Product() que irá vir todos os atributos com valor padrão.
    }
    public Product(String name, double price, int quantity) { // construtor, é executado no momento da instanciação do objeto.
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String name, double price) { // instanciação sem quantity, então quantity recebe 0 **SOBRECARGA
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public double totalValueInStock() { // mostra o valor total (dólares) de produtos no estoque
        return price * quantity;
    }
    public void addProducts(int quantity) { // adiciona produto
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) { // remove produto
        this.quantity -= quantity;
    }
    /**
     * System.out.println(product.toString()) -- não é necessário fazer isso, pois o java entende que sozinho que é pra chamar o toString
     * por isso é usado apenas System.out.println(product)
     * -- assim ele já entende que é pra chamar o toString, pois está em uma função System.out.println()
     * */
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}