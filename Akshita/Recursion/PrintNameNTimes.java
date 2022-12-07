//Print name N times using recursion.
//TC:O(n), SC:O(n)

package Recursion;
import java.util.*;
public class PrintNameNTimes {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String name=sc.next();
        print(n,name);
    }

    public static int print(int n,String name)
    {
        if(n>=1)
        {
            System.out.print(name+" ");
            print(n-1,name);
        }
        return 0;
    }
}
