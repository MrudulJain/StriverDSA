//Given a sorted array arr containing n elements with possibly duplicate elements.
// The task is to find indexes of first and last occurrences of an element x in the given array.

package Binary_Search1;
import java.util.*;
public class FirstAndLastOccurence {
    public static void main(String[] args)
    {
        int[] num= {1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int target=5;
        int[] result=searchRange(num, target);
        for(int i=0;i<2;i++) {
            System.out.print(result[i]+" "); //prints the index of the first and last occurence
        }
    }

    public static int[] searchRange(int[] arr, int x) {
        //use binary search to find atleast one target element
        int n=arr.length;
        int h=n-1;
        int l=0;
        int m=l+(h-l)/2;
        int index=0;
        int flag=0;
        while(h>=l)
        {
            m=l+(h-l)/2;
            if(arr[m]==x)
            {
                index=m; //atleast one target element found
                flag=1;
                break;
            }
            if(arr[m]>x)
            {
                h=m-1;
            }
            if(arr[m]<x)
            {
                l=m+1;
            }
        }

        int i=index;  //to search last occurence
        int j=index;  //to search first occurence
        int first=-1;
        int last=-1;
        if(flag==1)
        {
            first=m;
        }
        else
        {
            int[] nums= new int[2];
            nums[0]=first;
            nums[1]=last;
            return nums;
        }
        for(i=index;i<n;i++)
        {
            if(arr[i]==x)
            {
                last=i;
            }
            else
            {
                break;
            }
        }
        for(i=index;i>=0;i--)
        {
            if (arr[i] == x) {
                first = i;
            }
            else
            {
                break;
            }
        }
        int[] result= new int[2];
        result[0]=first;
        result[1]=last;
        return result;
    }
}
