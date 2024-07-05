package Introduction_to_java;

import textio.TextIO;

public class Text {

    enum Season { SPRING, SUMMER, FALL, WINTER }

    public static void main(String[] args) {
        int userInput; // The number input by the user.
        int square; // The userInput, multiplied by itself.
        System.out.print("Please type a number: ");
        userInput = TextIO.getlnInt();
        square = userInput * userInput;
        System.out.println();
        System.out.println("The number that you entered was " + userInput);
        System.out.println("The square of that number is " + square);
        System.out.println();
    }

}