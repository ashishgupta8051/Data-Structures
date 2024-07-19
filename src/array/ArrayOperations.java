package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int array_size = scanner.nextInt();
        int[] ary = new int[array_size];
        System.out.print("How many number do you want to add in array : ");
        int array_input_size = scanner.nextInt();

        if (array_size < array_input_size) {
            System.out.println("Array size is less then your input size......");
        } else {
            for (int i = 0; i < array_input_size; i++) {
                System.out.print("Enter the number " + i + " : ");
                int number = scanner.nextInt();
                ary[i] = number;
            }
            displayArray(ary);

            System.out.print("Enter the number which you want to insert in array : ");
            int add_number = scanner.nextInt();
            System.out.print("Enter the index number which you want to add in array : ");
            int index_number = scanner.nextInt();
            if (index_number > array_input_size) {
                System.out.println("Enter a correct index number max array input Size is : " + array_input_size);
            } else if (array_input_size == array_size) {
                System.out.println("Your array size : " + array_size);
                System.out.println("Your array input size : " + array_input_size);
                System.out.println("You don't have enough space for insert element .......");
            } else {
                insertElement(ary, add_number, index_number);
                System.out.print("Enter the index number which you want to delete in array : ");
                int delete_index_number = scanner.nextInt();
                if (delete_index_number > array_input_size) {
                    System.out.print("Please enter correct index number array input size is : " + array_input_size);
                } else {
                    ary = deleteArray(ary, delete_index_number, array_input_size);
                }

                System.out.print("Do you want to reverse the array (Yes: 1, No: 2) : ");
                int reverse = scanner.nextInt();
                if (reverse == 1) {
                    ary = reverseArray(ary);
                }

                System.out.print("Enter the number which you want to search in array : ");
                int search_index_number = scanner.nextInt();
                searchArray(ary, search_index_number, array_input_size);
            }
        }
    }

    private static int[] reverseArray(int[] ary) {
        int length = ary.length;
        int[] reverseAry = new int[ary.length];

        for (int i : ary) {
            reverseAry[length - 1] = i;
            length = length - 1;
        }

        displayArray(reverseAry);
        return reverseAry;
    }

    //Traversing
    private static void displayArray(int[] ary) {
        for (int j : ary) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    //Insertion
    static void insertElement(int[] ary, int insert_element, int array_index) {
        ary[array_index] = insert_element;
        displayArray(ary);
    }

    //Deletion
    private static int[] deleteArray(int[] ary, int delete_index_number, int array_input_size) {
        ArrayList<Integer> deleteList = new ArrayList<>();
        for (int i = 0; i < ary.length; i++) {
            if (i != delete_index_number) {
                deleteList.add(ary[i]);
            }
        }
        ary = convertArrayListToIntArray(deleteList);
        displayArray(ary);
        return ary;
    }

    //Searching
    private static void searchArray(int[] ary, int search_index_number, int array_input_size) {
        int flag = 0;
        for (int i = 1; i <= array_input_size; i++) {
            if (search_index_number == ary[i]) {
                flag = i + 1;
                break;
            }
        }
        if (flag != 0) {
            System.out.print("Value found at location at : " + flag);
        } else {
            System.out.print("Value not found");
        }

    }

    public static int[] convertArrayListToIntArray(ArrayList<Integer> list) {
        // Initialize the int array with the same size as the ArrayList
        int[] array = new int[list.size()];

        // Iterate over the ArrayList and copy elements to the int array
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }
}
