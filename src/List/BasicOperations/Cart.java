package List.BasicOperations;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    public List<Item> itemsList;
    private String msgDafault = "Empty Cart";

    public Cart() {
        this.itemsList = new ArrayList<>();
    }

    public void addItem(String nm, int qtd, double pr){
        Item item = new Item(nm, qtd, pr);
        this.itemsList.add(item);
    }

    public void removeItem(String descri){
        List<Item> itemsRemove = new ArrayList<>();
        if (!itemsList.isEmpty()) {
            for (Item i : itemsList) {
                if (i.getDescription().equalsIgnoreCase(descri)) {
                    itemsRemove.add(i);
                }                
            }
            itemsList.removeAll(itemsRemove);
        } else {
            System.out.println(msgDafault);
        }

    }

    public Double valueCart(){
        double vlT = 0d;

        if (!itemsList.isEmpty()){
            for (Item i : itemsList) {
                vlT += i.getPrice() * i.getQuantity(); 
            }
            return vlT;
        } else {
            throw new RuntimeException(msgDafault);
        }      
    }

    public void printCart(){
        if (!itemsList.isEmpty()) {
            System.out.println(this.itemsList);
        } else {
            System.out.println(msgDafault);
        }    
    }

    @Override
    public String toString() {
        return "Your Cart{" +
            "items=" + itemsList +
            '}';
    }

    public static void main(String[] args) {
        // instancia do carrinho de compras
        Cart cart = new Cart();
    
        // Adicionando itens 
        cart.addItem("Item um", 2, 1.5d);
        cart.addItem("Item dois", 5, 2.75d);
        cart.addItem("Item tres", 12, 0.5d);
    
        // Exibindo os itens 
        cart.printCart();
    
        // Removendo um item do carrinho
        cart.removeItem("Item tres");
    
        // Exibindo os itens atualizados no carrinho
        cart.printCart();
    
        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + cart.valueCart());
      }

    
    
}
