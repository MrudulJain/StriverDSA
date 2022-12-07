package Array_Easy;


// Q. Remove Duplicates in-place from Sorted Array
// Time Complexity = O(N), Space = O(1)

import java.util.Arrays;

public class RemoveDupelicates {
    public static void main(String[] args) {
        int n=11;
        int[] arr = {1,1,1,2,2,3,3,3,3,4,4};
        int num=removeDup(arr,n);
        for(int i=0;i<num;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static int removeDup(int[] a,int n) {
        int count=0;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(a[j]!=a[i])
            {
                j++;
                a[j]=a[i];
            }
        }
        return j+1;
    }
}
