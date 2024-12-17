package Exceptions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

class Unit1_Assignment {


    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            //this scanner class invokes and takes
            // in user inputs
            System.out.println("Input a paragraph or a lengthy text: ");
            String userInput = scanner.nextLine();


            int CharacterCount=userInput.length();

            int WordCount = userInput.split(" ").length;
            Unit1_Assignment global= new Unit1_Assignment();

            char MostCommonCharacter= global.getMostCommonCharacter(userInput.trim());
            // This variable holds the numbers of unique words from the user input
            int UniqueWords = global.getUniqueWordsCount(userInput.split(" "));


            System.out.println("User Input: " + userInput);
            System.out.println("________________________________________________________" );
            System.out.println("Character Count: " + CharacterCount);
            System.out.println("________________________________________________________" );
            System.out.println("Word Count: " + WordCount);
            System.out.println("________________________________________________________" );
            System.out.println("Most Common Character: " + MostCommonCharacter);
            System.out.println("________________________________________________________" );
            System.out.println("UniqueWords: " + UniqueWords);
            System.out.println("________________________________________________________" );
            //this method counts the user input character frequencies
            global.getCharacterFrequency(userInput);
            System.out.println("________________________________________________________" );
            //this method counts the user input word frequencies
            global.getWordFrequency(userInput.split(" "));



        } catch (Exception e) {
            System.out.println("Something went wrong with the program ");
        }
    }

    public int getUniqueWordsCount  (String[] data){
        HashSet<String> uniqueWords = new HashSet<>();

        // Loop through the array and add words to the set
        for (String word : data) {
            uniqueWords.add(word);
        }

        // Return the size of the set, which represents the count of unique words
        return uniqueWords.size();
    }

    public char getMostCommonCharacter(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty.");
        }

        int[] charCounts = new int[300];

        // Count occurrences of each character
        for (char c : input.toCharArray()) {
            charCounts[c]++;
        }

        // Find the most common character
        char mostCommon = input.charAt(0);
        int maxCount = 0;

        for (char c : input.toCharArray()) {
            if (charCounts[c] > maxCount) {
                mostCommon = c;
                maxCount = charCounts[c];
            }
        }

        return mostCommon;
    }

    public void getCharacterFrequency(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input string is null or empty.");
            return;
        }

        int[] charCounts = new int[300];

        // Count occurrences of each character
        for (char c : input.toCharArray()) {
            charCounts[c]++;
        }

        // Display the frequency of each character
        System.out.println("Character Frequencies:");
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 0) {
                System.out.println((char) i + ": " + charCounts[i]);
            }
        }
    }

    public void getWordFrequency(String[] words) {
        if (words == null || words.length == 0) {
            System.out.println("The array is empty or null.");
            return;
        }

        Map<String, Integer> wordCounts = new HashMap<>();

        // Count occurrences of each word
        for (String word : words) {
            word = word.toLowerCase();
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        // Display the word frequencies
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
