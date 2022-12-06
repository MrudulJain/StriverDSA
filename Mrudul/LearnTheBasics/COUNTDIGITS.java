package LearnTheBasics;

public class COUNTDIGITS {
    public static void main(String[] args) {
        int a = -123456789;
        if(a < 0) { a = a * -1; }

        // O(1)
        System.out.println((int) (Math.log10(a)+1)); // Math.log returns double
        System.out.println(Integer.toString(a).length());
        System.out.println(String.valueOf(a).length());

        // O(n)
        int count = 0;
        while(a > 0) {
            a = a/10;
            count++;
        }
        System.out.println(count);


    }
}
