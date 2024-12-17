package threads;

/**
 * When a thread belonging to this class is run it will count the
 * number of primes between 2 and MAX.  It will print the result
 * to standard output, along with its ID number and the elapsed
 * time between the start and the end of the computation.
 */
public class CountPrimeThreads extends Thread {
    private final static int MAX = 10_000_000;


    int id;  // An id number for this thread; specified in the constructor.

    public CountPrimeThreads(int id) {
        this.id = id;
    }

    public void run() {
        long startTime = System.currentTimeMillis();
        int count = countPrimes(2, MAX); // Counts the primes.
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Thread " + id + " counted " +
                count + " primes in " + (elapsedTime / 1000.0) + " seconds.");
    }

    /**
     * Compute and return the number of prime numbers in the range
     * min to max, inclusive.
     */
    private static int countPrimes(int min, int max) {
        int count = 0;
        for (int i = min; i <= max; i++)
            if (isPrime(i))
                count++;
        return count;
    }


    /**
     * Test whether x is a prime number.
     * x is assumed to be greater than 1.
     */
    private static boolean isPrime(int x) {
        assert x > 1;
        int top = (int) Math.sqrt(x);
        for (int i = 2; i <= top; i++)
            if (x % i == 0)
                return false;
        return true;
    }
}

