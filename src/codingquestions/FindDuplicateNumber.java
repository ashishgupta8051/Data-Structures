package codingquestions;

import java.util.Scanner;

public class FindDuplicateNumber {
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

        findDuplicateNumber(list, list.length);
    }

    private static void findDuplicateNumber(int[] list, int length) {
        int duplicateNumber = -1;
        int position = 0;
        int index = 0;
        for (int i = 0; i < length; i++){
            for (int j = i + 1; j < length; j++){
                if (list[i] == list[j]){
                    duplicateNumber = list[i];
                    position = j + 1;
                    index = j;
                    break;
                }
            }

        }

        if (duplicateNumber == -1){
            System.out.println("Not Found Duplicate Number");
        }else {
            System.out.println("Found Duplicate Number: "+ duplicateNumber);
            System.out.println("Position: "+position);
            System.out.println("Index: "+index+"\n");
        }

        displayArray(list);
        
        System.out.println();
        System.out.println("Do you want to remove duplicate number (Yes: 1, No: 2) : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1){
            deleteArray(list, index, list.length);
        }
    }


    private static void deleteArray(int[] ary, int delete_index_number, int length) {
        for (int i = delete_index_number; i <= length; i++) {
            ary[i] = ary[i - 1];
        }
/*
        for (int value : ary) {
            System.out.print(value+" ");
        }*/

    }

    private static void displayArray(int[] ary) {
        for (int value : ary) {
            System.out.print(value+" ");
        }
    }
}
