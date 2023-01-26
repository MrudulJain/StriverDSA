//Your task is to make Zeroes, that means in whole matrix when you find a zero, convert its upper, lower, left, and right value to zero and make that element the sum of the upper, lower, left and right value. Do the following tasks according to the initial matrix.

package Array_Medium;

public class SetMatrixZeroes {
    public static void MakeZeros(int[][] matrix)
    {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] arr= new int[n][m];    //to use as an unchanged reference to loop up when calculating
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int sum=0;
                if(arr[i][j]==0)
                {
                    if(i-1>=0)
                    {
                        sum+=arr[i-1][j];
                        matrix[i-1][j]=0;
                    }
                    if(i+1<n)
                    {
                        sum+=arr[i+1][j];
                        matrix[i+1][j]=0;
                    }
                    if(j+1<m)
                    {
                        sum+=arr[i][j+1];
                        matrix[i][j+1]=0;
                    }
                    if(j-1>=0)
                    {
                        sum+=arr[i][j-1];
                        matrix[i][j-1]=0;
                    }
                    matrix[i][j]=sum;
                    sum=0;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int[][] arr= {{1, 2, 3, 4},{5, 6, 0, 7}, {8, 9, 4, 6}, {8, 4, 5, 2}};
        MakeZeros(arr);
    }

}
