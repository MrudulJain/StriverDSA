/*
Given two sorted arrays array1 and array2 of size m and n respectively. Find the median of the two sorted arrays.
TC= O(n+m)
SC= O(n+m)
 */
package Array_Hard;

public class GFG_MedianOfTwoSortedArrays {
    public static void main(String[] args)
    {
        int[] a={1, 3, 5, 7};
        int[] b={2, 4, 8};
        int n=4, m=3;
        System.out.println(medianOfArrays(n, m, a, b));
    }

    static double medianOfArrays(int n, int m, int a[], int b[])
    {
        int[] arr= new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m)              //[1]
        {
            if(a[i]<b[j])
            {
                arr[k++]=a[i++];
            }
            else
            {
                arr[k++]=b[j++];
            }
        }

        while(i<n)                    //[2]
        {
            arr[k++]=a[i++];
        }
        while(j<m)                    //[3]
        {
            arr[k++]=b[j++];
        }

        if((n+m)%2==0)                //[4]
        {
            float num= (arr[(n+m)/2]+arr[((n+m)/2)-1]);
            return (num/2);
        }
        else
        {
            return (arr[(n+m)/2]);
        }
    }
}

/*
The solution creates a new array of size (m+n) to accommodate the union of the sorted arrays
[1] The loop traverses till both the arrays are within their bounds, and breaks as soon as even 1 array gets completely iterated
the i and j variable compares the leftmost element of both the arrays, the smaller of the two gets added into the new array

[2,3] If any elements is left un-traversed of either arrays because the loop got terminated,
it will simply be copied to the new array

[4] If the number of elements is odd, the middle most element is the median.
If it is even, the average of the middle elements is returned
 */