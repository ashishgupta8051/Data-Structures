package array;

import utils.Utils;

public class FindDuplicateElement {

    static void findDuplicateElement(int[] arr, int size) {
        int duplicateNum;

        for (int i = 0; i < size; i++){
            for (int j = i + 1; j < size; j++){
                if (arr[i] == arr[j]){
                    Utils.printMessageInNextLine("DuplicateNumber: "+arr[i]);
                }
            }
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 7, 3, 4,4, 5, 5, 6, 7 };
        int n = arr.length;
        findDuplicateElement(arr, n);
    }

}
