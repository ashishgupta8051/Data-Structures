package prabhatQAQuestions;
import java.util.Scanner;
public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int n = A.length;
        if (n == 0) return A; // Handle empty array
        K = K % n; // In case K is greater than n
        if (K == 0) return A; // No rotation needed

        int[] rotatedArray = new int[n];
        for (int i = 0; i < n; i++) {
            rotatedArray[(i + K) % n] = A[i];
        }
        return rotatedArray;
    }

    public static void main(String[] args) {
        CyclicRotation cyclicRotation = new CyclicRotation();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the number of rotations (K): ");
        int K = sc.nextInt();
        sc.close();

        int[] result = cyclicRotation.solution(A, K);
        System.out.println("Rotated array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
