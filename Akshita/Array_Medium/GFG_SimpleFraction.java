/*
Given a fraction. Convert it into a decimal.
If the fractional part is repeating, enclose the repeating part in parentheses.
*/

package Array_Medium;
import java.util.*;

public class GFG_SimpleFraction {
    public static void main(String[] args)
    {

    }
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        StringBuilder res = new StringBuilder();
        res.append(((numerator > 0) ^ (denominator > 0)) ? "-" : "");     //[1]
        int num = Math.abs(numerator);
        int den = Math.abs(denominator);

        // integral part
        int q= num/den;                                                    //[2]
        res.append(q);
        num %= den;
        if (num == 0) {                                                    //[3]
            return res.toString();
        }

        // fractional part
        res.append(".");
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(num, res.length());
        while (num != 0) {
            num *= 10;
            res.append(num / den);
            num %= den;
            if (map.containsKey(num)) {
                int index = map.get(num);
                res.insert(index, "(");
                res.append(")");
                break;
            } else {
                map.put(num, res.length());
            }
        }
        return res.toString();
    }
}

/*

 */