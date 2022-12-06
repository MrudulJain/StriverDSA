package LearnTheBasics;

// Question from GFG ---> Striver Check For Prime

public class MINJUMPS {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 1, 1, 1, 1};  // Ans = 3 --> 1, 3, 4, 1
        System.out.println(minJumps(arr1));
        int[] arr2 = {2, 3, 1, 1, 2, 4, 2, 0, 1, 1}; // Ans = 4 ---> 2, 3, 2, 4, 1
        System.out.println(minJumps(arr2));
        int[] arr3 = {9,10,1,2,3,4,8,0,0,0,0,0,0,0,1}; // Ans = 3 ---> 9, 8, 1
        System.out.println(minJumps(arr3));
    }

    static int minJumps(int[] arr) {
        int minJumps = 0;
        int currPos = 0;

        while(currPos < arr.length - 1) {
            int jumps = arr[currPos];
            if(jumps + currPos >= arr.length - 1)
                return minJumps+1;

            int max = 0, nextJump = 0;
            for(int i = 1; i <= jumps && currPos+i < arr.length; i++) {
                if(arr[currPos+i] >= max) {
                    max = arr[currPos+i];
                    nextJump = currPos+i;
                }
                //System.out.println(max + " " +nextJump);
            }

            if(max == 0)
                return -1; // can't traverse whole array

            currPos = nextJump;
            //System.out.println("Curr pos = " + currPos);
            minJumps++;
        }

        return minJumps;
    }
}
