package Set.Assortment;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRregistration {

    private Set<Product> productSet;

    public ProductRregistration() {
        this.productSet = new HashSet<>();
    }
    
    public void addProduct(long code, String description, double price, int quantity){
        productSet.add(new Product(code, description, price, quantity));
    }
    
    public Set<Product> printProductByDescription(){
        Set<Product> productByDescription = new TreeSet<>(productSet);
        if (!productSet.isEmpty()){
            return productByDescription;
        } else {
            throw new RuntimeException("Empty Set");
        }
    }
    
    public Set<Product> printProductByPrice(){
        Set<Product> productByPrice = new TreeSet<>(new ComparatorByPrice());
        if (!productSet.isEmpty()){
            productByPrice.addAll(productSet);
            return productByPrice;
        } else {
            throw new RuntimeException("Empty Set");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância do ProductRregistration
        ProductRregistration productRregistration = new ProductRregistration();
    
        // Adicionando produtos ao cadastro
        productRregistration.addProduct(1L, "Smartphone", 1000d, 10);
        productRregistration.addProduct(2L, "Notebook", 1500d, 5);
        productRregistration.addProduct(1L, "Mouse", 30d, 20);
        productRregistration.addProduct(4L, "Teclado", 50d, 15);
    
        // Exibindo todos os produtos no cadastro
        System.out.println(productRregistration.productSet);
    
        // Exibindo produtos ordenados por nome
        System.out.println(productRregistration.printProductByDescription());
    
        // Exibindo produtos ordenados por preço
        System.out.println(productRregistration.printProductByPrice());
    }

}
