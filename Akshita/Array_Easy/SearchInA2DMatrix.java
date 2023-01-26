//Given a matrix mat[][] of size N x M, where every row and column is sorted in increasing order, and a number X is given.
// The task is to find whether element X is present in the matrix or not.
// TC:O(n+m)

package Array_Easy;

public class SearchInA2DMatrix {
    public static void main(String[] args)
    {
        int N = 3, M = 3;
        int mat[][] = {{3, 30, 38},{ 44, 52, 54}, {57, 60, 69}};
        int X=62;
        System.out.println(matSearch(mat,N,M,X));
    }
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        int j=0;
        int i=0;
        for(i=0;i<N;i++)
        {
            if(mat[i][0]<=X && mat[i][M-1]>=X)
            {
                for(j=0;j<M;j++)
                {
                    if(mat[i][j]==X)
                    {
                        return 1;
                    }
                }
            }
        }

        return 0;
    }
}
