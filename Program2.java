
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a positive three-digit number");
        int number = in.nextInt();

        if (number > 0 && number >= 100 && number <= 999) {
            int A = number % 10;
            int B = number / 100;
            if (A == B) {
                System.out.println("The number is symmetrical: " + number);
            } else {
                System.out.println("The number is asymmetrical: " + number);
            }
        } else {
            System.out.println("Incorrect number");
        }
    }
}
