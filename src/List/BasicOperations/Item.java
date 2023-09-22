package List.BasicOperations;

public class Item {
    private String description;
    private int quantity;
    private Double price;

    public Item(String description, int quantity, Double price) {
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }    
    
    public int getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                    "nome = '" + description + '\'' +
                    ", preco = " + price +
                    ", quantidade = " + quantity +
                '}';
    }
    
}