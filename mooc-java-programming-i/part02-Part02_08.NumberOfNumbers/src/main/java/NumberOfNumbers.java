import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Give a number:");
        int count = 0;
        
        while(true){
            
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if(userInput == 0 ) {
                 
                System.out.println("Number of numbers: " + count);
                break;
                
            } else {
                count += 1;
                System.out.println("Give a number:");
            }
           
        }
        
        
        
        

    }
}