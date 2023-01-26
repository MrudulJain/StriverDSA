//You are given a list of integers nums where each number represents a vote to a candidate. Return the ids of the candidates that have greater than n/3 votes, If there's not a majority vote, return -1.

package Array_Hard;
import java.util.*;

public class MajorityElementII {
    public static void Solve(int n, int[] a) {
        HashMap<Integer,Integer> l=new HashMap<>();
        ArrayList<Integer> m=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            l.put(a[i],l.getOrDefault(a[i], 0)+1);
        }
        for(int j:l.keySet())
        {
            if(l.get(j)>n/3)
            {
                m.add(j);
            }
        }
        if(m.isEmpty()){
            m.add(-1);
        }
        System.out.println(m);
    }

    public static void main(String[] args)
    {
        int n=5;
        int[] arr= {0,2,1,2,0};
        Solve(n,arr);

    }
}
