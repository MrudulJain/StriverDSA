/*
Given an array arr[] of N non-negative integers representing the height of blocks.
If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season.

TC= O(n)
SC= O(n+n)
 */

package Array_Medium;
import java.math.*;
public class GFG_TrappingRainwater {
    public static void main(String[] args)
    {
        int n=6;
        int[] arr = {3,0,0,2,0,4};
        System.out.println(trappingWater(arr,n));
    }

    static int trappingWater(int arr[], int n) {
        int[] lmax= new int[n];
        int[] rmax= new int[n];
        int result=0;
        lmax[0]=arr[0];
        for(int i=1;i<n;i++)    //starting with 1st index as 0th index has already been populated
        {
            lmax[i] = lmax[i-1]>arr[i]?lmax[i-1]:arr[i];    //[1]
        }

        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>0;i--)  //starting with (n-2)th index as (n-1)th index has already been populated
        {
            rmax[i]= rmax[i+1]>arr[i]? rmax[i+1]: arr[i];   //[2]
        }

        for(int i=1;i<n;i++)
        {
            result+= Math.min(lmax[i],rmax[i])-arr[i];      //[3]
        }

        return result;
    }
}

/*
[1] populating the lmax array to find the max height of the bar from the left, to contain the rainwater
compares the max element found (lmax[i-1],
with current element of arr(arr[i]) to populate the current lmax(lmax[i]) with the bigger element
->stores the max height for every element till which the elements on the right to it can store water
{3, 3, 3, 3, 3, 4}

[2] populating the rmax array to find the max height of the bar from the right, to contain the rainwater
compares the max element found (rmax[i+1],
with current element of arr(arr[i]) to populate the current rmax(rmax[i]) with the bigger element
->stores the max height for every element till which the elements on the left of it can store water
{4, 4, ,4 ,4 ,4 ,4}

[3] minimum of the lmax[i] and rmax[i] is selected to check the amount of water
that can be filled on top of that particular element
such that it is <= the left and right elements of the container
result= (3-3) + (3-0) + (3-0) + (3-2) + (3-0) + (4-4) = 0+3+3+3+3+0 = 10
 */
