//Given an array containing N integers and an integer K.
//Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value K.
//TC: O(n^2)

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
