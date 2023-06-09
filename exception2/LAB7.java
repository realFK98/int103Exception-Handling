package exception2;

public class LAB7 {
    public class PropagateException {
        public static void main(String[] args) {
            System.out.println("Main method call method doThis()");
            try {
                doThis();
            } catch (Exception e) {
                System.out.println("Main method receive exception " + e.getMessage());
                System.out.println("kkk");
            }
        }

        public static void doThis() throws Exception {
            System.out.println("Method doThis() call method doThat()");
            doThat();
        }

        public static void doThat() throws Exception {
            throw new Exception("Hello MyException");
        }
    }
}
