package Binary_Search1;
import java.util.*;
public class binSearch {
    public static void main(String[] args)
    {
        int n=7;
        int[] nums= {-1,1,2,3,4,5,6};
        int target=4;
        System.out.println(search(nums,target,n));  //returns the index of the element
    }

    public static int search(int[] nums, int target, int n)
    {
        int high=n-1;
        int low=0;
        int mid;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            if(nums[mid]<target)
            {
                low=mid+1;
            }
            if(nums[mid]>target)
            {
                high=mid-1;
            }
        }
        return -1;
    }
}
