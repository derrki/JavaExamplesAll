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

    public static void  printLnLineLn() {
        System.out.println("\n--------------------------------------------");
    }

    public static void printf(String data, Object... args) {
        System.out.printf(data, args);
    }

    public static void printByte(byte printByte) {
        byte byteForPrint = (byte) printByte;
        String byteBinayStr = String.format("%8s",
                Integer.toBinaryString(byteForPrint & 0xFF)).replace(' ', '0');
        byteBinayStr = byteBinayStr.substring(0, 4) + "_"
                + byteBinayStr.substring(4);
        print(byteBinayStr);
    }

    public static void printlnByte(byte printByte) {
        byte byteForPrint = (byte) printByte;
        String byteBinayStr = String.format("%8s",
                Integer.toBinaryString(byteForPrint & 0xFF)).replace(' ', '0');
        byteBinayStr = byteBinayStr.substring(0, 4) + "_"
                + byteBinayStr.substring(4);
        println(byteBinayStr);
    }

    public static void printInt(int printInt) {
        String intBinayStr = String.format("%32s",
                Integer.toBinaryString(printInt)).replace(' ', '0');
        intBinayStr = intBinayStr.substring(0, 4) + "_"
                + intBinayStr.substring(4, 8) + "_"
                + intBinayStr.substring(8, 12) + "_"
                + intBinayStr.substring(12, 16) + "_"
                + intBinayStr.substring(16, 20) + "_"
                + intBinayStr.substring(20, 24) + "_"
                + intBinayStr.substring(24, 28) + "_"
                + intBinayStr.substring(28);
        print(intBinayStr);
    }

    public static void printlnInt(int printInt) {
        String intBinayStr = String.format("%32s",
                Integer.toBinaryString(printInt)).replace(' ', '0');
        intBinayStr = intBinayStr.substring(0, 4) + "_"
                + intBinayStr.substring(4, 8) + "_"
                + intBinayStr.substring(8, 12) + "_"
                + intBinayStr.substring(12, 16) + "_"
                + intBinayStr.substring(16, 20) + "_"
                + intBinayStr.substring(20, 24) + "_"
                + intBinayStr.substring(24, 28) + "_"
                + intBinayStr.substring(28);
        println(intBinayStr);
    }
}
