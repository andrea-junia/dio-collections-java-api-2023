package List.Search;

import java.util.ArrayList;
import java.util.List;

public class SumNumbers {
    private List<Integer> numbers;
    private String msg = "List Empty!";

    public SumNumbers() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int nr){
        this.numbers.add(nr);
    }

    public int sumNumbers(){
        int sum = 0;
        for (Integer nr: numbers){
            sum += nr;
        }
        return sum;
    }

    public int findBiggestNumber(){
        int biggestNr = Integer.MIN_VALUE;
        if (!numbers.isEmpty()) {
          for (Integer nr : numbers) {
            if (nr >= biggestNr) {
              biggestNr = nr;
            }
          }
          return biggestNr;
        } else {
          throw new RuntimeException(msg);
        }
    }

    public int findSmallestNumber(){
        int smallestNr = Integer.MAX_VALUE;
        if (!numbers.isEmpty()) {
          for (Integer nr : numbers) {
            if (nr <= smallestNr) {
              smallestNr = nr;
            }
          }
          return smallestNr;
        } else {
          throw new RuntimeException(msg);
        }
    }
    
    public void showNumbers() {
        if (!numbers.isEmpty()) {
          System.out.println(this.numbers);
        } else {
          System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SumNumbers
        SumNumbers sumNumbers = new SumNumbers();
    
        // Adicionando números à lista
        sumNumbers.addNumber(5);
        sumNumbers.addNumber(0);
        sumNumbers.addNumber(0);
        sumNumbers.addNumber(-2);
        sumNumbers.addNumber(10);
    
        // Exibindo a lista de números adicionados
        System.out.println("Numbers added:");
        sumNumbers.showNumbers();
    
        // Calculando e exibindo a soma dos números na lista
        System.out.println("Numbers sum = " + sumNumbers.sumNumbers());
    
        // Encontrando e exibindo o maior número na lista
        System.out.println("Biggest Number = " + sumNumbers.findBiggestNumber());
    
        // Encontrando e exibindo o menor número na lista
        System.out.println("Smallest Number = " + sumNumbers.findSmallestNumber());
      }
    
    
}
