//Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
package Array_Medium;

public class Sort0s1s2s {
    public static void sort012(int a[], int n)
    {
        int j=0;                    //to maintain the position of 0s
        int k=n-1;                  //to maintain position of 2s
        int i=0;                    //to loops through the current element
        while(i<=k)
        {
            if(a[i]==0)              //[1]
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j++;
            }
            else if(a[i]==2)         //[2]
            {
                int temp=a[i];
                a[i]=a[k];
                a[k]=temp;
                k--;
            }
            else
            {
                i++;                //[3]
            }
        }
        for(int l=0;l<n;l++)
        {
            System.out.print(a[l]);
        }
    }
    public static void main(String[] args)
    {
        int n=5;
        int[] arr= {0,2,1,2,0};
        sort012(arr, n);
    }
}

/*
Dutch National flag problem or 3 way partitioning problem
[1] if the current element is 0, it will be swapped with the element at jth position and j will be increased, hence sending the 0s to their right positions.
[2] if the current element is 2, it will be swapped with the element at kth position and k will be decremented, hence sending the 2s to their right positions
[3] if the current element is 1, we will simply let it be as the 0s and 2s get sorted while letting 1 be at its right position.
*/
