/*
 * Name: Humza Jami
 * Class: PROG23199 1171_3093, Winter 2018
 * Assignment: Lab #5
 * Date: April 5, 2018
 * Program: Lab5_jami.java
 * Assignment GitHub URL: https://github.com/leetroot/Java1_Sheridan/tree/master/Labs/Lab5/src/Morpheus.java
 */

package Lab5;

//the tester class
public class Lab5_jami {
   public static void main(String[] args) {
      //create Human objects with name, iq, eq, life
      Human neo = new Human("Neo", 150, 120, 99);
      Human morpheus = new Human("Morpheus", 130, 40, 88);
      
      //create Machine objects with name, iq, eq, energy
      Machine oracle = new Machine("The Oracle", 150, 130, 67);
      Machine smith = new Machine("Agent Smith", 120, 50, 67);
      
      //try printing object via overriden toString methods
      System.out.println(neo); 
      System.out.println(morpheus); 
      System.out.println(oracle); 
      System.out.println(smith); 
   } //end of main
} //end of class

//class Intelligence is the superclass
class Intelligence {
   private String name;
   private int iq, eq;

   public Intelligence(String name, int iq, int eq)
   {
        this.name = name;
        this.iq = iq;
        this.eq = eq;
   }

   public String getName()
   {
       return name;
   }

   public int getIq()
   {
       return iq;
   }

   public int getEq()
   {
        return eq;
   }
   //TODO: Constructor
   

   //TODO: overriden toString(), add @Override annotation
    @Override
    public String toString()
    {
        return String.format("Name: %s%n IQ: %d%n EQ: %d%n", getName(), getIq(), getEq());
    }
  
}

//class Human is a subclasss
class Human extends Intelligence
{
   //TODO: Data fields
    private int life;

    //TODO: Constructor
    public Human(String name, int iq, int eq, int life)
    {
        super(name, iq, eq);
        this.life = life;

    }

   //TODO: accessor and mutator
    public int getLife()
    {
        return life;
    }

    public void setLife(int life)
    {
        this.life = life;
    }

   //TODO: overriden toString(), add @Override annotation
    @Override
    public String toString()
    {
        return  super.toString() + String.format("Life: %d%n", getLife());
    }
  
}

//class Machine is a subclass
class Machine extends Intelligence {   
   //TODO: Data fields
    private int energy;

    //TODO: Constructor
    public Machine(String name, int iq, int eq, int energy)
    {
        super(name, iq, eq);
        this.energy = energy;
    }

   //TODO: accessor and mutator
    public int getEnergy()
    {
        return energy;
    }

    public void setCharge(int energy)
    {
        this.energy = energy;
    }
   
   //TODO: overriden toString(), add @Override annotation
    @Override
    public String toString()
    {
        return  super.toString() + String.format("Energy: %d%n", getEnergy());
    }
  
}