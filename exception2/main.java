package exception2;

public class main {
    public static void main(String[] args) {
        MyException me = new MyException("hi");
       System.out.println(me.getMessage()); 
    }
}
