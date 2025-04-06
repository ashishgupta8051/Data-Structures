package array;

import utils.Utils;

public class RotateArray {

    public static void main(String[] args) {
        int[] ary = {1,2,3,0};
        Utils.displayArray(ary, "Before Rotate Array");

        rotateArray(ary, ary.length);
    }

    private static void rotateArray(int[] ary, int length) {
        int lastValue = ary[length -1];

        for (int i = ary.length - 1; i > 0; i--) {
            ary[i] = ary[i - 1];
        }
        ary[0] = lastValue;
        Utils.displayArray(ary, "After Rotate Array");
    }
}
