package util;

public class Print {

    public static void print(Object object) {
        System.out.print(object);
    }

    public static void println(Object object) {
        System.out.println(object);
    }
    public static void println() {
        System.out.println();
    }

    public static void printf(String data, Object...args){
        System.out.printf(data, args);
    }

}
