package prabhatQAQuestions;
import org.jetbrains.annotations.NotNull;
import java.util.Scanner;
public class OddOccurrencesInArray {
    public int solution(@NotNull int[] A) {
        int result = 0;
        for (int number : A) {
            result ^= number; // XOR operation
        }
        return result;
    }

    public static void main(String[] args) {
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();
        int result = oddOccurrencesInArray.solution(A);
        System.out.println("The element that occurs an odd number of times is: " + result   );
    }

}
