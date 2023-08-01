package shorting;

import java.util.Scanner;


public class BucketShort {
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


        System.out.println("*Sorted List*");
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }

    }



}
