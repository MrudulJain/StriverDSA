//Print numbers from 1 to N without the help of loops.
//TC:O(n), SC:O(1)

package Recursion;
import java.util.*;
public class Print1ToN {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        printNos(N);
    }

    public static void printNos(int N)
    {
        if(N>0)
        {
            printNos(N-1);
            System.out.print(N+" ");
        }
    }
}
