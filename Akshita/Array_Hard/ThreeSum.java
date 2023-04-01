//Given an array A[] of N integers and an integer X. The task is to find the sum of three integers in A[] such that it is closest to X.

package Array_Hard;
import java.util.*;
public class ThreeSum {
        static void closest3Sum(int A[], int N, int X)
        {
                Arrays.sort(A);
                int min = Integer.MAX_VALUE;
                int ans =-1;
                for(int i =0;i<N;i++){                                //[1]
                        int j = i+1;
                        int k = N-1;
                        int target = X-A[i];
                        while(j<k){                                   //[2]
                                int sum = A[j]+A[k];
                                int diff = Math.abs(sum+A[i]-X);
                                if(diff<min){
                                        min = diff;
                                        ans = sum+A[i];
                                }
                                if(sum<target){                      //[3]
                                        j++;
                                }
                                else {
                                        k--;
                                }
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

/*
This optimal solution of the problem fixes the A[i](first element) while traversing the rest of the array,
which is now to be solved using two pointer approach of 2sum problem.

[1] An element is kept static. The target of the sub problem(2 sum is set by subtracting it from the required value.
The pointers for traversing the rest of the array from start and end are set.
[2] the 2sum is calculated using j and k pointers,
and the absolute diff between the required calculated target and sum is compared with the last min closest value.
If diff is smaller, then it becomes the new min and the value of sum is set as 2sum value + value of the fixed element, i.e., A[i].
[3] If sum is less than target, it means the new value of sum should be greater so as to be closer to target
and hence it will search for element on the right. Whereas, if ite sum > target, the elements to be searched should be smaller
which are on the left of the array since the array is sorted.
*/