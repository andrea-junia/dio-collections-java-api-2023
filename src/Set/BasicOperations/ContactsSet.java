package Set.BasicOperations;

import java.util.HashSet;
import java.util.Set;

public class ContactsSet {

    private Set<Contact> setContacts;

    public ContactsSet() {
        this.setContacts = new HashSet<>();
    }

    public void addContact(String name, int phoneNumber){
        setContacts.add(new Contact(name, phoneNumber));
    }

    public void printContact(){
        if(!setContacts.isEmpty()){
            System.out.println(setContacts);
        } else {
            System.out.println("Empty Set Contacts");
        }        
    }

    public Set<Contact> searchByName (String name){
        Set<Contact> searchedContact = new HashSet<>();

        if(!setContacts.isEmpty()){
            for (Contact c : searchedContact) {
                if (c.getName().startsWith(name)) {
                  searchedContact.add(c);
                }
            }
            return searchedContact;
        } else {
            throw new RuntimeException("Empty Set Contacts");
        }
    }

    public Contact updateContact(String name, int newPhoneNumber) {
        Contact updateContact= null;
        if (!setContacts.isEmpty()) {
          for (Contact c : setContacts) {
            if (c.getName().equalsIgnoreCase(name)) {
              c.setPhoneNumber(newPhoneNumber);
              updateContact = c;
              break;
            }
          }
          return updateContact;
        } else {
          throw new RuntimeException("O conjunto está vazio!");
        }
      } 
      
      public static void main(String[] args) {
        // Criando uma instância da classe contactsSet
        ContactsSet contactsSet = new ContactsSet();
    
        // Exibindo os contatos no conjunto (deve estar vazio)
        contactsSet.printContact();
    
        // Adicionando contatos à agenda
        contactsSet.addContact("João", 123456789);
        contactsSet.addContact("Maria", 987654321);
        contactsSet.addContact("Maria Fernandes", 55555555);
        contactsSet.addContact("Ana", 88889999);
        contactsSet.addContact("Fernando", 77778888);
        contactsSet.addContact("Carolina", 55555555);
    
        // Exibindo os contatos na agenda
        contactsSet.printContact();
    
        // Pesquisando contatos pelo nome
        System.out.println(contactsSet.searchByName("Maria"));
    
        // Atualizando o número de um contato
        Contact updatedContact = contactsSet.updateContact("Carolina", 44443333);
        System.out.println("Contact updated: " + updatedContact);
    
        // Exibindo os contatos atualizados na agenda
        System.out.println("Contacts after update:");
        contactsSet.printContact();
      }
    
}
