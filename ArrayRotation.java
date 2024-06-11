package array;

import java.util.Arrays;

public class ArrayRotation {
    public static void rotateArray(int[] arr, int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotation = 2;
        rotateArray(arr, rotation);
        System.out.println("Array after rotation: " + Arrays.toString(arr));
    }
}
