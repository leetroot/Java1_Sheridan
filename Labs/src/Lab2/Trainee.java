/*
 * Name: Humza Jami
 * Class: PROG23199 1171_3093, Winter 2018
 * Assignment: Lab #2 Neo Vs. Morpheus
 * Date: February 15, 2018
 * Program: Trainee.java
 * Assignment GitHub URL: https://github.com/leetroot/Java1_Sheridan/blob/master/Labs/src/Lab2/NeoVsMorpheus.java
 */


package Lab2;

public class Trainee {
   private int id;
   private String name;
   private int power;   
   private static int numOfTrainee;
   
   public Trainee (int id, String name) {
      this.id = id;
      this.name = name;
      numOfTrainee++;
      
   }
 
   public static int getNumOfTrainee ()
   {
      return numOfTrainee;
      
   }
   
   public int getPower()
   {
      return power;
      
   }   
   
   public void addPower(int power)
   {
      this.power = this.power + power;

   }

}