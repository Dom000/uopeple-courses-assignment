import textio.TextIO;

public class Uopeople_Unit1_assignment {

    // Options enum type
    enum Options {
        A('a'),
        B('b'),
        C('c'),
        D('d');

        private final char value;

        Options(char value) {
            this.value = value;
        }

        public static Options fromChar(char userAnswer) {
            /*
             * Converting the user answer to lowercase , since our Options
             * enums is typed in lowercase
             */
            userAnswer = Character.toLowerCase(userAnswer);
            for (Options option : Options.values()) {
                if (option.value == userAnswer) {
                    return option;
                }
            }
            throw new IllegalArgumentException("Invalid option : " + userAnswer);
        }

    }

    public static void main(String[] args) {

        // Questions
        String question1 = """
                Question 1:
                What is the capital of France?
                A. Berlin
                B. Madrid
                C. Paris
                D. Rome
                """;

        String question2 = """
                Question 2:
                Which element has the chemical symbol 'O'?
                A. Oxygen
                B. Gold
                C. Silver
                D. Hydrogen
                """;

        String question3 = """
                Question 3:
                What is the largest planet in our solar system?
                a. Earth
                b. Mars
                c. Jupiter
                d. Saturn
                """;

        String question4 = """
                   Question 4:
                   Who wrote "To Kill a Mockingbird"?
                   a. Harper Lee
                   b. Mark Twain
                   c. F. Scott Fitzgerald
                   d. Ernest Hemingway
                """;

        String question5 = """
                   Question 5:
                   What is the process of cell division in somatic cells called?
                   a. Meiosis
                   b. Mitosis
                   c. Binary fission
                   d. Cytokinesis
                """;

        // correct answers to each questions

        Options answerToQuestion1 = Options.C;
        Options answerToQuestion2 = Options.A;
        Options answerToQuestion3 = Options.C;
        Options answerToQuestion4 = Options.A;
        Options answerToQuestion5 = Options.B;

        // user inputted answers;

        Options userAnswerToQuestion1;
        Options userAnswerToQuestion2;
        Options userAnswerToQuestion3;
        Options userAnswerToQuestion4;
        Options userAnswerToQuestion5;

        int userMarks = 0;

        // This print in the question follow by a System Input package (textio) that can
        // help retreive the user answere amd move to the next question
        System.out.println(question1);
        userAnswerToQuestion1 = Options.fromChar(TextIO.getChar());
        System.out.println(question2);
        userAnswerToQuestion2 = Options.fromChar(TextIO.getChar());
        System.out.println(question3);
        userAnswerToQuestion3 = Options.fromChar(TextIO.getChar());
        System.out.println(question4);
        userAnswerToQuestion4 = Options.fromChar(TextIO.getChar());
        System.out.println(question5);
        userAnswerToQuestion5 = Options.fromChar(TextIO.getChar());

        // an conditional if block to check and grade the user responses
        if (userAnswerToQuestion1 == answerToQuestion1) {
            userMarks += 10;
        }

        if (userAnswerToQuestion2 == answerToQuestion2) {
            userMarks += 10;
        }

        if (userAnswerToQuestion3 == answerToQuestion3) {
            userMarks += 10;
        }

        if (userAnswerToQuestion4 == answerToQuestion4) {
            userMarks += 10;
        }

        if (userAnswerToQuestion5 == answerToQuestion5) {
            userMarks += 10;
        }

        // the reult string literals to display the final result to the user
        String result = String.format("""
                1.What is the capital of France? : """ + userAnswerToQuestion1 + """

                Result : %s
                Correct answer : """ + answerToQuestion1 + """

                ----------------------------------------------------------------------------

                2.Which element has the chemical symbol 'O'? : """ + userAnswerToQuestion2 + """

                Result : %s
                Correct answer : """ + answerToQuestion2 + """


                ----------------------------------------------------------------------------


                3.What is the largest planet in our solar system? : """ + userAnswerToQuestion3 + """

                Result : %s
                Correct answer : """ + answerToQuestion3 + """

                ----------------------------------------------------------------------------


                4.Who wrote "To Kill a Mockingbird"? : """ + userAnswerToQuestion4 + """

                Result : %s
                Correct answer : """ + answerToQuestion4 + """

                ----------------------------------------------------------------------------


                5.What is the process of cell division in somatic cells called? : """ + userAnswerToQuestion5 + """

                Result : %s
                Correct answer : """ + answerToQuestion5 + """

                __________________________________________________________________________

                Final Score : """ + userMarks + """
                /100

                    """, userAnswerToQuestion1 == answerToQuestion1 ? "Correct" : "Failed",
                userAnswerToQuestion2 == answerToQuestion2 ? "Correct" : "Failed",
                userAnswerToQuestion3 == answerToQuestion3 ? "Correct" : "Failed",
                userAnswerToQuestion4 == answerToQuestion4 ? "Correct" : "Failed",
                userAnswerToQuestion5 == answerToQuestion5 ? "Correct" : "Failed");

        System.out.println(result);

    }

}
