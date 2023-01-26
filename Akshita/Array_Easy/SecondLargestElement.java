//Given an array Arr of size N, print second largest distinct element from an array.
//TC: O(n)

package Array_Easy;
public class SecondLargestElement {
    public static void main(String[] args)
    {
        int n=8;
        int[] arr= {5, 6, 2, 1 ,4 ,3 ,0, 7};
        System.out.println(secondLargest(arr,n));
    }

    public static int secondLargest(int[] arr, int n)
    {
        int max=arr[0];
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>secondMax && arr[i]<max)
            {
                secondMax=arr[i];
            }
        }
        if(secondMax==Integer.MIN_VALUE)   //if no second largest element exists, returns -1
        {
            return -1;
        }
        return secondMax;
    }
}
