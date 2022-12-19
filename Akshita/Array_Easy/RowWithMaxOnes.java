//Given a boolean 2D array of n x m dimensions where each row is sorted.
// Find the 0-based index of the first row that has the maximum number of 1's.
//TC: O(n^2)

package Array_Easy;

public class RowWithMaxOnes {
    public static void main(String[] args)
    {
        int N = 4, M = 4;
        int mat[][] = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        System.out.println(rowWithMax1s(mat,N,M));
    }
    static int rowWithMax1s(int arr[][], int n, int m) {
        int index=-1;
        int maxCount=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<m;j++)
            {
                if (arr[i][j]==1)
                {
                    count++;
                }
            }
            if(count>maxCount)
            {
                maxCount=count;
                index=i;
            }
        }
        return index;
    }
}
