//Print numbers from N to 1 without the help of loops.
//TC:O(n), SC:O(1)

package Recursion;
import java.util.*;
public class PrintNTo1 {
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
            System.out.print(N+" ");
            printNos(N-1);
        }
    }
}

