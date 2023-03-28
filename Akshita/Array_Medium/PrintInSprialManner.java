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
        while(top<=bottom && left<=right)         //for checking that the conditions dont run out of bounds
        {
            for(int i=left;i<=right;i++)          //[1]
            {
                int ele=matrix[top][i];
                count++;
                if(count==k)
                {
                    System.out.println(ele);
                }
            }
            top++;

            for(int j=top;j<=bottom;j++)           //[2]
            {
                int ele=matrix[j][right];
                count++;
                if(count==k)
                {
                    System.out.println(ele);
                }
            }
            right--;

            if(top<=bottom)                        //[3]
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

            if(left<=right)                         //[4]
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

/*
The algorithm starts at the top-left corner of the matrix and moves towards the right column-wise,
then towards the bottom row-wise, then towards the left column-wise, and finally towards the top row-wise.
It keeps track of the current count of visited elements,
and as soon as it reaches the kth element, it prints its value and exits the method.

The algorithm first checks if the top boundary is less than or equal to the bottom boundary,
and the left boundary is less than or equal to the right boundary.
[1]Traverse the top row from left to right and print the kth element if found. Increment the top boundary.
[2]Traverse the right column from top to bottom and print the kth element if found. Decrement the right boundary.
[3]Traverse the bottom row from right to left and print the kth element if found. Decrement the bottom boundary.
[4]Traverse the left column from bottom to top and print the kth element if found. Increment the left boundary.

The if() conditions in [3,4] are used to check if the current spiral layer has been completed from top to bottom or left to right.
for example, arr={{1, 2}}
In this case, both top and bottom will be 0. The first loop will run and top will be incremented.
Now, since top<=bottom, this loop will not run.

This process keeps on repeating until the required element is found or all the indices of the matrix have been visited.
*/
