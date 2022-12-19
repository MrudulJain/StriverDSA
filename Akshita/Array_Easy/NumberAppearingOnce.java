//Given a sorted array A[] of N positive integers having all the numbers occurring exactly twice, except for one number which will occur only once.
// Find the number occurring only once.
//TC: O(n)

package Array_Easy;

public class NumberAppearingOnce {
    public static void main(String[] args)
    {
        int n=5;
        int[] arr= {1, 1, 2, 5, 5};
        System.out.println(search(arr, n));
    }
    public static int search(int A[], int N)
    {
        int num=0;    //0^x=x
        for(int i=0;i<N;i++)
        {
            num=A[i]^num;   //x^x=0, x^X^y=y
        }
        return num;
    }
}

//Approach 2: using binary search, TC: O(log n)
