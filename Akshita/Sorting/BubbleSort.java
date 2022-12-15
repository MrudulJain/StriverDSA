package Sorting;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args)
    {
        int n=8;
        int[] arr= {5, 6, 2, 1 ,4 ,3 ,0, 3};
        sort(arr, n);
    }

    public static void sort(int[] arr, int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

/*
Total comparisons= Total no. of nested loop iteration= O(n^2)
Total swapping= 0(best case) O(n^2)(worst case)

TC= O(n^2)
 */