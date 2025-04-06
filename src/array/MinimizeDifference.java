package array;

import utils.Utils;

public class MinimizeDifference {

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 10};
        int k = 3;

        getMinDiff(arr, k, arr.length);
    }

    private static void getMinDiff(int[] arr, int k, int length) {
        int[] latestAry = new int[length];
        int temp;

        for (int i = 0; i < length; i++){
            latestAry[i] = arr[i] + k;
        }
        Utils.displayArray(latestAry, "Latest Array");

        for (int i = 0; i < latestAry.length; i++){
            for (int j = i+1; j < latestAry.length; j++){
                if (latestAry[i] > latestAry[j]){
                    temp = latestAry[i];
                    latestAry[i] = latestAry[j];
                    latestAry[j] = temp;
                }
            }
        }
        Utils.displayArray(latestAry, "Sorted Array");

        int minimumDiff = latestAry[length - 1] - latestAry[0];
        Utils.printMessageInNextLine("Minimum Diff: "+minimumDiff);
    }
}
