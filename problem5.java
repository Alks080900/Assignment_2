package Assignment_2;

import java.util.Arrays;

public class problem5 {
    public static int[] combine(int[] a, int[] b) {
        // Added a value to have the increment which I will store in temp array value while looping
        int totalArray = 0;
        for (int i = 0; i < a.length; i++) {
            totalArray++;
        }
        for (int i = 0; i < b.length; i++) {
            totalArray++;
        }
        // After the increment values has been stored it will be the size as placeholder of 2 arrays.
        int[] temp = new int[totalArray];
        //First I have followed the signature to store array A first in temp.
        System.arraycopy(a, 0, temp, 0, a.length);
        //Then after I have stored array A I have added array B that will be stored at the end of array A length
        System.arraycopy(b, 0, temp, a.length, b.length);

        return temp;
    }

    public static void main(String[] args) {
        int[] a = {5, 6, -4, 3, 1};
        int[] b = {3, 8, 9, 11};
        System.out.println(Arrays.toString(combine(a,b)));
    }
}
