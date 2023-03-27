//Find the majority element in the array.
// A majority element in an array A of size N is an element that appears more than N/2 times in the array.

package Array_Medium;

public class MajorityElementI {
    static void majorityElement(int a[], int size)
    {
        int n=size/2;
        int count=0;
        int ele=a[0];
        for(int i=0;i<size;i++)
        {
            if(ele==a[i])                     //[1]
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==0)                      //[2]
            {
                ele=a[i];
                count++;
            }
        }
        count=0;
        for(int i=0;i<size;i++)                //[3]
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

/*
This solution is based on Moore's voting algorithm and can be found in two steps:
find the candidate
verify the candidate
[1] if the current element == prev element which has been saved in the variable ele, count will be increased,
otherwise the count will be decremented.
The value of ele will remain the same till the count becomes 0.
[2] if the count becomes 0, the current element is set as ele and everytime that number is come across the count increases otherwise the count decreases till it is 0.
The value of ele at the last is the verified candidate with majority frequency.
[3] it is checked if the selected candidate's frequency really is the required number
*/
