/*
A valid parentheses string is either empty "", "(" + A + ")", or A + B,
where A and B are valid parentheses strings, and + represents string concatenation.
TC= O(n)
SC= O(n)
*/

package String_Easy;
import java.util.*;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuter(s));
    }

    public static String removeOuter(String s) {
        Stack<Character> st= new Stack<>();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (ch == '(') {                              //[1]
                if (st.size() > 0 ) {
                    sb.append(ch);
                }
                st.push(ch);
            }
            else {                                        //[2]
                st.pop();
                if (st.size() > 0) {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}

/*
The problem uses stack to push and pop the outermost parentheses
such that the data inside them can be stored in a StringBuilder object and later returned as a string.
[1] If the character in the string is '(' amd the stack is not empty, that means this character is not the outer bracket,
and it can be appended to the StringBuilder object.

[2] If the character is not '(' it means that it can be appended to the object as it is not the outer bracket
and we can pop the previously entered ')' from the stack.
 */
