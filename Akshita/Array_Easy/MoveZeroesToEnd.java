//Given an array arr[] of N positive integers.
//Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements.
//TC: O(n)

package Array_Easy;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int n=5;
        int[] arr = {3, 4, 0, 0, 4};
        pushZerosToEnd(arr,n);
    }
    static void pushZerosToEnd(int[] arr, int n) {
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0 )
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
