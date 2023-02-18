//Given a positive integer N, return the Nth row of pascal's triangle.
//Pascal's triangle is a triangular array of the binomial coefficients formed by summing up the elements of previous row.

package Array_Hard;
import java.util.*;
public class PascalTriangle {
    static void nthRowOfPascalTriangle(int n) {
        ArrayList<Long> ans1=new ArrayList<>();
        long C = 1;
        for (int i = 1; i <= n; i++) {
            ans1.add(C);
            C =(C*(n - i)/ i);
        }
        System.out.println(ans1);
    }

    public static void main(String[] args)
    {
        int n=5;
        nthRowOfPascalTriangle( n);
    }
}

