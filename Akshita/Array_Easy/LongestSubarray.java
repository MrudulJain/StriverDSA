/*
Given an array containing N integers and an integer K.
Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value K.
TC: O(n^2)
*/

package Array_Easy;

public class LongestSubarray {
    public static void main(String[] args)
    {
        int n=6;
        int[] arr= {10, 5, 2, 7, 1, 9};
        int k=15;
        System.out.println(lenOfLongSubarr (arr, n, k));
    }
    public static int lenOfLongSubarr (int arr[], int N, int k) {
        int sum = 0;
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                sum += arr[j];
                count++;
                if (sum == k && count > maxCount) {
                    maxCount = count;
                }
            }
            sum = 0;
            count = 0;
        }
        return maxCount;
    }
}

/*
In order to generate all the subarrays, we need two nested loops.
First loop decides the starting index of the subarray and fixes the starting index
The second loop is used to calculate the sum of the subarray by sliding the window to the right of the array
A soon as the sum==k, if maxcount till now is smaller than count for this particular window, it gets replaced
The window then moves on to the next set of elements
*/