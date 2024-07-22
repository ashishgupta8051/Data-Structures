package searching;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter a Number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++){
            System.out.print("Enter a "+i+" Number : ");
            int number2 = scanner.nextInt();
            list.add(number2);
        }

        System.out.print("Enter a Search Number : ");
        int searchNum = scanner.nextInt();

        doSearching(list, searchNum);

    }

    private static void doSearching(ArrayList<Integer> list, Integer searchNum) {
        boolean value = false;
        int index = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals(searchNum)){
                value = true;
                index = i;
                break;
            }
        }

        if (value){
            int position = index + 1;
            System.out.print("Search number found at position : "+position);
        }else {
            System.out.print("Search number not found !!!! ");
        }
    }
}

//Time Complexity BC: O(n), AC: O(n), WC: O(n)

