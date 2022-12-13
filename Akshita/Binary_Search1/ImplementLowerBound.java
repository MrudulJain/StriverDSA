// Given a sorted array arr[] of size N without duplicates, and given a value x.
// Floor of x is defined as the largest element K in arr[] such that K is smaller than or equal to x.
// Find the index of K(0-based indexing).
//TC: O(log n)

package Binary_Search1;

public class ImplementLowerBound {
    public static void main(String[] args)
    {
        int n=7;
        int[] nums= {1,2,8,10,11,12,19};
        int target=4;
        System.out.println(findFloor(nums,n, target));  //prints the indices of the elements
    }

    static int findFloor(int arr[], int n, int x)
    {
        int high=n-1;
        int low=0;
        int mid=low+(high-low)/2;;
        if(x<arr[low])
        {
            return -1;
        }
        if(x>arr[high])
        {
            return high;
        }
        while(high>=low)
        {
            mid=low+(high-low)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            if(arr[mid]>x)
            {
                high=mid-1;
            }
            if(arr[mid]<x)
            {
                low=mid+1;
            }
        }
        return mid-1;
    }
}
