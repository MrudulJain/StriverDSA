/*
Find all prime numbers till n.
TC = O(n log n)
*/

package MathsForDSA;
import java.lang.reflect.Array;
import java.util.*;

public class GFG_SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sieveOfEratosthenes(n));
    }

    static ArrayList<Integer> sieveOfEratosthenes(int n)
    {
        boolean[] prime = new boolean[n+1];
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.fill(prime, true);

        for( int i = 2; i <= n; i++)
        {
            if( prime[i] == true)
            {
                result.add( i );

                for( int j = i*i; j <= n+1; j += i)       //traversing through multiples of i and marking them as false
                {
                    prime[j] = false;
                }
            }
        }
        return result;
    }
}

/*
Make a boolean array of size n+1 called prime array or sieve and initialize it as true - marking all as prime initially.
0th and 1st index are not required as prime numbers start with 2.

Now, we'll make a list of prime numbers and we will insert into this list prime numbers from the prime array.
Next, we will mark all the multiples of inserted prime numbers as false and iterate through prime array to insert next element makrked as true and repeat the process.

optimization : if you are at a number i, then all the numbers before it would have already been marked at false,
therefore if we start at i*i it will reduce time duration of our code.
 */