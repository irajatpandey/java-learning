package dsa.arrays.arrays_basic;
import java.util.Arrays;
public class ArrayInBuildFunctions {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(arr.getClass().getName());
        // size of an array
        System.out.println("Size of an array :" + arr.length);

        // Convert an array into a String
        String arrayString = Arrays.toString(arr);
        System.out.println(arrayString);

        //Check if an array contains a certain value
        String[] stringArray = { "a", "b", "c", "d", "e" };
        boolean b = Arrays.asList(stringArray).contains("a");
        System.out.println(b); // true


    }
}
