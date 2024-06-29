import java.util.Scanner;

public class NumberGuessingGame {
    public static void GuessingNumberGame(){
    Scanner sc = new Scanner(System.in);
    int number = 1 + (int)(100 * Math.random());
     int N = 5;
     int i, guess;

       System.out.println("Welcome to Number Guessing Game");
     System.out.println("Choose a number between 1 to 100");
     System.out.println("You have 5 Trials");
     for ( i = 0; i < N; i++) {
        System.out.println("Guess the Number");
        guess = sc.nextInt();
        
        if(number == guess){
            System.out.println("Congratulations you guessed the right number");
        }
        else if(number > guess){
            System.out.println("The number is " + " greater than " + guess);
        }
         else if(number < guess && i != N - 1){
            System.out.println("The number is " + "Less than " +  guess);

         }
         
     }
        if(i ==N){
            System.out.println("OOPS you Lost");
            System.out.println("The Number was " + number);
        }

    }
     public static void main(String[]args){
        GuessingNumberGame();
     }
 
}