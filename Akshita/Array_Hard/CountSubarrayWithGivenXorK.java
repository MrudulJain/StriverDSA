//Given an array arr of N integers and an integer K, find the number of subsets of arr having XOR of elements as K.

package Array_Hard;

public class CountSubarrayWithGivenXorK {
    static int helper(int []arr,int n,int k){
        if(n==0){
            if(k==0)
                return 1;
            else
                return 0;
        }
        int taken = helper(arr,n-1,k^arr[n-1]);
        int notTaken = helper(arr,n-1,k);
        return taken+notTaken;
    }
    static int subsetXOR(int arr[], int N, int K) {
        return helper(arr,N,K);
    }

    public static void main(String[] args)
    {
        int n=4;
        int[] arr= {6,9,4,2};
        int k=6;
        System.out.println(helper(arr, n, k));
    }
}
