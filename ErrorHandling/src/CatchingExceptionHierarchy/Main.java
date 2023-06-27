package CatchingExceptionHierarchy;

class MyParentException extends Exception {
}

class MyChildException extends MyParentException {
}

class MyGrandChildException extends MyChildException {
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyGrandChildException();
        }   catch (MyChildException s) {
                System.err.println("Caught MyChildException");
        } catch (MyParentException a) {
            System.err.println("Caught MyParentException");
        }
    }
}
