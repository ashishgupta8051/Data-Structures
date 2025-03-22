package array;

import utils.Utils;

public class ReverseArray {
    public static void main(String[] args) {
        int[] ary = {2,3,1,4,5,8};
        Utils.displayArray(ary, "Before reverse");
        int[] reverseArray = reverseArray(ary, ary.length);
        Utils.displayArray(reverseArray, "After reverse");
    }

    private static int[] reverseArray(int[] ary, int length) {
        int[] tempAry = new int[length];
        int j = 0;
        for (int i = length - 1; i >= 0; i--){
            tempAry[j] = ary[i];
            j++;
        }
        return tempAry;
    }
}
