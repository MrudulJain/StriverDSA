//Find all the unique quadruple from the given array that sums up to the given number

package Array_Hard;
import java.util.*;
public class FourSum {
    public static void fourSum(int[] nums, int target) {
        Set<ArrayList<Integer>> set = new LinkedHashSet<>();              //[1]
        Arrays.sort(nums);
        int n = nums.length;
        for(int i =0;i<n-3;i++){                                          //[2]
            for(int j =i+1;j<n-2;j++){                                    //[3]
                int t = target-nums[i]-nums[j];
                int k = j+1;
                int l = n-1;
                while(k<l){                                               //[4]
                    int val=  nums[k]+nums[l];
                    if(val==t){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        set.add(temp);
                        k++;
                    }
                    else if(val<t) k++;
                    else l--;
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

/*
In this solution, like 3sum problem, the last 2 elements are traversed using 2 pointer approach and stored in variable val.
The first element is traversed through ,variable t stores the target value for the 2 sum.
[1] set is used to prevent duplicate entries into the set.
[2] the initial for loop traversing through the entire element to find the first element
[3] the second for loop which sets the target value for the 2 sum value, like we did in 3 sum problem.
Initialize k and l as the start and end of the remaining array.
[4] this loop traverses the remaining element. If the sum of arr[k] and arr[l] equals target set for 2 sum, it'll be added to the set.
if( val ==t) it means the target has been reached and these values will be inserted into the set. k will be incremented.
if val is less than t, it means k needs to be incremented so that arr[k] becomes larger and val can reach t,
similarly l is decremented to reduce the val.
*/
