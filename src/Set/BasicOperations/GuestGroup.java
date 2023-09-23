package Set.BasicOperations;

import java.util.HashSet;
import java.util.Set;

public class GuestGroup {
    private Set<Guest> guestSet;
    private String msg = "Empty Set.";

    public GuestGroup() {
        this.guestSet = new HashSet<>();
    }

    public void addGuest(String nm, int codeInvitation) {
        guestSet.add(new Guest(nm, codeInvitation));
    }

    public void removeGuestBycodeInvitation(int codeInvitation) {
        Guest guestRemoved = null;
        if (!guestSet.isEmpty()) {
          for (Guest c : guestSet) {
            if (c.getCodeInvitation() == codeInvitation) {
              guestRemoved = c;
              break;
            }
          }
          guestSet.remove(guestRemoved);
        } else {
          throw new RuntimeException(msg);
        }
    }

    public int countGuest() {
        return guestSet.size();
      }
    
    public void showGuest() {
        if (!guestSet.isEmpty()) {
            System.out.println(guestSet);
        } else {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe guestGroup
        GuestGroup guestGroup = new GuestGroup();
    
        // Exibindo o número de convidados no conjunto (deve ser zero)
        System.out.println("Existem " + guestGroup.countGuest() + " convidado(s) dentro do Set de Convidados");
    
        // Adicionando convidados ao conjunto
        guestGroup.addGuest("Alice", 1234);
        guestGroup.addGuest("Bob", 1235);
        guestGroup.addGuest("Charlie", 1235);
        guestGroup.addGuest("David", 1236);
    
        // Exibindo os convidados no conjunto
        System.out.println("Convidados no conjunto:");
        guestGroup.showGuest();
    
        // Exibindo o número atualizado de convidados no conjunto
        System.out.println("There are " + guestGroup.countGuest() + " guest(s) in the GuestGroup.");
    
        // Removendo um convidado do conjunto por código de convite
        guestGroup.removeGuestBycodeInvitation(1236);
        System.out.println("There are " + guestGroup.countGuest() + " guest(s) in the GuestGroup after remove.");
    
        // Exibindo os convidados atualizados no conjunto
        System.out.println("Guest(s) in the GuestGroup after remove:");
        guestGroup.showGuest();
      }   
    
}
