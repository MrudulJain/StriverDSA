package Array_Easy;

import java.util.Arrays;

// LEFT Rotate array by "k" placed
public class LEFTROT {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        rotateArr(arr1, 2);
        System.out.println(Arrays.toString(arr1));

        arr1 = new int[] {1, 2, 3, 4, 5, 6, 7};
        rotateArr(arr1, 3);
        System.out.println(Arrays.toString(arr1));

        arr1 = new int[] {1, 2, 3, 4, 5, 6, 7};
        rotateArr(arr1, 14);
        System.out.println(Arrays.toString(arr1));
    }

    public static void rotateArr(int[] arr, int k) {

    }
}
