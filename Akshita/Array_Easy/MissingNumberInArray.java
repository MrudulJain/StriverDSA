//Given an array containing n distinct numbers in the range [1, n], return the only number in the range that is missing from the array.

package Array_Easy;

public class MissingNumberInArray {
    public static void main(String[] args)
    {
        int n=8;
        int[] arr= {5, 6, 2, 1 ,4 ,8 , 3};
        System.out.println(missingNumber(arr, n));
    }

    public static int missingNumber(int A[], int N)
    {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<N-1;i++)
        {
            sum1+=A[i];
        }
        sum2=(N*(1+N)/2);
        return sum2-sum1;
    }
}
