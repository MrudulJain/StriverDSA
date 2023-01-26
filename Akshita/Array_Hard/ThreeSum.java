//Given an array A[] of N integers and an integer X. The task is to find the sum of three integers in A[] such that it is closest to X.


package Array_Hard;
import java.util.*;
public class ThreeSum {
        static void closest3Sum(int A[], int N, int X)
        {
                Arrays.sort(A);
                int min = Integer.MAX_VALUE;
                int ans =-1;
                for(int i =0;i<N;i++){
                        int j = i+1;
                        int k = N-1;
                        int target = X-A[i];
                        while(j<k){
                                int sum = A[j]+A[k];
                                int diff = Math.abs(sum+A[i]-X);
                                if(diff<min){
                                        min = diff;
                                        ans = sum+A[i];
                                }
                                if(sum<target)j++;
                                else k--;
                        }
                }
                System.out.println(ans);
        }

        public static void main(String[] args)
        {
                int n=4;
                int[] arr= {-1 , 2, 1, -4};
                int x=1;
                closest3Sum(arr, n, x);
        }
}
