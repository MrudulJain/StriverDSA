package Array_Medium;
import java.util.*;

import static java.lang.System.*;

public class NextPermutation {
    static void nextPermutation(int N, int arr[]){
        List<Integer> l = new ArrayList<Integer>();
        if(arr==null||arr.length<=1)
        {
            l.add(1);
            System.out.println(l);
        }
        int i = N-2;
        while(i>=0&&arr[i]>=arr[i+1])
        {
            i--;
        }
        if(i>=0)
        {
            int j = N-1;
            while(arr[j]<=arr[i])
            {
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1,N-1);
        for(int k = 0; k<N; k++)
        {
            l.add(arr[k]);
        }
        System.out.println(l);
    }

    public static void swap(int a[],int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void reverse(int a[], int i, int j)
    {
        while(i<j)
        {
            swap(a,i++,j--);
        }
    }

    public static void main(String[] args)
    {
        int n=7;
        int[] arr= { 100, 180, 260, 310, 40, 535, 695 };
        nextPermutation(n,arr);
    }
}
