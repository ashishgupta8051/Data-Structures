package array;

import utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class UnionCountWithoutSet {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2};
        mergeArray(a,b);
    }

    private static void mergeArray(int[] a, int[] b) {
        /// Merge both array
        int[] mergeArray = new int[a.length + b.length];
        System.arraycopy(a, 0, mergeArray, 0, a.length);
        System.arraycopy(b, 0, mergeArray, a.length, b.length);
        Utils.displayArray(mergeArray, "Merge List");

        /// Sort Array
        for (int i = 0; i < mergeArray.length - 1; i++) {
            for (int j = 0; j < mergeArray.length - i - 1; j++) {
                if (mergeArray[j] > mergeArray[j + 1]) {
                    int temp = mergeArray[j];
                    mergeArray[j] = mergeArray[j + 1];
                    mergeArray[j + 1] = temp;
                }
            }
        }

        /// Remove duplicate array
        List<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < mergeArray.length - 1; i++) {
            if (mergeArray[i] != mergeArray[i + 1]){
                uniqueList.add(mergeArray[i]);
            }
        }
        uniqueList.add(mergeArray[mergeArray.length - 1]);

        Utils.displayArray((ArrayList) uniqueList, "Unique List");
        Utils.printMessageInNextLine("Unique Count Set: "+uniqueList.size());
    }
}
