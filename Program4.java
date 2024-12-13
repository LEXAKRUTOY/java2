
import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("input number: ");
        int number = in.nextInt();
        
        if (number % 2 == 0) {
            
            System.out.println("Input fraction number: ");
            float fraction = in.nextFloat();
            float result = number * fraction;
            
            System.out.printf("Result: %.2f%n", result);
        
        } 
        
        else {
            System.out.println("Input another number: ");
            int another_number = in.nextInt();
            
            int result = number * another_number;
            System.out.printf("Result: %d", result);
        }
    }
}
