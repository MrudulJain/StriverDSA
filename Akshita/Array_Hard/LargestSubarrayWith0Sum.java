//The task is to compute the length of the largest subarray with sum 0.

package Array_Hard;
import java.util.*;
public class LargestSubarrayWith0Sum {
    static void maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxlength =0;
        int i=-1;
        int sum=0;
        map.put(sum,i);
        while(i<arr.length-1)
        {
            i++;
            sum+=arr[i];
            if(map.containsKey(sum)==false)
            {
                map.put(sum,i);
            }
            else
            {
                int length = i-map.get(sum);
                if(length>maxlength)
                {
                    maxlength=length;
                }
            }
        }
        System.out.println(maxlength);
    }

    public static void main(String[] args)
    {
        int n=8;
        int[] arr= {15,-2,2,-8,1,7,10,23};
        maxLen(arr, n);

    }
}
