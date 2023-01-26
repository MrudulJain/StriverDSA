//Given a collection of Intervals, the task is to merge all of the overlapping Intervals.

package Array_Hard;
import java.util.*;
public class MergeOverlappingSubintervals {
    public static void overlappedInterval(int[][] Intervals)
    {
        ArrayList<int[]> ls=new ArrayList<>();
        Arrays.sort(Intervals,(a,b)->Integer.compare(a[0],b[0]));
        ls.add(Intervals[0]);
        int prev[]=ls.get(0);
        for(int i=1;i<Intervals.length;i++) {
            int curr[] = Intervals[i];
            if (curr[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], curr[1]);
            } else {
                ls.add(curr);
                prev = curr;
            }
        }
        System.out.println(ls);
    }

    public static void main(String[] args)
    {
        int n=5;
        int[][] arr= {{1,3},{2,4},{6,8},{9,10}};
        overlappedInterval(arr);
    }
}
