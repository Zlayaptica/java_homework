import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class hw3Task3 {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter the length of the list N: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int N = iScanner.nextInt();
            ArrayList<Integer> ar = new ArrayList<Integer>();
            Random ran = new Random();
            for (int i = 0; i < N; i++) {
                int x = ran.nextInt(N);
                ar.add(x);
            }
            System.out.println("An arbitrary list of integers: \n " + ar);

            int min = ar.get(0);
            int max = ar.get(0);
            float sum = 0;
            for (int i = 0; i < ar.size(); i++) {
                int num = ar.get(i);
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
                sum += num;
            }
            float average = sum / ar.size();

            System.out.println("Minimum value: " + min);

            System.out.println("Maximum value: " + max);

            System.out.println("Arithmetic mean: " + average);
        }
    }
}
