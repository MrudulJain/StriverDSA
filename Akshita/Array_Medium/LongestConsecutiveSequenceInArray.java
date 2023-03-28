//Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.

package Array_Medium;
import java.util.*;
public class LongestConsecutiveSequenceInArray {

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

/*
This algorithm simply inserts the given values in ordered set and then checks the max length of continuous subsequences.
If the current element(val)==value(last element+1), count is incremented. Else, count = 1 as the new subsequence starts.
*/