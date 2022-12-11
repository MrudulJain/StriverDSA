//Given an unsorted array Arr[] of N integers and an integer X, find floor and ceiling of X in Arr[0..N-1].
//Floor of X is the largest element which is smaller than or equal to X. Floor of X doesn’t exist if X is smaller than smallest element of Arr[].
//Ceil of X is the smallest element which is greater than or equal to X. Ceil of X doesn’t exist if X is greater than greatest element of Arr[].
//TC: O(n)

package Binary_Search1;
import java.util.*;

public class implementUpperBound {
    public static void main(String[] args)
    {
        int n=8;
        int[] nums= {5, 6, 8, 9, 6, 5, 5, 6};
        int target=10;
        System.out.println(getFloorAndCeil(nums,n, target));  //prints the elements
    }
    public static ArrayList getFloorAndCeil(int[] arr, int n, int x) {
        int floor=Integer.MIN_VALUE;
        int ceil=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=floor && arr[i]<=x)
            {
                floor=arr[i];
            }
            if(arr[i]<=ceil && arr[i]>=x)
            {
                ceil=arr[i];
            }
        }
        if(floor==Integer.MIN_VALUE)
        {
            floor=-1;
        }
        if(ceil==Integer.MAX_VALUE)
        {
            ceil=-1;
        }
        ArrayList<Integer> list=new ArrayList<>();
        list.add(floor);
        list.add(ceil);
        return list;
    }
}

//alternative method: sort the array and apply binary search
//bin search to be applied when: complexity is O(log n) or the array is sorted
