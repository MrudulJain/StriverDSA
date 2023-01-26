//Given an array arr[] of size N, check if it is sorted in non-decreasing order or not.
//TC: O(n)

package Array_Easy;
public class CheckSorted {
    public static void main(String[] args)
    {
        int n=8;
        int[] arr= {0, 1, 2, 3 ,4, 5, 6 ,7};
        System.out.println(sorted(arr, n));
    }

    public static boolean sorted(int[] arr, int n)
    {
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]<=arr[i+1])
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
