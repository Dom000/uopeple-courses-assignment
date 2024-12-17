public class Test {

    private String model;

    public Test(String model) {

        this.model = model;

    }

    public void accelerate() {

        System.out.println("The car is accelerating.");

    }

    public static void main(String[] args) {

        int x = 5;

        int y = x++ + ++x;

        System.out.println(y);

    }

}