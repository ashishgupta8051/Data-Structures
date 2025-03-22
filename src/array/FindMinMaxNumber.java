package array;

import utils.Utils;

import java.util.Scanner;

public class FindMinMaxNumber {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] list = new int[number];

        for (int i = 0; i < number; i++){
            System.out.print("Enter a "+i+" Number : ");
            int number2 = scanner.nextInt();
            list[i] = number2;
        }

        doSearching(list);
        findMinMaxWithSorting(list, list.length);
    }

    private static void findMinMaxWithSorting(int[] list, int length) {
        int temp;
        for (int i = 0; i < length; i++){
            for (int j = i + 1; j < length; j++){
                // Ascending Order
                if (list[i] > list[j]){
                    temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }

                //Descending Order
//                if (list[i] < list[j]){
//                    temp = list[i];
//                    list[i] = list[j];
//                    list[j] = temp;
//                }
            }
        }
        Utils.displayArray(list, "Shorting List");
        Utils.printMessageInNextLine("Max Value: "+list[length - 1]);
        Utils.printMessageInNextLine("Min Value: "+list[0]);
    }

    private static void doSearching(int[] list) {
        int max = findMax(list);
        int min = findMin(list);
        Utils.printMessageInNextLine("Max Number : "+max);
        Utils.printMessageInNextLine("Min Number : "+min);
    }

    private static int findMin(int[] list) {
        int value = list[0];
        for (int i : list) {
            if (i < value) {
                value = i;
            }
        }
        return value;
    }

    private static int findMax(int[] list) {
        int value = list[0];
        for (int i : list) {
            if (i > value) {
                value = i;
            }
        }
        return value;
    }
}
