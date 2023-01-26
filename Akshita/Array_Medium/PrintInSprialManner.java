// You have to find the Kth element which will obtain while traversing the matrix spirally starting from the top-left corner of the matrix.

package Array_Medium;

public class PrintInSprialManner {
    public static void findK(int matrix[][], int n, int m, int k)
    {
        int top=0;
        int left=0;
        int right=m-1;
        int bottom=n-1;
        int count=0;
        while(top<=bottom && left<=right)     //for printing column wise
        {
            for(int i=left;i<=right;i++)      //for printing row wise (opposite cuz its row first traversal)
            {
                int ele=matrix[top][i];
                count++;
                if(count==k)
                {
                    System.out.println(ele);
                }
            }
            top++;
            for(int j=top;j<=bottom;j++)
            {
                int ele=matrix[j][right];
                count++;
                if(count==k)
                {
                    System.out.println(ele);
                }
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    int ele=matrix[bottom][i];
                    count++;
                    if(count==k)
                    {
                        System.out.println(ele);
                    }
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    int ele=matrix[i][left];
                    count++;
                    if(count==k)
                    {
                        System.out.println(ele);
                    }
                }
                left++;
            }
        }
    }
    public static void main(String[] args)
    {
        int n=3,m=3,k=4;
        int[][] arr= {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        findK(arr, n,m,k);

    }
}
