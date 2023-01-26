package Hashing;

import java.util.*;

public class FrequencyCount {

    public static void main(String[] args)
    {
        int N=5,P=5;
        int arr[] = {2, 3, 2, 3, 5};
        frequencyCount(arr,N,P);
        for(int i=0;i<N;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        //using HashMap
            /*HashMap<Integer,Integer> mp= new HashMap<Integer,Integer>();
            for(int i=0;i<N;i++)
            {
                if(!mp.containsKey(arr[i]))
                {
                    mp.put(arr[i],1);
                }
                else
                {
                    mp.put(arr[i],mp.get(arr[i])+1);
                }
            }
            for(int i=0;i<N;i++)
            {
                if(!mp.containsKey(i+1))
                {
                    arr[i]=0;
                }
                else
                {
                    arr[i]=mp.get(i+1);
                }
            }*/

        //using frequency array
        int n=Math.max(P,N);
        int[] freq=new int[n+1];
        for(int i=0;i<N;i++)
        {
            freq[arr[i]]+=1;
        }
        for(int i=0;i<N;i++)
        {
            arr[i]=freq[i+1];
        }
    }
}

