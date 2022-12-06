package Testing;

// Q. Given array, find the element whose value is closest to zero.
// If we have situation like, -7 and +7, the positive value must be considered

public class temp {
    public static void main(String[] args) {
        int[] arr1 = new int[] {7, 5, 9, 1, 4};
        int[] arr2 = new int[] {-273};
        int[] arr3 = new int[] {5526};
        int[] arr4 = new int[] {-15, -7, -9, - 14, -12};
        int[] arr5 = new int[] {-10, -10};

        int ans = findClosestToZero(arr1);
        System.out.println(ans);
        ans = findClosestToZero(arr2);
        System.out.println(ans);
        ans = findClosestToZero(arr3);
        System.out.println(ans);
        ans = findClosestToZero(arr4);
        System.out.println(ans);
        ans = findClosestToZero(arr5);
        System.out.println(ans);
    }

    public static int findClosestToZero(int[] arr) {
        int sp = Integer.MAX_VALUE;
        int ln = Integer.MIN_VALUE + 1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0 && sp > arr[i])
                sp = arr[i];
            if(arr[i] < 0 && ln < arr[i])
                ln = arr[i];
        }

        if(Math.abs(sp) <= Math.abs(ln)) {
            return sp;
        }
        else {
            return ln;
        }
    }
}
