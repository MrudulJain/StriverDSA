//Given an array arr[] sorted in ascending order of size N and an integer K.
// Check if K is present in the array or not.
//TC:O(n)

package Array_Easy;

public class LinearSearch {
    public static void main(String[] args)
    {
        int n=8;
        int k=1;
        int[] arr= {5, 6, 2, 1 ,4 ,3 ,0, 7};
        System.out.println(search(arr,n,k));
    }

    public static int search(int[] arr, int n, int k)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==k)
                return i+1;
        }
        return -1;
    }
}
