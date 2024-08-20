package array;

public class CommonSubsequence {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 30, 40, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        int result = findCommonSubsequence2(arr1, arr2);
        System.out.println("Length of common subsequence: " + result);

    }

    private static int findCommonSubsequence(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr1[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }

    private static int findCommonSubsequence2(int[] arr1, int[] arr2) {
        int count = 0;

        for (int j : arr1) {
            for (int k : arr2) {
                if (j == k) {
                    count = count + 1;
                }
            }
        }


        return count;
    }


}
