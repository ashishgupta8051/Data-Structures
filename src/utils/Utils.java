package utils;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static void displayArray(int[] array, String message){
        System.out.println(message);
        for (int i = 0; i < array.length; i++){
            if (array.length - 1 == i){
                System.out.print(array[i]);
            }else {
                System.out.print(array[i]+", ");
            }
        }
        System.out.println();
    }

    public static void displayArray(ArrayList arrayList, String message){
        System.out.println(message);
        for (int i = 0; i < arrayList.size(); i++){
            if (arrayList.size() - 1 == i){
                System.out.print(arrayList.get(i));
            }else {
                System.out.print(arrayList.get(i)+", ");
            }
        }
        System.out.println();
    }

    public static void printMessageInNextLine(String message){
        System.out.println(message);
    }

    public static void printMessage(String message){
        System.out.print(message);
    }
}
