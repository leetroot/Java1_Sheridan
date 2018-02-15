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