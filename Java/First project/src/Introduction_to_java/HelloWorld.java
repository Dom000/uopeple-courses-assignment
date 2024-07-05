public class HelloWorld {
  public static int multiply(int a) {
      return a * 2;
  }


     public static boolean isEven(int a) {
          return a % 2 == 0;
     }

    public static void main(String[] data) {
        int age = multiply(10) ;
        float money=9;
        String sentence = "i said \"Hello World!\"\n";
//        char[] myname=['G'];

        System.out.println(isEven(11));
        System.out.println(sentence);
    }


}