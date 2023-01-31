//sorted if all the elements on the right of an element arr[i] is greater than it, and smaller if on its left
//partition to move pivot element at its right place, and eventually repeat the same process recursively till the entire
//array has been sorted.
//TC: O(n log n)

package Sorting;
public class QuickSort {
    static void quickSort(int arr[], int l, int h)
    {
        if(l<h)
        {
            int p= partition(arr, l, h);
            quickSort(arr, l, p-1);       //finds the pivot of the left side of the array recursively and sorts it
            quickSort(arr, p+1, h);       //finds the pivot of the right side of the array recursively and sorts it
        }
    }

    static int partition(int arr[], int l, int h)
    {
        int p=arr[l];              //pivot element is the smallest element
        int i=l+1;
        int j=h;

        while(i<=j)
        {
            while(i<=h && arr[i]<=p)
            {
                i++;
            }     //i++ till the left side elements are smaller than pivot
            while(arr[j]>p)
            {
                j--;
            }      //j-- till the right side elements are greater than pivot

            if(i<j)
            {
                int temp=arr[i];       //swapped the elements that did the not follow the rule of partitioning
                arr[i]=arr[j];         //i.e. swapped the element larger than pivot element on left side, with smaller elements on right side
                arr[j]=temp;
            }
        }
        int temp=arr[j];
        arr[j]=arr[l];
        arr[l]=temp;                    //swapped the pivot element with the element at jth location

        return j;                       //returns the pivot element's correct location
    }

    public static void main(String[] args)
    {
        int n=8;
        int[] a= {5, 6, 2, 1 ,4 ,3 ,0, 3};
        quickSort(a,0, n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
