//Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader

package Array_Medium;
import java.util.*;
public class LeadersInArrayProblem {
    //Function to find the leaders in the array.
    static void leaders(int arr[], int n){
        ArrayList<Integer> nums= new ArrayList<>();
        int maxEle=arr[n-1];
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>=maxEle)
            {
                maxEle=arr[i];
                nums.add(maxEle);
            }
        }
        //nums.add(arr[n-1]);
        Collections.reverse(nums);
        System.out.println(nums);
    }
    public static void main(String[] args)
    {
        int n=6;
        int[] arr= {16,17,4,3,5,2};
        leaders(arr,n);
    }

}
