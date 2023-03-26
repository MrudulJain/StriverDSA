//Your task is to make Zeroes, that means in whole matrix when you find a zero, convert its upper, lower, left, and right value to zero,
// and make that element the sum of the upper, lower, left and right value. Do the following tasks according to the initial matrix.

package Array_Medium;

public class SetMatrixZeroes {
    public static void MakeZeroes(int[][] matrix)
    {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] arr= new int[n][m];                          //to use as an unchanged reference to loop up when calculating
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=matrix[i][j];                      //[1]
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int sum=0;
                if(arr[i][j]==0)
                {
                    if(i-1>=0)                              //[2]
                    {
                        sum+=arr[i-1][j];
                        matrix[i-1][j]=0;
                    }
                    if(i+1<n)                               //[3]
                    {
                        sum+=arr[i+1][j];
                        matrix[i+1][j]=0;
                    }
                    if(j+1<m)                               //[4]
                    {
                        sum+=arr[i][j+1];
                        matrix[i][j+1]=0;
                    }
                    if(j-1>=0)                              //[5]
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
        int[][] arr= {{0, 2, 3, 4},{5, 6, 7, 0}, {8, 9, 4, 6}, {2, 4, 5, 2}};
        MakeZeroes(arr);
    }
}

/*
To solve this problem, we first need to copy the given matrix into a new matrix
so that even after modifying the new matrix, the original values can be retained for further modification of the matrix.

[1] if the element above the current element exists, it'll be made 0 and will be added to the variable sum
[2] if the element below the current element exists, it'll be made 0 and will be added to the variable sum
[3] if the element on the right of the current element exists, it'll be made 0 and will be added to the variable sum
[4] if the element on the left of the current element exists, it'll be made 0 and will be added to the variable sum
the current element is then replaced by the sum of these elements and the variable sum is 0 again, for the next computation
*/