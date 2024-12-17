package clock;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The Clock class is responsible for maintaining and displaying the current time and date.
 */
public class Clock {
    private volatile String currentTime; // Holds the current time and date as a string

    /**
     * Constructor to initialize the clock with the current time.
     */
    public Clock() {
        updateCurrentTime();
    }

    /**
     * Updates the current time and date in "HH:mm:ss dd-MM-yyyy" format.
     */
    public void updateCurrentTime() {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
        currentTime = dateFormatter.format(new Date());
    }

    /**
     * Retrieves the current time and date.
     *
     * @return the current time and date as a String
     */
    public String getCurrentTime() {
        return currentTime;
    }
    public static void main(String[] args) {
        Clock clock = new Clock();

        // Thread to continuously update the clock's time
        Thread timeUpdateThread = new Thread(new TimeUpdater(clock), "TimeUpdaterThread");

        // Thread to continuously display the current time in the console
        Thread timeDisplayThread = new Thread(new TimeDisplay(clock), "TimeDisplayThread");

        // Set thread priorities
        timeUpdateThread.setPriority(Thread.MIN_PRIORITY);   // Lower priority for updating time
        timeDisplayThread.setPriority(Thread.MAX_PRIORITY);  // Higher priority for displaying time

        // Start both threads
        timeUpdateThread.start();
        timeDisplayThread.start();
    }
}

/**
 * The TimeUpdater class is a Runnable that continuously updates the time in the Clock object.
 */
class TimeUpdater implements Runnable {
    private final Clock clock;

    public TimeUpdater(Clock clock) {
        this.clock = clock;
    }

    @Override
    public void run() {
        while (true) {
            try {
                clock.updateCurrentTime(); // Update the time in the Clock object
                Thread.sleep(1000);        // Sleep for 1 second before the next update
            } catch (InterruptedException e) {
                System.err.println("Time update thread interrupted: " + e.getMessage());
                Thread.currentThread().interrupt(); // Restore the interrupted status
                break;
            }
        }
    }
}

/**
 * The TimeDisplay class is a Runnable that continuously displays the current time from the Clock object.
 */
class TimeDisplay implements Runnable {
    private final Clock clock;

    public TimeDisplay(Clock clock) {
        this.clock = clock;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Current Time: " + clock.getCurrentTime()); // Print the current time
                Thread.sleep(1000); // Sleep for 1 second before the next display
            } catch (InterruptedException e) {
                System.err.println("Time display thread interrupted: " + e.getMessage());
                Thread.currentThread().interrupt(); // Restore the interrupted status
                break;
            }
        }
    }
}

