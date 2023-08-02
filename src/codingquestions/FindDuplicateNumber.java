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

        int duplicateNumber = findDuplicateNumber(list);

        if (duplicateNumber == -1){
            System.out.print("Not Found Duplicate Number");
        }else {
            System.out.print("Found Duplicate Number: "+ duplicateNumber);
        }
    }

    private static int findDuplicateNumber(int[] list) {
        int duplicateNumber = -1;
        for (int i = 0; i < list.length; i++){
            for (int j = i + 1; j < list.length; j++){
                if (list[i] == list[j]){
                    duplicateNumber = list[i];
                    return duplicateNumber;
                }
            }
        }

        return duplicateNumber;
    }
}
