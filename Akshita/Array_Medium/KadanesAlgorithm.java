//Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

package Array_Medium;

public class KadanesAlgorithm {

    static void maxSubarraySum(int arr[], int n){
        long maxsum=arr[0];
        int cursum=0;
        for(int i=0;i<n;i++)
        {
            cursum+=arr[i];
            if(arr[i]>cursum)           //[1]
            {
                cursum=arr[i];
            }
            if(cursum>maxsum)          //[2]
            {
                maxsum=cursum;
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args)
    {
        int n=5;
        int[] arr= {1,2,5,3,-2,5};
        maxSubarraySum(arr, n);
    }
}

/*
This solution uses cursum to store the sum of the current subarray and maxsum to store the maxsum seen so far.
[1]if the cursum after addition of the current element is smaller than current element, the cursum is made as current element- showing the start of a new subarray
[2]the cursum is compared to the maxsum found till now.
*/