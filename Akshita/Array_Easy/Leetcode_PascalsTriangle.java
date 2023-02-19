/*
Given an integer numRows, return the first numRows of Pascal's triangle.
TC= O(n^2)
SC= O(n^2)
*/

package Array_Easy;
import java.util.*;
public class Leetcode_PascalsTriangle {
    public static void main(String[] args)
    {
        int n=5;
        generate(n);
    }

    public static void generate(int n) {
        List<List<Integer>> result = new ArrayList<>();
        int c=1;
        for(int i=1;i<=n;i++)              //list index
        {
            List<Integer> row= new ArrayList<>();
            for(int j=0; j<i;j++)          //row index
            {
                if(j==0 || j==i-1)         //[1]
                {
                    row.add(1);
                }
                else
                {
                    row.add(result.get(i-2).get(j-1) + result.get(i-2).get(j));
                }
            }
            result.add(row);
        }
        System.out.println(result);
    }
}

/*
The solution is based on the principle of a Pascal's triangle: an element is the sum of the two elements directly above it
[1] The first and the last elements of any row are always 1
result.get(i-2) -> Gives the required element for (i-2)th row since i starts with 1st index to prevent out of bounds exception
(i)    0 1 2 (j->)
1      1
2      1 1
3      1 2 1
*/