package Testing;

// Q. Given string like s = abcbbbccbba
// If any 3 characters are present in the string consecutively, we can remove them
// Find shortest string possible
// O/p : aa

public class ThreeConsecutiveLetters {
    public static void main(String[] args) {
        String str = "abcbbbccbba";
        int count = 1;
        int flag = 0;
        StringBuilder sb = new StringBuilder();

        while(flag == 0) {
            flag = 1;
            for(int i = 0; i < str.length() - 1; i++) {
                sb.append(str.charAt(i));
                if(str.charAt(i+1) == str.charAt(i))
                    count++;
                else
                    count = 1;

                if(count == 3) {
                    flag = 0;
                    sb.delete(i-2, i);
                }
                System.out.println(sb);
            }
        }

        System.out.println(sb);
    }
}
