//Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.

package Array_Medium;
import java.util.*;
public class LongestConsecutiveSequenceInArray {
    // arr[] : the input array
    // N : size of the array arr[]

    //Function to return length of longest subsequence of consecutive integers.
    static void findLongestConseqSubseq(int arr[], int N)
    {
        NavigableSet <Integer> set= new TreeSet<Integer>();
        for(int i=0;i<N;i++)
        {
            set.add(arr[i]);            //sorted set with unique elements
        }
        int count=0, max=0;
        int value=set.first();
        for(int val:set)
        {
            if(value==val)
            {
                count++;
            }
            else
            {
                count=1;
            }
            if(count>max)
            {
                max=count;
            }
            value=val+1;
        }
        System.out.println(max);
    }

    public static void main(String[] args)
    {
        int n=8;
        int[] arr= {5, 6, 2, 1 ,4 ,3 ,0, 7};
        findLongestConseqSubseq(arr,n);
    }

}
