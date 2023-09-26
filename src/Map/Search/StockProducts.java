package Map.Search;

import java.util.HashMap;
import java.util.Map;

public class StockProducts {
    private Map<Long, Product> stockProductsMap;

    public StockProducts() {
        this.stockProductsMap = new HashMap<>();
    }

    public void addProduct(long cod, String name, int qtd, double price){
        stockProductsMap.put(cod, new Product (name, price, qtd));
    }

    public void printProducts() {
        System.out.println(stockProductsMap);
    }
    
    public double calculateTotalValueStock() {
        double valueTotalStock = 0d;
        if (!stockProductsMap.isEmpty()) {
          for (Product p : stockProductsMap.values()) {
            valueTotalStock += p.getQtd() * p.getPrice();
          }
        }
        return valueTotalStock;
    }
    
    public Product getproductMoreExpensive() {
        Product productMoreExpensive = null;
        double biggerPrice = Double.MIN_VALUE;
        for (Product p : stockProductsMap.values()) {
          if (p.getPrice() > biggerPrice) {
            productMoreExpensive = p;
            biggerPrice = p.getPrice();
          }
        }
        return productMoreExpensive;
    }
    
    public Product getCheapestProduct() {
        Product productMoreCheap = null;
        double lowerPrice = Double.MAX_VALUE;
        for (Product p : stockProductsMap.values()) {
          if (p.getPrice() < lowerPrice) {
            productMoreCheap = p;
            lowerPrice = p.getPrice();
          }
        }
        return productMoreCheap;
    }

    public Product getProductLargestQuantityTotalValueInStock() {
        Product productLargestQuantityValueInStock = null;
        double biggerValueTotalProductInStock = 0d;
        if (!stockProductsMap.isEmpty()) {
          for (Map.Entry<Long, Product> entry : stockProductsMap.entrySet()) {
            double ValueProductEmStock = entry.getValue().getPrice() * entry.getValue().getQtd();
            if (ValueProductEmStock > biggerValueTotalProductInStock) {
              biggerValueTotalProductInStock = ValueProductEmStock;
              productLargestQuantityValueInStock = entry.getValue();
            }
          }
        }
        return productLargestQuantityValueInStock;
    }
    
    public static void main(String[] args){
        
        StockProducts stock = new StockProducts();

        // Exibe o stock vazio
        stock.printProducts();
    
        // Adiciona Products ao stock
        stock.addProduct(1L, "Notebook", 1, 1500.0);
        stock.addProduct(2L, "Mouse", 5, 25.0);
        stock.addProduct(3L, "Monitor", 10, 400.0);
        stock.addProduct(4L, "Teclado", 2, 40.0);
    
        // Exibe os Products no stock
        stock.printProducts();
    
        // Calcula e exibe o Value total do stock
        System.out.println("Stock total value: R$" + stock.calculateTotalValueStock());
    
        // Obtém e exibe o Product mais caro
        Product moreExpensiveProduct = stock.getproductMoreExpensive();
        System.out.println("Product more expensive: " + moreExpensiveProduct);
    
        // Obtém e exibe o Product mais barato
        Product cheapestProduct = stock.getCheapestProduct();
        System.out.println("Cheapest Product: " + cheapestProduct);
    
        // Obtém e exibe o Product com a bigger quantidade em Value no stock
        Product productbiggerQuantityTotalValue = stock.getProductLargestQuantityTotalValueInStock();
        System.out.println("Product with the highest quantity in value out of stock: " + productbiggerQuantityTotalValue);

    }
}
