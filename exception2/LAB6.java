package exception2;

public class LAB6 {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println("=======================");
            // e.printStackTrace(); //บอกข้อมูลที่ error
            // System.out.println(e.getMessage()); //บอกข้อความการผิดพลาด / by zero
            // System.out.println(e.toString());// java.lang.ArithmeticException: / by zero
            StackTraceElement[] stackTraceElement = e.getStackTrace(); // ทำให้แยกเป็น array ไว้เรียกใช้เฉพาะส่วนเช่น
                                                                       // ต้องเอาไปใสใน array

            for (int i = 0; i < stackTraceElement.length; i++) {
                System.out.println(stackTraceElement[i].getClassName());// บอกคลาสที่ error
                System.out.println(stackTraceElement[i].getMethodName());// อยู่ medthod ไหน
                System.out.println(stackTraceElement[i].getFileName());
                System.out.println(stackTraceElement[i].getLineNumber());// บอกบรรทัด
            }

        }
    }
}
