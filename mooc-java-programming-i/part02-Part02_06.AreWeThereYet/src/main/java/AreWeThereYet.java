import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number;
        
        while (true) {
            System.out.print("Give a number: ");
            number = scanner.nextInt();
            
            if (number == 4) {
                System.out.println("You entered 4. Exiting...");
                break;
            }
        }
        
    }
}