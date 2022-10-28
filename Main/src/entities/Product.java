package entities;
public class Product {
    private String name;
    private double price;
    private int quantity;
    public Product() { // no Program.java � s� fazer Product product = new Product() que ir� vir todos os atributos com valor padr�o.
    }
    public Product(String name, double price, int quantity) { // construtor, � executado no momento da instancia��o do objeto.
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String name, double price) { // instancia��o sem quantity, ent�o quantity recebe 0 **SOBRECARGA
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
    public double totalValueInStock() { // mostra o valor total (d�lares) de produtos no estoque
        return price * quantity;
    }
    public void addProducts(int quantity) { // adiciona produto
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) { // remove produto
        this.quantity -= quantity;
    }
    /**
     * System.out.println(product.toString()) -- n�o � necess�rio fazer isso, pois o java entende que sozinho que � pra chamar o toString
     * por isso � usado apenas System.out.println(product)
     * -- assim ele j� entende que � pra chamar o toString, pois est� em uma fun��o System.out.println()
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