package dividebyzero;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException e) {
            System.out.printf("Caught ArithmeticException: %s\n", e.getMessage());
        }
    }

}