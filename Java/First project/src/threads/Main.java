package threads;

import textio.TextIO;

public class Main {
    public static void main(String[] args) {
//        Threads greetings = new Threads("Fred");
//        greetings.start();
//        System.out.println("Thread has been started");

//        int numberOfThreads = 0;
//        while (numberOfThreads < 1 || numberOfThreads > 30) {
//            System.out.print("How many threads do you want to use  (from 1 to 30) ?  ");
//            numberOfThreads = TextIO.getlnInt();
//            if (numberOfThreads < 1 || numberOfThreads > 30)
//                System.out.println("Please enter a number between 1 and 30 !");
//        }
//        System.out.println("\nCreating " + numberOfThreads + " prime-counting threads...");
//        CountPrimeThreads[] worker = new CountPrimeThreads[numberOfThreads];
//        for (int i = 0; i < numberOfThreads; i++)
//            worker[i] = new CountPrimeThreads( i );
//        for (int i = 0; i < numberOfThreads; i++)
//            worker[i].start();
//        System.out.println("Threads have been created and started.");
       int rtn=  Runtime.getRuntime().availableProcessors();
       System.out.println("Threads have been created and available processors: " + rtn);

    }
}
