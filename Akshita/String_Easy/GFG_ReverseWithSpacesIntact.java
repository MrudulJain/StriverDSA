//Given a string, your task is to reverse the string keeping the spaces intact to their positions.

package String_Easy;

public class GFG_ReverseWithSpacesIntact {
    public static void main(String[] args)
    {
        String s = "I like to code";
        System.out.println(reverseWithSpacesIntact(s));
    }

    static String reverseWithSpacesIntact(String S)
    {
        int high=S.length()-1;
        char[] str=S.toCharArray();
        int low=0;
        while(low<=high)
        {
            if(str[high]==' ')  //[1]
            {
                high--;
                continue;
            }
            if(str[low]==' ')   //[2]
            {
                low++;
                continue;
            }
            char temp=str[low];  //[3]
            str[low]=str[high];
            str[high]= temp;
            low++;
            high--;

        }
        String A= new String(str);
        return A;
    }
}

/*
[1,2] to skip over the spaces, so that they remain at their original position

[3] swaps the character at high and low positions(starting of the string and ending of the string)
I like to code-> e doco te kilI
 */
