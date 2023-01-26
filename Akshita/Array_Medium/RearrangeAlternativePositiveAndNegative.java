//Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
//Note: Array should start with a positive number.

package Array_Medium;
import java.util.*;
public class RearrangeAlternativePositiveAndNegative {
    static void rearrange(int arr[], int n) {
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        int pos_index=0, neg_index=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0)
            {
                pos.add(arr[i]);
            }
            else
            {
                neg.add(arr[i]);
            }
        }
        int i=0;
        while(pos_index<pos.size() && neg_index<neg.size())
        {
            arr[i++]=pos.get(pos_index++);
            arr[i++]=neg.get(neg_index++);
        }
        while(pos_index<pos.size())
        {
            arr[i++]=pos.get(pos_index++);
        }
        while(neg_index<neg.size())
        {
            arr[i++]=neg.get(neg_index++);
        }
        for(int l=0;l<n;l++)
            System.out.print(arr[l]);
    }
    public static void main(String[] args)
    {
        int n=9;
        int[] arr= {9, 4, -2, -1, 5, 0, -5, -3, 2};
        rearrange(arr, n);
    }

}
