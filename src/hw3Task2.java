import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class hw3Task2 {
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
            System.out.println("Arbitrary list of integers translation: \n " + ar);

            for (int i = ar.size() - 1; i >= 0; i--) {
                int even = ar.get(i) % 2;
                if (even == 0) {
                    System.out.println("An even number:" + ar.get(i));
                    ar.remove(i);
                }
            }
            Collections.sort(ar);
            System.out.println("List with deleted even numbers: \n " + ar);
        }
    }
}
