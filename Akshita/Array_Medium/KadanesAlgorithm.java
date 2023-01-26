//Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

package Array_Medium;

public class KadanesAlgorithm {
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    static void maxSubarraySum(int arr[], int n){
        long maxsum=arr[0];
        int cursum=0;
        for(int i=0;i<n;i++)
        {
            cursum+=arr[i];
            if(arr[i]>cursum)
            {
                cursum=arr[i];
            }
            if(cursum>maxsum)
            {
                maxsum=cursum;
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args)
    {
        int n=5;
        int[] arr= {1,2,3,-2,5};
        maxSubarraySum(arr, n);
    }

}
