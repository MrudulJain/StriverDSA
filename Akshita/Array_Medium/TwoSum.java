//Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to find all pairs from both arrays whose sum is equal to X.

package Array_Medium;
import java.util.*;
public class TwoSum {
    public static void allPairs( int A[], int B[], int N, int M, int X) {
        HashSet<Integer> set = new HashSet <>();
        for(int i : A) {
            set.add(X - i);                           //[1]
        }
        for(int i : B)
        {
            if (set.contains(i))                      //[2]
            {
                System.out.println(i + " " + (X - i));
            }
        }
    }

    public static void main(String[] args)
    {
        int n=5;
        int m=5;
        int[] arr1= {1, 2, 4, 5, 7};
        int[] arr2={5, 6, 3, 4, 8};
        int x=9;
        allPairs(arr1,arr2,n,m, x);
    }
}

/*
[1]store the difference of elements in the first array and the given sum in a hashset
[2]iterate through the second array and see if arr2[i] is present in the hashset or not,
if it is present it means X is the sum of two elements from both the arrays, and it will print it
*/
