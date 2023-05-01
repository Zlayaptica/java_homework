import java.util.LinkedList;
import java.util.Scanner;

public class hw4Task1 {
    private static String input;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        while (true) {
            System.out.println("Enter the line (print/revert/exit to execute commands):");
            String input = scanner.nextLine();

            if (input.equals("print")) {
                System.out.println("\n" +
                        "Rows in reverse order:");
                while (!list.isEmpty()) {
                    System.out.println(list.removeLast());
                }
            } else if (input.equals("revert")) {
                if (!list.isEmpty()) {
                    list.removeLast();
                    System.out.println("The last line entered has been deleted from memory.");
                } else {
                    System.out.println("There are no saved rows to delete.");
                }
            } else {
                list.addLast(input);
            }
        }
        if (input.equals("exit")) {
            return;
            System.out.println("Exiting the program");
        }
    }

}