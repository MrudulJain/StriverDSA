//Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
package Array_Medium;

public class Sort0s1s2s {
    public static void sort012(int a[], int n)
    {
        int j=0;
        int k=n-1;
        int i=0;
        while(i<=k)
        {
            if(a[i]==0)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j++;
            }
            else if(a[i]==1)
            {
                i++;
            }
            else
            {
                int temp=a[i];
                a[i]=a[k];
                a[k]=temp;
                k--;
            }
        }
        for(int l=0;l<n;l++)
         System.out.print(a[l]);
    }
    public static void main(String[] args)
    {
        int n=5;
        int[] arr= {0,2,1,2,0};
        sort012(arr, n);
    }
}
