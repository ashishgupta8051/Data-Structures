package array;

import utils.Utils;

public class MaxSubarraySum {

    public static void main(String[] args) {
        int[] arr = {2, 3, -1, 2};

        maxSubArraySum(arr);
    }

    private static void maxSubArraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : arr){
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }

        Utils.printMessageInNextLine("Max Sum: "+maxSum);
    }
}
