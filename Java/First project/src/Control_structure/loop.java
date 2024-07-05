package Control_structure;

import java.util.Scanner;


public class loop {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] arg) {
        int userRes;

        do {
            System.out.println("Enter an integer from 1 - 10");
            userRes = sc.nextInt();


        } while (userRes < 1 || userRes > 10);

        System.out.println(userRes + " Is between 1 and 10");


    }


}
