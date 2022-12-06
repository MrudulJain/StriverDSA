package LearnTheBasics;

public class CHECKPALINDROME {
    public static void main(String[] args) {
        int[] arr = {1010101, 1223221, 123, 1};

        for(int i = 0; i < arr.length; i++) {
            String temp = Integer.toString(arr[i]);
            StringBuilder sb = new StringBuilder(temp);
            if(temp.equals(sb.reverse().toString())) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

        // NOTE : StringBuilder.reverse() is an in-place method, so we need to store previous string in temp var
        // ALT  --> Convert to string and using 2 pointer while(left < right) check palindrome
    }
}
