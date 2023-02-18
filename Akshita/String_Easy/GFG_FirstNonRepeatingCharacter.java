package String_Easy;

public class GFG_FirstNonRepeatingCharacter {
    public static void main(String[] args)
    {
        String s = "twitterpat";
        System.out.println(nonrepeatingCharacter(s));
    }

    static char nonrepeatingCharacter(String S)
    {
        int[] visited= new int[26];
        int res=-1;
        for(int i=S.length()-1;i>=0;i--)
        {
            visited[S.charAt(i)-'a']++;   //[1]
        }
        for(int i=0;i<S.length();i++)
        {
            if(visited[S.charAt(i)-'a']==1)     //[2]
            {
                return S.charAt(i);
            }
        }
        return '$';
    }
}

/*
[1] Use a frequency array to store the frequencies of all the characters present in the given string
[2] on traversal from left to right, the first character with frequency=1 is returned as the first occuring non-repeating character
*/
