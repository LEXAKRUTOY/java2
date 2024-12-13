
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What time is it?");
        int A = in.nextInt();
        String output = "Times of Day";
        if (A < 0 || A > 23) {
            output = "Incorrect time";
        } else if (A >= 6 && A <= 9) {
            output = "Morning";
        } else if (A >= 10 && A <= 18) {
            output = "Day";
        } else if (A >= 18 && A <= 21) {
            output = "Evening";
        } else {
            output = "Night";
        }
        System.out.println(output);
    }
}
