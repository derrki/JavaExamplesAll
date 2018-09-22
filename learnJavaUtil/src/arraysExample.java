import java.util.Arrays;

import static util.Numbers.*;
import static util.Print.*;

public class arraysExample {
    public static void main(String[] args) {
        int[] array1 = {2, 8};
        int[] array2 = {2, 8};

        println("array1==array2 = " + (array1 == array2));
        println("array1.equals(array2) = " + array1.equals(array2));
        println("array1 = " + array1 + "   array2 = " + array2);
        println("Arrays.equals(array1, array2) = " + Arrays.equals(array1, array2));

        int[][] aa = {{11, 22}, {33, 34}};
        int[][] bb = {{11, 22}, {33, 34}};
        println("Arrays.deepEquals(aa,bb) is " + Arrays.deepEquals(aa, bb));

        int[] intArray = new int[10];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = randomInRange(1, 100);
        }

        println("Масив до сортування: " + Arrays.toString(intArray));
        Arrays.sort(intArray);
        print("\nМасив після сортування: " + Arrays.toString(intArray));

        int[] array = {5, 9, 15, 11};
        int index = Arrays.binarySearch(array, 5);
        println("\n" + index);
    }
}
