package Map.BasicOperations;

import java.util.HashMap;
import java.util.Map;

public class ContactsList {

    private Map<String, Integer> contactsListMap;
    private String msg = "Empty Map";

    public ContactsList() {
        this.contactsListMap = new HashMap<>();
    }

    public void addContact (String name, int phoneNumber){
        contactsListMap.put(name, phoneNumber);
    }

    public void removeContact(String name) {
        if (!contactsListMap.isEmpty()) {
          contactsListMap.remove(name);
        } else {
          System.out.println(msg);
        }
    }

    public void printContactsMap() {
        if (!contactsListMap.isEmpty()) {
          System.out.println(contactsListMap);
        } else {
          System.out.println(msg);
        }
    }

    public Integer searchByName (String name) {
        Integer numberByName = null;
        if (!contactsListMap.isEmpty()) {
          numberByName = contactsListMap.get(name);
          if (numberByName == null) {
            System.out.println("Contact not found.");
          }
        } else {
          System.out.println(msg);
        }
        return numberByName;
    }

    public static void main(String[] args) {
        ContactsList contactsList = new ContactsList();
    
        // Adicionar contatos
        contactsList.addContact("Camila", 123456);
        contactsList.addContact("João", 5665);
        contactsList.addContact("Carlos", 1111111);
        contactsList.addContact("Ana", 654987);
        contactsList.addContact("Maria", 1111111);
        contactsList.addContact("Camila", 44444);
    
        contactsList.printContactsMap();
    
        // Remover um contato
        contactsList.removeContact("Maria");
        contactsList.printContactsMap();
    
        // Pesquisar número por nome
        String searchName = "João";
        Integer searchNumber = contactsList.searchByName("João");
        System.out.println("The phone contact of " + searchName + " is " + searchNumber);
    
        String searchNameNotFound = "Paula";
        Integer searchNumberNotFound = contactsList.searchByName(searchNameNotFound);
        System.out.println("Phone contact of " + searchNameNotFound + ": " + searchNumberNotFound);
      }
    
}
