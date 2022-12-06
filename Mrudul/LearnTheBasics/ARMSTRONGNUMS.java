package LearnTheBasics;

/*
Armstrong Numbers are the numbers
having the sum of digits raised to power no. of digits is equal to a given number
Ex.
153
1^3 + 5^3 + 3^3 = 153
1^4 + 6^4 + 3^4 + 4^4 = 1634
 */

public class ARMSTRONGNUMS {
    public static void main(String[] args) {
        // Check if given number is Armstrong Number in O(n) time and O(1) space
        int[] arr = {0, 1, 153, 170, 370, 371, 407, 1634};
        for(int i = 0; i < arr.length; i++) {
            if(checkIfArmstrong(arr[i]))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    public static boolean checkIfArmstrong(int n1) {
        String str = Integer.toString(n1);
        int strLen = str.length();
        int sum = 0;

        for (int i = 0; i < strLen; i++) {
            int digit = str.charAt(i) - '0';
            sum += Math.pow(digit, strLen);
        }

        if(sum == n1)
            return true;

        return false;
    }
}
