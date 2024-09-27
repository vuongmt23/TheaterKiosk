import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");

        if (in.hasNextInt()) {
            int age = in.nextInt();
            if (age >= 21) {
                System.out.println("You get a wrist band.");
            } else {
                System.out.println("Sorry, you must be at least 21 to get a wrist band.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid age.");
        }
        in.close();
    }
}
