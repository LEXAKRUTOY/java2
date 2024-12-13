
import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a positive x = number");
        int x = in.nextInt();

        if (x > 0) {
            for (int i = -x + 1; i < x; i++) {
                System.err.print(i + " ");
            }
        } else {
            System.out.println("Incorrect number");
        }
    }
}
