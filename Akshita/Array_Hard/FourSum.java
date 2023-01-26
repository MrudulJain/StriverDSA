//Find all the unique quadruple from the given array that sums up to the given number

package Array_Hard;
import java.util.*;
public class FourSum {
    public static void fourSum(int[] nums, int target) {
        Set<ArrayList<Integer>> set = new LinkedHashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i =0;i<n-3;i++){
            for(int j =i+1;j<n-2;j++){
                int t = target-nums[i]-nums[j];
                int k = j+1;
                int l = n-1;
                while(k<l){
                    int val=  nums[k]+nums[l];
                    if(val<t)k++;
                    else if(val>t)l--;
                    else{
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        set.add(temp);
                        k++;
                    }
                }
            }
        }
        ArrayList<ArrayList<Integer>> ans = new  ArrayList<ArrayList<Integer>>(set);
        System.out.print(ans);
    }

    public static void main(String[] args)
    {
        int k=23;
        int[] arr= {10,2,3,4,5,7,8};
        fourSum(arr, k);

    }
}
