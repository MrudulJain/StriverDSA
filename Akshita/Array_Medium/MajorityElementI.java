//Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.

package Array_Medium;

public class MajorityElementI {
    static void majorityElement(int a[], int size)
    {
        int n=size/2;
        int count=0;
        int ele=a[0];
        for(int i=0;i<size;i++)
        {
            if(ele==a[i])
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==0)
            {
                ele=a[i];
                count++;
            }
        }
        count=0;
        for(int i=0;i<size;i++)
        {
            if(a[i]==ele)
            {
                count++;
            }
        }
        if(count>n)
            System.out.print(ele);
        else
            System.out.println("-1");
    }
    public static void main(String[] args)
    {
        int n=5;
        int[] arr= {3,2,3,4,3};
        majorityElement(arr, n);
    }
}
