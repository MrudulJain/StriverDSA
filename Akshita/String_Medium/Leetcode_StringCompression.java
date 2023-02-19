/*
Given an array of characters chars, compress it using the following algorithm:
Begin with an empty string s. For each group of consecutive repeating characters in chars:
If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.

TC= O(n)
SC= O(n)
 */

package String_Medium;

public class Leetcode_StringCompression {
    public static void main(String[] args)
    {
        char[] chars={'a','a','b','b','c','c','c'};
        compress(chars);
    }

    public static int compress(char[] chars) {
        int n= chars.length;
        StringBuilder s= new StringBuilder();
        int count=1;
        for(int i=0;i<n-1;i++)
        {
            if(chars[i]==chars[i+1])                           //[1]
            {
                count++;
            }
            else                                               //[2]
            {
                s.append(chars[i]);
                if(count>1)
                {
                    s.append(count);
                }
                count=1;
            }
        }

        if(count>1)                                            //[3]
        {
            s.append(chars[n-1]);
            s.append(count);
        }
        else
        {
            s.append(chars[n-1]);
        }
        int m=s.length();
        s.toString();
        for(int i=0;i<m;i++)
        {
            chars[i]=s.charAt(i);
        }

        for(int i=0;i<m;i++)
        {
            System.out.print(chars[i]);
        }
        return m;
    }
}

/*
The solution uses an object of StringBuilder and appends every character and its frequency,
and then copies the characters/numbers in the array to the original character array, hence modifying it.

[1] If the consecutive characters are same, the value of count increases to the frequency of that character
[2] If there is only 1 character of a particular type, it gets appended, without its frequency.
If the consecutive characters change, the last character, along with its frequency gets appended to the StringBuilder object
[3] Appending the character and frequency of the last same consecutive character since they didnt satisfy the condition of being unequal to the next substring
*/