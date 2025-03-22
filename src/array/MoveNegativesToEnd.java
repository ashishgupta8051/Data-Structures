package array;

import utils.Utils;

public class MoveNegativesToEnd {

    public static void main(String[] args) {
        int[] ary = {-3,3,2,-1};
        moveNegativesToEnd(ary, ary.length);
    }

    private static void moveNegativesToEnd(int[] ary, int length) {
        int j = 0;
        int temp;
        for (int i = 0; i < length; i++){
            if (ary[i] >= 0){
                temp = ary[i];
                ary[i] = ary[j];
                ary[j] = temp;
                j++;
            }
        }
        Utils.displayArray(ary, "Display Array");
    }


}
