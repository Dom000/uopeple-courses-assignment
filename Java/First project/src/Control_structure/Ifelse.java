package Control_structure;

public class Ifelse {

    public static void main(String[] arg) {
        int i = 0;

        outer:

        while (i < 5) {

            inner:

            for (int j = 0; j < 3; j++) {

                if (i == 3)

                    break outer;

                if (j == 2)

                    continue inner;

                System.out.print(i + j + " ");

            }

            i++;

        }
    }
}
