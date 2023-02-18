/*
Given an array arr[] of size n and an integer d, the task is to left rotate the array d indexes
TC: O(n)
*/
package Array_Easy;

public class LeftRotate {
    public static void main(String[] args)
    {
        int n=7;
        int d=2;
        int[] arr= {1, 2, 3, 4, 5, 6, 7};
        rotate(arr,n, d);
    }

    public static void rotate(int[] arr, int n, int d)
    {
        int j=d-1;
        for(int i=0;i<d/2;i++)     //[1]
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        j=n-1;
        for(int i=d;i<(n+d)/2;i++)  //[2]
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        j=n-1;
        for(int i=0;i<n/2;i++)      //[3]
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}


/*
Instead of creating another array to store the elements in the required way, or using 2 loops we do the following:
[1] reverse the initial d elements by swapping the first element of the d elements with the last element
The loop stops after the middle elements have been swapped.
If the loop executed till i<n, all the elements would first get swapped with their (n-i)th elements
and then get swapped to their original position,i.e. , the array would still remain same
{2, 1, 3, 4, 5, 6, 7}

[2]reverse the remaining elements
The loop executes till i<(n+d)/2, i.e., the middle of the (n-d) elements
example: d=2, n=7; i<(7+2)/2=> i<4
{2, 1, 7, 6, 5, 4, 3}

[3]reverse the entire array
{3, 4, 5, 6, 7, 1, 2}
*/

