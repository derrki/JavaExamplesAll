package systemExamples;

public class SystemArrayCopyClass {
    private static final int SIZE_OF_ARRAY = 10_000_000;
    private static long time;

    public static void main(String[] args) {

        Integer[] sourceArray = new Integer[SIZE_OF_ARRAY];
        Integer[] destinationArray = new Integer[SIZE_OF_ARRAY];
        fillArray(sourceArray);

        System.out.println("FOR_COPY ");
        startBenchmark();
        naiveCopy(sourceArray, destinationArray);
        stopBenchmark();
        System.out.println("ARRAY_COPY ");
        startBenchmark();
        System.arraycopy(sourceArray, 0, destinationArray, 0,
                sourceArray.length);
        stopBenchmark();
    }

    private static void naiveCopy(Integer[] src, Integer[] dst) {
        for (int i = 0; i < src.length; i++) {
            dst[i] = src[i];
        }
    }

    private static void fillArray(Integer[] src) {
        // Заповняємо масив
        System.out.println("Заповняємо масив");
        for (int i = 0; i < src.length; i++) {
            src[i] = i;
        }
    }

    private static void startBenchmark() {
        time = System.currentTimeMillis();
    }

    private static void stopBenchmark() {
        time = System.currentTimeMillis() - time;
        System.out.println("time=" + time + "мс");
    }

}
