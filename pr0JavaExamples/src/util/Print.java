package util;

public class Print {

    public static void print(Object object) {
        System.out.print(object);
    }

    public static void println() {
        System.out.println();
    }

    public static void println(Object object) {
        System.out.println(object);
    }

    public static void printlnByte(byte dataByte){
        String dataString = Integer.toBinaryString(dataByte & 0xFF);
        System.out.println(dataString);
    }

    public static void printlnInt (int dataInt) {
        int groupSize = 4;
            StringBuilder result = new StringBuilder();

            for (int i = 31; i >= 0; i--) {
                int mask = 1 << i;
                result.append((dataInt & mask) != 0 ? "1" : "0");

                if (i % groupSize == 0)
                    result.append(" ");
            }
            result.replace(result.length() - 1, result.length(), "");

        System.out.println(result.toString());
    }

    public static void printf(String data, Object...args){
        System.out.printf(data, args);
    }

}
