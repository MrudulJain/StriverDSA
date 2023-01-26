// One number 'A' from set {1, 2, N} is missing and one number 'B' occurs twice in array. Find these two numbers.

package Array_Hard;

public class RepeatingAndMissingNumber {
    static void findTwoElement(int arr[], int n) {
        int[] nums=new int[2];
        int[] freq= new int[n+1];
        for(int i=0;i<n;i++)
        {
            freq[arr[i]]++;
        }
        for(int i=1;i<n+1;i++)
        {
            if(freq[i]==2)
            {
                nums[0]=i;
            }
            if(freq[i]==0)
            {
                nums[1]=i;
            }
        }
        System.out.println(nums);
    }
    public static void main(String[] args)
    {
        int n=2;
        int[] arr=  {2, 2};
        findTwoElement(arr, n);
    }
}
