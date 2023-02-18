/*
There are n stairs, a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time.
Count the number of ways, the person can reach the top (order does matter).
TC: O(n)
 */

package DP;

public class GFG_NthStair {
    public static void main(String[] args)
    {
        int n = 4;
        System.out.println(countWays(n));
    }

    static int countWays(int n)
    {
        if(n==1) return 1;
        int prev=1;       //only 1 possible way to climb a stair
        int curr=2;       //only 2 possible ways to reach 2nd stair->[1,1], [2]
        int ways=0;
        for(int i=2;i<n;i++)
        {
            ways= prev+curr;
            prev=curr;
            curr=ways;
        }
        return curr;
    }
}

/*
The solution works on the principle that if the order of steps taken is not considered,
then the number of possible ways a person can reach the nth stair is
no. of ways for (n-1)th(curr) + no. of ways for (n-2)th stair(prev)
The variables are constantly updated with values till the no. of ways to reach the desired stair is found
 */
