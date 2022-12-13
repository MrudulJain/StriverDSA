//Given a sorted array Arr[](0-index based) consisting of N distinct integers and an integer k.
// The task is to find the index of k, if its present in the array Arr[].
// Otherwise, find the index where k must be inserted to keep the array sorted.
//TC: O(log n)

package Binary_Search1;

public class SearchInsertPosition {
    public static void main(String[] args)
    {
        int n=4;
        int[] nums= {1,3,5,6};
        int target=5;
        System.out.println(searchInsertK(nums,n, target));  //prints the index of the element
    }

    public static int searchInsertK(int arr[], int N, int target)
    {
        int high=N-1;
        int low=0;
        int mid=low+(high-low)/2;
        if(target>arr[high])
        {
            return high+1;
        }
        while(high>=low)
        {
            mid=low+(high-low)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            if(target>arr[mid])
            {
                low=mid+1;
            }
            if(target<arr[mid])
            {
                high=mid-1;
            }
        }
        return low;  //low is returned because we have to find the position at which the element can be inserted
    }

}
