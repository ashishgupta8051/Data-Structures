package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main{
    public static void main(String[] args) {
//        testing.thread.Testing testing = new testing.thread.Testing();
//        testing.thread.Testing2 testing2 = new testing.thread.Testing2();
//        testing.run();
//        testing2.run();

//        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
//
//        // Submit task 1 to the executor
//        executor.submit(() -> {
//            // testing.thread.Task 1 code here
//            System.out.println("testing.thread.Task 1 is running.");
//            for (int i = 0; i < 100; i++) {
//                System.out.println("Number from testing.thread.Task 1: "+i);
//            }
//        });
//
//        // Submit task 1 to the executor
//        executor.submit(() -> {
//            // testing.thread.Task 1 code here
////            try {
////                Thread.sleep(1000);
////            } catch (InterruptedException e) {
////                throw new RuntimeException(e);
////            }
//            System.out.println("testing.thread.Task 2 is running.");
//            for (int i = 0; i < 100; i++) {
//                System.out.println("Number from testing.thread.Task 2: "+i);
//            }
//        });
//
//
//        executor.shutdown();

//        int start = 100; // specify the start of the range
//        int end = 101;   // specify the end of the range
//
//        System.out.println("Palindrome numbers between " + start + " and " + end + ":");
//        for (int i = start; i <= end; i++) {
//            if (isPalindrome(i)) {
//                System.out.println(i);
//            }
//        }


        try {

            ArrayList<Integer> arrlist = new ArrayList<>();
            // Populating arrlist1
            arrlist.add(1);
            arrlist.add(2);
            arrlist.add(3);
            arrlist.add(4);
            arrlist.add(5);

            System.out.println("Original arrlist: " + arrlist);

            List<Integer> sublist = arrlist.subList(1, 5);
//            sublist.clear();

            System.out.println("Sublist of arrlist: " + sublist);
            System.out.println("Original arrlist: " + arrlist);

        }

        // Catch block for exception
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Exception thrown : " + e);
        }

        // Catch block for exception
        catch (IllegalArgumentException e)
        {
            System.out.println("Exception thrown : " + e);
        }

    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number; // Store the original number to compare later
        int reversedNumber = 0; // Initialize the reversed number to 0

        while (number != 0) { // Continue until all digits are processed
            int digit = number % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number = number/10; // Remove the last digit from the original number
        }
        System.out.println(reversedNumber+", "+number +", ");

        return originalNumber == reversedNumber; // Check if the original number is the same as the reversed number
    }
}



