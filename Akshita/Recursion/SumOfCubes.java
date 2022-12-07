//Sum of cubes of natural numbers till N.

package Recursion;
import java.util.*;
public class SumOfCubes {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(sumOfCubes(N));
    }

    public static long sumOfCubes(int N)
    {
        if(N>=1)
            return (long)(N*N*N)+sumOfCubes(N-1);
        else
            return 0;
    }
}
