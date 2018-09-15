package NumberExamples;

public class NumberClassEx {
    public static void main(String[] args) {
        Integer x = new Integer(123456);
        Float y = new Float(9876f);

        // print their value as byte
        System.out.println("x as integer: " + x
                + ", x as byte: " + x.byteValue());
        System.out.println("y as float: " + y
                + ", y as byte: " + y.byteValue());

        // print their value as double
        System.out.println("\nx as integer :" + x
                + ", x as double:" + x.doubleValue());
        System.out.println("y as float::" + y
                + ", y as double:" + y.doubleValue());

        // print their value as float
        System.out.println("\nx as integer:" + x
                + ", x as float:" + x.floatValue());
        System.out.println("y as double:" + y
                + ", y as float:" + y.floatValue());
    }
}
