//Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.

package Array_Hard;

public class MaximumProductSubarray {
    static void maxProduct(int[] a, int n)
    {
        long max=Integer.MIN_VALUE,product = 0;
        for(int i=0;i<n;i++)
        {
            product = 1;
            for(int j=i;j<n;j++)
            {
                product*=a[j];
                max = Math.max(max,product);
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args)
    {
        int n=5;
        int[] arr=  {6, -3, -10, 0, 2};
        maxProduct(arr, n);
    }
}
