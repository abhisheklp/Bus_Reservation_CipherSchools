package exception;

public class Source {

    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            System.out.println(a/b);
        } catch (ArithmeticException exception) {
            System.err.println("Can't divide number by zero");
        }
    }

}
