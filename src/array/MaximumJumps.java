package array;

import utils.Utils;

public class MaximumJumps {

    public static void main(String[] args) {
        int[] ary = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

        int maxJump = findMaximumJump(ary);
        Utils.printMessageInNextLine("Max Jumps: "+maxJump);
    }

    private static int findMaximumJump(int[] arr) {
        int length = arr.length;
        int maxReach = arr[0];
        int steps = arr[0];
        int jumps = 1;

        if (steps != 0){
            for (int i = 1; i < length; i++){
                if (i == arr.length - 1) {
                    return jumps; // Reached the end
                }

                if (i + arr[i] > maxReach) {
                    maxReach = i + arr[i]; // Update maxReach
                }

                steps--;

                if (steps == 0) { // Need to jump
                    jumps++;
                    if (i >= maxReach) {
                        return -1; // Cannot move forward
                    }
                    steps = maxReach - i; // Update steps for the next jump
                }
            }
        }else {
            return -1;
        }
        return -1;
    }
}
