package LearnTheBasics;

import java.util.HashMap;
import java.util.Map;

public class GCD {
    public static void main(String[] args) {
        int n1 = 18;
        int n2 = 24;

        System.out.println("GCD IS");
        System.out.println("Euclid GCD Method :" + euclidGCD(n1, n2));
        System.out.println("Prime Factor Method :" + primeFactorGCD(n1, n2));
    }

    public static int euclidGCD(int n1, int n2) {
        // Theorem : gcd(a,b) = gcd(b,r) where r = a%b (remainder)
        if(n2 == 0)
            return n1;

        return euclidGCD(n2, n1 % n2);
    }

    public static int primeFactorGCD(int n1, int n2) {
        // Get all prime factors of both nums, then multiply their minimum common occurrences
        Map<Integer, Integer> pfMap1 = getPrimeFactors(n1);
        Map<Integer, Integer> pfMap2 = getPrimeFactors(n2);
        int gcd = 1;

        for (int i : pfMap1.keySet()) {
            if(pfMap2.containsKey(i))
                gcd *= Math.pow(i, Math.min(pfMap1.get(i), pfMap2.get(i)));
        }

        return gcd;
    }

    public static Map<Integer, Integer> getPrimeFactors(int num) {
        Map<Integer, Integer> pfMap = new HashMap<>();
        for(int i = 2; i <= Math.sqrt(num); i++) {
            while(num % i == 0) {
                num = num/i;
                pfMap.put(i, pfMap.getOrDefault(pfMap.get(i), 0) + 1);
            }
        }

        return pfMap;
    }
}
