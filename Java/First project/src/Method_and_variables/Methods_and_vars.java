package Method_and_variables;

class MyClass {

    static int count = 0;

    public MyClass() {

        count++;

    }

    public static int getCount() {

        return count;

    }

}

class Parent {

    static void print() {

        System.out.println("Parent");

    }

}

class Child extends Parent {

    static void print() {

        System.out.println("Child");

    }

}

public class Methods_and_vars {


    public static void main(String[] args) {

        MyClass obj1 = new MyClass();

        MyClass obj2 = new MyClass();

        Parent obj = new Child();

        obj.print();


    }

    public class Rectangle {

        private int width;

        private int height;


        public Rectangle(int width, int height) {

            this.width = width;

            this.height = height;

        }


        public int calculateArea() {

            return width * height;

        }


        public void printDimensions() {

            System.out.println("Width: " + width + ", Height: " + height);

        }

    }

}



