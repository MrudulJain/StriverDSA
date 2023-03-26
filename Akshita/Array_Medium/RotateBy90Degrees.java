//The task is to rotate it by 90 degrees in anti-clockwise direction without using any extra space.

package Array_Medium;

public class RotateBy90Degrees {

    static void rotateby90(int arr[][], int n)
    {
        for(int i=0;i<n;i++)                         //[1]
        {
            for(int j=0;j<i;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        int bottom=n-1;
        for(int i=0;i<n/2;i++)                       //[2]
        {
            for(int j=0;j<n;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[bottom][j];
                arr[bottom][j]=temp;
            }
            bottom--;
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int n=3;
        int[][] arr= {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        rotateby90(arr,n);
    }
}

/*
To rotate a matrix by 90 degrees, two steps are involved:
[1] transpose- exchanging the rows by columns in place. This is done by swapping the current element arr[i][j](row) by arr[j][i](column)
1 4 7
2 5 8
3 6 9
[2] swapping the rows- the rows are swapped. 0th row by n-1th row, 1st by n-2th and so on till the middlemost row is swapped.
We wont swap after that because by doing so, we will go back to the original state of the matrix after transposing
*/
