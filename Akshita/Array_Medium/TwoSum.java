//Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to find all pairs from both arrays whose sum is equal to X.

package Array_Medium;
import java.util.*;
public class TwoSum {
    public static void allPairs( long A[], long B[], long N, long M, long X) {
        HashSet<Long> set = new HashSet <>();
        for(long i : B) set.add(i);
        Arrays.sort(A);
        for(long i : A)
        {
            if (set.contains(X - i))
            {
                System.out.println(i + " " + (X - i));
            }
        }
    }

    public static void main(String[] args)
    {
        int n=5;
        int m=5;
        long[] arr1= {1, 2, 4, 5, 7};
        long[] arr2={5, 6, 3, 4, 8};
        long x=9;
        allPairs(arr1,arr2,n,m, x);
    }
}
