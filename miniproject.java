// GuessingNumber just funny game, you have to guess number until you grt correct match!! 

import java.util.*;

public class miniproject {

    static Scanner number = new Scanner(System.in); // getting input from user
    
        public static void main(String[] args) {
    
            int myNumber = (int)(Math.random()*100);
            int userNumber = 0;
    
            do {
                // taking input from user
                System.out.println("Guess your number (1 to 100): ");
                userNumber = number.nextInt();

            if (myNumber == userNumber) {
                System.out.println("Yeap!! Your guess was correct.");   
                break; 
            }
            else if (myNumber > userNumber) {
                System.out.println("Your number is too small");
            }
            else {
                System.out.println("Your number is too big.");
            }
        } while(userNumber >= 0);

    System.out.println("Correct Number is: ");
    System.out.println(myNumber);
        
    }
    
}
    
