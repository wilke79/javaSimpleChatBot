import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read the first integer
        int a = scanner.nextInt();

        // read the second integer
        int b = scanner.nextInt();

        // Perform the comparison of a and b
        int compare = a - b;

        // compare if value of a is more than b
        if (compare > 0) System.out.println("Greater");

        // compare if value of a is less than b
        if (compare < 0) System.out.println("Less");

        // compare if value of a equals b
        if (compare == 0) System.out.println("Equal");
    }
}