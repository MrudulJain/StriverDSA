//pick an unsorted element and insert it in its sorted position
//TC: O(n^2)
//SC: O(1)

package Sorting;
public class InsertionSort {
    public static void main(String[] args)
    {
        int n=8;
        int[] arr= {5, 6, 2, 1 ,4 ,3 ,0, 3};
        sort(arr, n);
    }

    public static void sort(int[] arr, int n)
    {
        for(int i=1;i<n;i++)
        {
            int key= arr[i];              //element to be inserted
            int j=i-1;
            while(j>=0 && arr[j]>key)     //shifts all the elements, greater than key, to the left
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;                 //inserts the key at its right position
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
