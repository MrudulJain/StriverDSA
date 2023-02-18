/*
Reversing the string while keeping the words as they were

 */
package String_Easy;
public class ReverseAString {

    public static void main(String[] args)
    {
        String s = "I like to code";
        System.out.println(reverseWords(s));
    }
    //Function to reverse words in a given string.
    static void reverse(char[] str, int low, int high)
    {
        while(low<=high)
        {
            char temp=str[low];
            str[low]=str[high];
            str[high]= temp;
            low++;
            high--;
        }
    }

    public static String reverseWords(String S)
    {
        int n=S.length();
        int start=0;
        char[] str= S.toCharArray();
        for(int end=0;end<n;end++)
        {
            if(str[end]==' ')           //reverse every word before space'
            {
                reverse(str, start, end-1);
                start=end+1;
            }
        }
        reverse(str, start, n-1);            //reversing last word
        reverse(str, 0, n-1);           //reversing the entire string
        String A= new String(str);
        return A;
    }
}

/*
If a space character is encountered, the word coming before it is revered
Last word is revered separately as it wasnt iterated through
 */
