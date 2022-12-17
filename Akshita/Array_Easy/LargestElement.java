//Given an array A[] of size n. The task is to find the largest element in it.
//TC: O(n)
package Array_Easy;
public class LargestElement {
    public static void main(String[] args)
    {
        int n=8;
        int[] arr= {5, 6, 2, 1 ,4 ,3 ,0, 3};
        System.out.println(largest(arr,n));
    }

    public static int largest(int[] arr, int n)
    {
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }

}
