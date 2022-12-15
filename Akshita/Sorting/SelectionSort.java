//Approach: swap the smallest element of the array during each iteration with the current element by storing the index of the smallest element
//O(n^2)

package Sorting;
public class SelectionSort {
    public static void main(String[] args)
    {
        int n=8;
        int[] arr= {5, 6, 2, 1 ,4 ,3 ,0, 3};
        sort(arr, n);
    }

    public static void sort(int[] arr, int n)
    {
        for(int i=0;i<n-1;i++)         //last element automatically sorted
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if (arr[j] < arr[min]) {
                    min = j;           //index of the smallest element
                }
            }
            int temp=arr[i];           //current element swapped with the smallest element in the inner loop
            arr[i]=arr[min];           //in this way all the smallest elements come forward and organize in ascending order
            arr[min]=temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
