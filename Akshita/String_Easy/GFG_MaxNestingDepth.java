/*
A string is a valid parentheses string (denoted VPS ) if is meets any one of the following:
It is an empty string "", or a single character not equals to " ( "  or  " ) " ,
It can be written as AB (A concatenated with B ),
where A and B are VPS's , or
It can be written as (A) , where A is a VPS.

TC = O( n )
SC = O( 1 )
 */

package String_Easy;
import java.util.Stack;

public class GFG_MaxNestingDepth {
    public static void main(String[] args) {
        String s = "((5+2)(3+4)((6)))";
        System.out.println( maxDepth(s) );
    }

    public static int maxDepth(String s) {
        int c = 0, max = 0;
        Stack <Character> st= new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if( ch == '(' )                                      //[1]
            {
                if( st.size() == 0 || st.peek() == '(' )
                {
                    c++;
                }
                st.push( ch );
            }
            else if( ch == ')')                                 //[2]
            {
                st.pop();
                max = c > max ? c : max;
                c--;
            }
        }
        return max;
    }
}

/*
This problem uses a stack to push in the first '(' we find,
and then count the number of nested '(' to return their maximum number.

[1] If the character ch is '(', it will be pushed into the stack and the value of count increases by 1.

[2] If ch is ')', it means that the closing bracket is found and its opening bracket can be popped from the stack.
The brackets are not nested now, hence we compare the maximum depth/count found till now so that it can be stored and
the value of c gets reduced for every pair of bracket found.
 */