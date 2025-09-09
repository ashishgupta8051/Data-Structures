package prabhatQAQuestions;
import java.util.Scanner;
public class SolutionFrogJmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start position (X): ");
        int X = sc.nextInt();
        System.out.print("Enter target position (Y): ");
        int Y = sc.nextInt();
        System.out.print("Enter jump distance (D): ");
        int D = sc.nextInt();
        SolutionFrogJmp solutionFrogJmp = new SolutionFrogJmp();
        int result = solutionFrogJmp.solution(X, Y, D);
        System.out.println("Minimum number of jumps: " + result);
        sc.close();
    }

    public int solution(int X, int Y, int D) {
        if (X >= Y) return 0;
        int distance = Y - X;
        return (distance + D - 1) / D; // Ceiling division
    }
}
