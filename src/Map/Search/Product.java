package Map.Search;

public class Product {
    private String name;
    private double price;
    private int qtd;
    public Product(String name, double price, int qtd) {
        this.name = name;
        this.price = price;
        this.qtd = qtd;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQtd() {
        return qtd;
    }
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", qtd=" + qtd + "]";
    }
    
}
