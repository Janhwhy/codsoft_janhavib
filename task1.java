
import java.util.Scanner;


public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int min = 1;
    int max = 100;

    /*  Generate a random double between 0 and 
    (max - min + 1 (done so that min and max are included)) and cast to int */
    int n = (int) (Math.random() * (max - min + 1)) + min;
    
    System.out.println("Enter a random number to compare with the system");
    do {
      int m = sc.nextInt();

      if (m == n) {
          System.out.println("You guessed the number!");
          break; // Exit the loop if guess is correct
      }
       else {
        System.out.println("Incorrect Number,Try again");
      }
    } while (true); // Loop continues till the user guesses correctly
  }

    
    }

