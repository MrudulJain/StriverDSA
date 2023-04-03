//Given an array Arr[] that contains N integers (may be positive, negative or zero).
// Find the product of the maximum product subarray.

package Array_Hard;

public class MaximumProductSubarray {
    static void maxProduct(int[] nums, int n)
    {
/*
        long max=Integer.MIN_VALUE,product = 0;
        for(int i=0;i<n;i++)
        {
            product = 1;
            for(int j=i;j<n;j++)
            {
                product*=nums[j];
                max = Math.max(max,product);
                if(nums[j]==0)break;
            }
        }
        System.out.println(max);
*/

        int maxLeft = nums[0];
        int maxRight = nums[0];
        int prod = 1;
        boolean zeroFound = false;
        for(int i = 0; i<n; i++)                  //[1]
        {
            prod *= nums[i];
            if(nums[i]==0)
            {
                prod = 1;
                zeroFound = true;
                continue;
            }
            if(prod>maxLeft)
            {
                maxLeft = prod;
            }
        }

        prod = 1;
        for(int i = n-1; i>=0; i--)              //[2]
        {
            prod *= nums[i];
            if(nums[i]==0)
            {
                prod = 1;
                zeroFound = true;
                continue;
            }
            if(prod>maxRight)
            {
                maxRight = prod;
            }
        }
        int max = Math.max(maxRight, maxLeft);
        if( zeroFound == true)                  //[3]
        {
            System.out.println(Math.max(0, max));
        }
        else {
            System.out.println(max);
        }
    }

    public static void main(String[] args)
    {
        int n=5;
        int[] arr=  {0, 0, -5, 0, 0};
        maxProduct(arr, n);
    }
}

/*
The method uses two traversals, one from the left and the other from the right to calculate their respective max product.
[1,2] the left and right traversal of the array. The product of the elements is calculated and compared with maxprod after every iteration.
If the element is found to be 0, the variables are reset to prod =1, and zeroFound marked as true.

[3] we check if the array consisted of a 0. If it did, then we have to check if 0 was the min element present,
or the products from either side were negative. If no zero is found, the answer simply will be the max element present, be it negative.
 */