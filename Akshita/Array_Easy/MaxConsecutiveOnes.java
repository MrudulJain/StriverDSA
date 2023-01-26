//Given a binary array nums, return the maximum number of consecutive 1's in the array
//TC:O(n)

package Array_Easy;

public class MaxConsecutiveOnes {
    public static void main(String[] args)
    {
        int[] arr={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] arr) {
        int count=0, maxCount=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;
            }
            else
            {
                count=0;
            }
            if(maxCount<count)
            {
                maxCount=count;
            }
        }
        return maxCount;
    }
}
