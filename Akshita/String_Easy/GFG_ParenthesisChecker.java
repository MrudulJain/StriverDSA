/*
Given an expression string x. Examine whether the pairs and the orders of {,},(,),[,] are correct in exp.
TC= O(n)
SC= O(n)
 */

package String_Easy;
import java.util.*;

public class GFG_ParenthesisChecker {
    public static void main(String[] args)
    {
        String str="[()]{{[()()]()}}";
        System.out.println(ispar(str));
    }
    static boolean ispar(String x)
    {
        Stack<Character> st= new Stack<>();
        int count=0;
        for(int i=0;i<x.length();i++)
        {
            if(st.isEmpty() || x.charAt(i)=='(' || x.charAt(i)=='{' || x.charAt(i)=='[')
            {
                st.push(x.charAt(i));
                continue;
            }
            else if(st.peek()=='(' && x.charAt(i)==')')
            {
                st.pop();
                continue;
            }
            else if(st.peek()=='[' && x.charAt(i)==']')
            {
                st.pop();
                continue;
            }
            else if(st.peek()=='{' && x.charAt(i)=='}')
            {
                st.pop();
                continue;
            }
            else
            {
                count++;
            }
        }
        if(st.isEmpty() && count==0)
        {
            return true;
        }
        return false;
    }
}

/*
This program uses stack to input the opening braces as we encounter them while iterating the string
and popping them if the closing bracket of the topmost present element in the stack is found during the iteration
if the stack is empty but the count is not 0, some elements were not pushed into the stack and they dont have the corresponding parenthesis present in the string
 */
