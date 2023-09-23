package Set.BasicOperations;

import java.util.HashSet;
import java.util.Set;

public class UniqueWords {

    private Set<String> uniqueWordsSet;

    public UniqueWords() {
        this.uniqueWordsSet = new HashSet<>();
    }

    private void addWord(String word){
        uniqueWordsSet.add(word);
    }

    private void removeWord(String word){

        if (!uniqueWordsSet.isEmpty()){
            if(uniqueWordsSet.contains(word)){
                uniqueWordsSet.remove(word);
            } else {
                System.out.println("The word "+word+" is not in the set!");
            }
        } else {
            System.out.println("Empty Set!");
        }        
    }

    private boolean searchWord(String word){
        return (uniqueWordsSet.contains(word));
    }
    
    private void printUniqueWords(){

        if (!uniqueWordsSet.isEmpty()){
            System.out.println(uniqueWordsSet);
        } else {
            System.out.println("Empty Set!");
        }        
    }    

    public static void main(String[] args) {
        // Criando uma instância da classe uniqueWordsSet
        UniqueWords citiesSet = new UniqueWords();
    
        // Adicionando linguagens únicas ao conjunto
        citiesSet.addWord("Vancouver");
        citiesSet.addWord("New York");
        citiesSet.addWord("Roma");
        citiesSet.addWord("Venice");
        citiesSet.addWord("Rio de Janeiro");
        citiesSet.addWord("Uberaba");
    
        // Exibindo as linguagens únicas no conjunto
        citiesSet.printUniqueWords();
    
        // Removendo uma linguagem do conjunto
        citiesSet.removeWord("Vancouver");
        citiesSet.printUniqueWords();
    
        // Removendo uma linguagem inexistente
        citiesSet.removeWord("Sao Paulo");
    
        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Uberaba' está no conjunto? " + citiesSet.searchWord("Uberaba"));
        System.out.println("A linguagem 'Londres' está no conjunto? " + citiesSet.searchWord("Londres"));
    
        // Exibindo as linguagens únicas atualizadas no conjunto
        citiesSet.printUniqueWords();
      }
}
