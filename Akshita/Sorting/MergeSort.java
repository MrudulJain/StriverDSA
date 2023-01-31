//TC: O(n log n)
//SC: O(n)  //for storing the sorted array
//usually used for sorting linked lists

package Sorting;
public class MergeSort {

    public static void main(String[] args)
    {
        int n=8;
        int[] a= {5, 6, 2, 1 ,4 ,3 ,0, 3};
        mergeSort(a,0, n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    static void merge(int a[], int l, int mid, int h)
    {
        int[] arr=new int[h-l+1];
        int i=l,j=mid+1,k=0;
        while(i<=mid && j<=h)           //compares the elements and insert them int auxilliary array
        {
            if(a[i]<a[j])
            {
                arr[k++]=a[i++];
            }
            else
            {
                arr[k++]=a[j++];
            }
        }
        while(i<=mid)                   //inserts the remaining elements of the left sorted array in the aux array
        {
            arr[k++]=a[i++];
        }
        while(j<=h)                     //inserts the remaining elements of the right sorted array in the aux array
        {
            arr[k++]=a[j++];
        }
        k=0;
        for(i=l;i<=h;i++)
        {
            a[i]=arr[k++];
            //System.out.print(a[i]+" ");

        }
        //System.out.println();
    }

    static void mergeSort(int a[],int l,int h)
    {
        if(l<h)                       //to check that there are atleast 2 elements in the array still
        {
            int mid = (l+h)/2;
            mergeSort(a,l,mid);       //sorts the left part of the array
            mergeSort(a,mid+1,h);  //sorts the right part of the array
            merge(a,l,mid,h);
        }
    }
}
