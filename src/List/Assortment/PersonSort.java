package List.Assortment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonSort {
    private List<Person> listPerson;

    public PersonSort() {
        this.listPerson = new ArrayList<>();
    }

    public void addPerson(String name, int age, double heigth){
        this.listPerson.add(new Person(name, age, heigth));
    }
    
    public List<Person> sortByAge(){
        List<Person> personAge = new ArrayList<>(listPerson);
        Collections.sort(personAge);
        return personAge;
    }
    
    public List<Person> sortByHeigth() {
        List<Person> personByHeigth = new ArrayList<>(listPerson);
        if (!listPerson.isEmpty()) {
          Collections.sort(personByHeigth, new ComparatorByHeigth());
          return personByHeigth;
        } else {
          throw new RuntimeException("Empty List!");
        }
    }

    public static void main(String[] args) {
    // Criando uma instância da classe PersonSort
        PersonSort PersonSort = new PersonSort();
    
        // Adicionando pessoas à lista
        PersonSort.addPerson("Alice", 20, 1.56);
        PersonSort.addPerson("Bob", 30, 1.80);
        PersonSort.addPerson("Charlie", 25, 1.70);
        PersonSort.addPerson("David", 17, 1.56);
    
        // Exibindo a lista de pessoas adicionadas
        System.out.println(PersonSort.listPerson);
    
        // Ordenando e exibindo por idade
        System.out.println(PersonSort.sortByAge());
    
        // Ordenando e exibindo por altura
        System.out.println(PersonSort.sortByHeigth());
    }
    
}
