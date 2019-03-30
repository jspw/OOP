package OOP;

public class TryCatch {

    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            int result = x / y;

            System.out.println("the result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("caught Exception");
            System.out.println(e);
        }
    }
}
