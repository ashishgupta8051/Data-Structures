package shorting;

import utils.Utils;

import java.util.Scanner;

public class BubbleShort {

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

        int[] sortedlist = doShorting(list);

        Utils.displayArray(sortedlist, "Sorted List");


    }

    private static int[] doShorting(int[] list) {
        int temp;
        for (int i = 0; i < list.length; i++){
            for (int j = i + 1; j < list.length; j++){
                if (list[j] < list[i]){
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }
}


//Time Complexity BC: O(n), AC: O(n*n), WC: O(n*n)
