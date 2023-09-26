package Map.Search;

import java.util.HashMap;
import java.util.Map;

public class CountingWords {
    private Map<String, Integer> wordsMap;

    public CountingWords() {
        this.wordsMap = new HashMap<>();;
    }

    public void addWord(String word, int count){
        wordsMap.put(word, count);
    }

    public void removeWord(String word){
        if(!wordsMap.isEmpty()){
            wordsMap.remove(word);
        } else {
            System.out.println("Empty Map");
        }
        
    }

    public int printCountingWords(){
        int totalWord = 0;
        for (int count : wordsMap.values()) {
            totalWord += count;
        }
        return totalWord;
    }

    public String findMostFrequentlyWord() {
        String mostFrequentlyWord = null;
        int majorCount = 0;
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
          if (entry.getValue() > majorCount) {
            majorCount = entry.getValue();
            mostFrequentlyWord = entry.getKey();
          }
        }
        return mostFrequentlyWord;
    }

    public static void main(String[] args) {
        CountingWords countWords = new CountingWords();
    
        // Adiciona linguagens e suas contagens
        countWords.addWord("Java", 2);
        countWords.addWord("Python", 8);
        countWords.addWord("JavaScript", 1);
        countWords.addWord("C#", 6);
    
        // Exibe a contagem total de linguagens
        System.out.println("Total words in the Map is " + countWords.printCountingWords() + ".");
    
        // Encontra e exibe a linguagem mais frequente
        String mostFrequentlyWord = countWords.findMostFrequentlyWord();
        System.out.println("The common word is: " + mostFrequentlyWord);
    }
    
    
}
