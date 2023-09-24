package Set.Assortment;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product> {
    long code;
    String description;
    double price;
    int quantity;

    public Product(long code, String description, double price, int quantity) {
        this.code = code;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Product p) {
        return description.compareToIgnoreCase(p.getDescription());
    }
   

    public long getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product [code=" + code + 
               ", description=" + description + 
               ", price=" + price + 
               ", quantity=" + quantity
                + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return getCode() == product.getCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
    }
    
}

class ComparatorByPrice implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}