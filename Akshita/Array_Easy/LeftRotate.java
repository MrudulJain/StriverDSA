//Given an array arr[] of size n and an integer K, the task is to left rotate the array K indexes
//TC: O(n)
package Array_Easy;

public class LeftRotate {
    public static void main(String[] args)
    {
        int n=7;
        int k=2;
        int[] arr= {1, 2, 3, 4, 5, 6, 7};
        rotate(arr,n, k);
    }

    public static void rotate(int[] arr, int n, int d)
    {
        int j=d-1;
        for(int i=0;i<d/2;i++)   //reverse the initial d elements
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        j=n-1;
        for(int i=d;i<(n+d)/2;i++) //reverse the remaining elements
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        j=n-1;
        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
