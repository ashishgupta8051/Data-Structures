package prabhatQAQuestions;
import java.util.Scanner;
public class BinaryGap {
    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);
        int maxGap = 0;
        int currentGap = 0;
        boolean counting = false;

        for (char bit : binaryString.toCharArray()) {
            if (bit == '1') {
                if (counting) {
                    maxGap = Math.max(maxGap, currentGap);
                }
                counting = true;
                currentGap = 0;
            } else if (counting) {
                currentGap++;
            }
        }

        return maxGap;
    }

    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int N = sc.nextInt();
        sc.close();
        int result = binaryGap.solution(N);
        System.out.println("The length of the longest binary gap is: " + result);
    }
}
