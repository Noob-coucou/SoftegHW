package CallExceptionMethods;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.err.println("Caught Exception");
            System.err.println("getMessage(): " + e.getMessage());
            System.err.println("getLocalizedMessage(): " + e.getLocalizedMessage());
            System.err.println("Stack Trace:");
            e.printStackTrace();
        }
    }
}
