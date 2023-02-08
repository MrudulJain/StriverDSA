//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

package String_Easy;
public class Anagram {
    public static void main(String[] args)
    {
        String s = "anagram";
        String t="nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        int[] count= new int[26];
        int n= s.length();
        int m= t.length();
        for(int i=0;i<n;i++)
        {
            count[s.charAt(i)-'a']++;    //increments the value at index for which a character is found(a->0; b->1... z->25)
        }
        for(int i=0;i<m;i++)
        {
            count[t.charAt(i)-'a']--;    //decrements the value at index for which a character is found
        }
        for(int i=0;i<26;i++)
        {
            if(count[i]!=0)              //if the no. of a particular character in s= no. of a particular character in t, value at that index=0
            {
                return false;
            }
        }
        return true;
    }
}
