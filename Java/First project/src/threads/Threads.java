package threads;

public class Threads extends Thread {
    private String name;  // The name of this thread.
    public Threads(String name) {  // Constructor gives name to thread.
        this.name = name;
    }
    public void run() {  // The run method prints a message to standard output.
        System.out.println("Greetings from thread '" + name + "'!");
    }

}
