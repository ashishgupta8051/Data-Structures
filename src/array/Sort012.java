package array;

import utils.Utils;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0, 1, 0};
        Utils.displayArray(arr, "Unsorted Array");
        sortArray(arr);
        Utils.displayArray(arr, "Sorted Array");
    }

    private static void sortArray(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int index = 0;

        for (int value : arr){
            switch (value){
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
        }

        while (count0 > 0){
            arr[index] = 0;
            count0--;
            index++;
        }

        while (count1 > 0){
            arr[index] = 1;
            count1--;
            index++;
        }

        while (count2 > 0){
            arr[index] = 2;
            count2--;
            index++;
        }

    }

}
