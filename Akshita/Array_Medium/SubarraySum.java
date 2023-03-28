//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

package Array_Medium;
import java.util.*;
public class SubarraySum {
        public static int subarraySum(int[] arr, int k) {
            int n = arr.length;
            int prefixSum = 0, count = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);                                                             //[1]
            for(int i = 0; i< n; i++)                                                  //[2]
            {
                prefixSum += arr[i];
                if( map.containsKey(prefixSum-k))
                {
                    count += map.get(prefixSum-k);
                }
                map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
            }
            return count;
        }

    public static void main(String[] args) {
        int[] nums={1, 2, 3, 5, 3, 4};
        int k = 3;
        System.out.println(subarraySum(nums, k));
    }
}

/*
This solution returns the count of subarray sum which equals k.
It uses hashmap to store the prefix sums and its count.
[1] initial entry needs to be done in the map in case value of k is 0(k-0=k)
[2]the function loops through hashmap. If map contains the prefix sum upto current value - k,
it means that there exists a subarray whose sum equals k, and count gets incremented.
 */