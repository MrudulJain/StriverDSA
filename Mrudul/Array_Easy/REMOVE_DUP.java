package Array_Easy;


// Q. Remove Duplicates in-place from Sorted Array
// Time Complexity = O(N), Space = O(1)

import java.lang.reflect.Array;
import java.util.Arrays;

public class REMOVE_DUP {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,3,3,4,4};
        int[] arr2 = {1, 2, 7, 7, 7, 10};
        removeDup(arr);
        System.out.println(Arrays.toString(arr));
        removeDup(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static void removeDup(int[] arr) {
        int slow = 0, fast = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[slow] != arr[fast]) {
                slow++;
                arr[slow] = arr[fast];
            }
            fast++;
        }
    }
}
