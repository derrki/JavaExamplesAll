package NumberExamples;

public class NumberClassEx {
    public static void main(String[] args) {
        Integer x = new Integer(123456);
        Float y = new Float(9876f);
        Double z = new Double(98765);

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

        // print their value as int
        System.out.println("\ny as float:" + y
                + ", y as Integer:" + y.intValue());
        System.out.println("z as double:" + z
                + ", z as Integer:" + z.intValue());

        // print their value as long
        System.out.println("\ny as float:" + y
                + ", y as long:" + y.longValue());
        System.out.println("z as double:" + z
                + ", z as long:" + z.longValue());
    }
}
