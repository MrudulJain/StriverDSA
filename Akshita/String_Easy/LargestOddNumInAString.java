//You are given a string num, representing a large integer.
//Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.
//A substring is a contiguous sequence of characters within a string.

package String_Easy;
public class LargestOddNumInAString {
    public static void main(String[] args)
    {
        String str="55036";
        System.out.println(largestOddNumber(str));
    }

    public static String largestOddNumber(String num) {
        int n=num.length();
        for(int i=n-1;i>=0;i--)
        {
            if((num.charAt(i)-'0')%2!=0)      //Search for the first odd element from the right of the string
            {
                return num.substring(0,i+1);  //Return the substring from 0th element to the rightmost odd element
            }
        }
        return "";
    }
}
