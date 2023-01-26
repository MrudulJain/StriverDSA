//The task is to rotate it by 90 degrees in anti-clockwise direction without using any extra space.

package Array_Medium;

public class RotateBy90Degrees {
    //Function to rotate matrix anticlockwise by 90 degrees- inplace transpose + row swap
    static void rotateby90(int arr[][], int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }// inplace transposing done
        int bottom=n-1;
        for(int i=0;i<n/2;i++)
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
