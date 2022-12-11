package Binary_Search1;
import java.util.*;
public class arraySorted {
    public static void main(String[] args)
    {
        int n=7;
        int[] nums= {1,2,8,10,11,12,19};
        System.out.println(arraySortedOrNot(nums,n));
    }

    public static boolean arraySortedOrNot(int[] arr, int n) {
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
