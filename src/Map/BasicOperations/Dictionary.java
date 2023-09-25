package Map.BasicOperations;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private Map<String,String> dictionaryMap;

    private String msg = "Empty Map";

    public Dictionary() {
        this.dictionaryMap = new HashMap<>();
    }

    public void addWord(String word,String meaning){
        dictionaryMap.put(word, meaning);
    }  
    
    public void removeWord(String word){
        if (!dictionaryMap.isEmpty()) {
            dictionaryMap.remove(word);
        } else {
            System.out.println(msg);
        }
    }

    public void printDictionary(){
        if (!dictionaryMap.isEmpty()) {
            System.out.println(dictionaryMap);
        } else {
            System.out.println(msg);
        }
    }

    public String searchByWord(String word){
        String meaning = dictionaryMap.get(word);
        String msg = "No meaning found ";
        if (!dictionaryMap.isEmpty()) {
            if(meaning != null){
                if (meaning.trim().isEmpty()){
                    return msg;    
                };
                return meaning;
            } 
            return "Word not found ";
        } else {
            return msg;
        }
      
    }
    
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
    
        // Adicionar contatos
        dictionary.addWord("java", "Linguagem de programação orientada a objetos.");
        dictionary.addWord("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dictionary.addWord("kotlin", "Linguagem moderna de programação para a JVM.");
        dictionary.addWord("ADVPL", " ");
    
        dictionary.printDictionary();
    
        // Remover um contato
        System.out.println("kotlin removed");
        dictionary.removeWord("kotlin");
        dictionary.printDictionary();
    
        // Pesquisar número por nome
        String searchedWord = "java";
        String searchMeaning = dictionary.searchByWord(searchedWord);
        System.out.println("Word: "+searchedWord + " Meaning: "+searchMeaning);
        
        searchedWord = "Java";
        searchMeaning = dictionary.searchByWord(searchedWord);
        System.out.println("Word: "+searchedWord + " Meaning: "+searchMeaning);

        searchedWord = "ADVPL";
        searchMeaning = dictionary.searchByWord(searchedWord);
        System.out.println("Word: "+searchedWord + " Meaning: "+searchMeaning);
    
      }
}
