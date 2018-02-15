/*
 * Name: Humza Jami
 * Class: PROG23199 1171_3093, Winter 2018
 * Assignment: Lab #2 Neo Vs. Morpheus
 * Date: February 15, 2018
 * Program: NeoVsMorpheus.java
 * Assignment GitHub URL: https://github.com/leetroot/Java1_Sheridan/blob/master/Labs/src/Lab2/NeoVsMorpheus.java
 */

package Lab2;

//import SecureRandom and Scanner classes
import java.security.SecureRandom;
import java.util.Scanner;

public class NeoVsMorpheus {
   
   //Define constant GAMES
   public static final int GAMES = 5;
   
   //The main method
   public static void main (String[] args) {
      
      //Create Scanner and SecureRandom objects
      SecureRandom random = new SecureRandom();
      Scanner input = new Scanner(System.in);
      
      //Create two Trainee objects and initialize them with id and name
      Trainee neo = new Trainee(1, "Neo");
      Trainee morpheus = new Trainee(2, "Morpheus");

      //Display current number of trainees by calling getNumOfTrainee method
      System.out.println("Total number of trainees: " + Trainee.getNumOfTrainee());

      //Create three int variabls: win, lose, tie
      int win=0, lose=0, tie=0;
      
      //The for loop controlled by GAMES
      for (int i = 1; i <=GAMES; i++) {
         
         //Show the game round.
         System.out.println("==== Game "+i+" ====");
         
         //Generate random numbers, display and assign to Neo and Morpheus
         int neoPower, morpheusPower;
         int randomNumber = 1 + random.nextInt(100);
         int randomNumber2 = 1 + random.nextInt(100);
         neoPower = randomNumber;
         morpheusPower = randomNumber2;

         System.out.println("Neo's random number: " + neoPower);
         System.out.println("Morpheus's Random Number: " + morpheusPower);

         //Get current powers of Neo and Morpheus, compare to decide who wins
         neo.addPower(neoPower);
         morpheus.addPower(morpheusPower);

         System.out.println("Neo gets power: " + neo.getPower());
         System.out.println("Morpheus gets power: " + morpheus.getPower());

         if(neo.getPower() > morpheus.getPower())
         {

            System.out.println("Neo Wins!");
            win = win+ 1;
         }
         else if(neo.getPower() < morpheus.getPower())
         {
            System.out.println("Morpheus Loses");
            lose = lose + 1;
         }
         else
         {
            System.out.println("Neo and Morpheus Tied!");
            tie = tie + 1;
         }
         //Prompt user to press <Enter> to continue
         System.out.println("Press <Enter> to continue...");
         input.nextLine();
      }
      
      //Display game results
      System.out.println ("==== Results ====");
      System.out.println ("Neo Win      : "+win);
      System.out.println ("Morpheus Win : "+lose);
      System.out.println ("Tie          : "+tie);
      System.out.println ("Neo's Power      : "+neo.getPower());
      System.out.println ("Morpheus's Power : "+morpheus.getPower());
      System.out.println ("==== Good Job Guys ====");      
   }
}