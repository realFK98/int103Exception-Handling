package exception2;

public class MyException extends Exception {
    public MyException(String str) {
        super(str);
    }

    public MyException() {
        super();
    }
}
