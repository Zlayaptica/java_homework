import java.util.Scanner;

public class hw1 {
    public static void main(String[] args){
        System.out.printf("Enter a number n: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int sum = 0;
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            mult *= i;
        }
        System.out.printf("The sum of the numbers from 1 to %d: %d%n", n, sum);
        System.out.printf("The product of numbers from 1 to %d: %d%n", n, mult);
        num.close();
    }
}