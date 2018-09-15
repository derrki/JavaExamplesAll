package NumberExamples;

public class ByteValueEx {
    public static void main(String[] args) {
        Integer x = new Integer(123456);
        Float y = new Float(9876);

        System.out.println("x as integer: " + x + ", x as byte: " + x.byteValue());
        System.out.println("y as float: " + y + ", y as byte: " + y.byteValue());
    }
}
