package array;

import utils.Utils;

public class KthElementFinder {

    public static void main(String[] args) {
        int[] array = {4,2,5,10,20,24};
        int k = 2;

        int[] sortedArray= sortedArray(array);
        Utils.displayArray(sortedArray, "Sorted Array");

        System.out.println("Smallest "+k+"th element is: "+sortedArray[k - 1]);
        System.out.println("Biggest "+k+"th element is: "+sortedArray[sortedArray.length - k]);

    }

    private static int[] sortedArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j <array.length; j++){
                if (array[j] < array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
