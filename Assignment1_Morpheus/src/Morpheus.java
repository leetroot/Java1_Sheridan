/*
 * Name: Humza Jami
 * Class: PROG23199 1171_3093, Winter 2018
 * Assignment: Assignment #1 Meeting Morpheus
 * Date: February 8, 2018
 * Program: Morpheus.java
 * Github: https://github.com/leetroot/Java1_Sheridan/tree/master/Assignment1_Morpheus/src/Morpheus.java
 */
import java.util.*;

public class Morpheus
{
    public static void main(String[] args)
    {
        String[] outputResponses = {"Neo, think harder", "Think carefully about your decision. Try again.", "Don't disappoint me, I know you want to go in", "I know this isn't easy but make the right choice."}; //Create a new array of computer responses.


        int option; //Create a new number to read user input from
        int yesOrNoReply; //Create a new number to read user input from
        Pill bluePill = new Pill("Blue"); //Creating a new pill with color blue
        Pill redPill = new Pill("Red"); //Creating a new pill with color red

        bluePill.setSize(1.414); //Setting the size of blue pill
        redPill.setSize(1.414); //Setting the size of red pill

        bluePill.setStatus(false); //Sets the blue pill status to false
        redPill.setStatus(false); //Sets the red pill status to false.


        double bluePillSize = bluePill.getSize(); //Gets the size of blue pill
        boolean bluePillStatus = bluePill.getStatus(); //Gets the status of blue pill

        double redPillSize = redPill.getSize(); //Gets the size of red pill
        boolean redPillStatus = redPill.getStatus(); //Gets the status of red pill

        String redPillEfficacy = redPill.setEfficacy("Tracing for unplugging this human"); //Set efficacy message for red pill
        String bluePillEfficacy = bluePill.setEfficacy("Sending back to the matrix to sleep"); //Setting efficacy message for blue pill

        System.out.println("Morpheus: Unfortunately, no one can be...told what the matrix is. You have"); //Prints out a message
        System.out.println("to see it for yourself. This is your last chance. After this, there is no "); //Prints out a message
        System.out.println("turning back. I have two pills here: "); //Prints out a message
        System.out.println("\t\t == Pill One =="); //Prints out a message
        System.out.println("\t\t Color: \t\tRed"); //Prints out a message
        System.out.println("\t\t Size: \t\t\t" + redPillSize); //Prints out the size of red pill
        System.out.println("\t\t Efficacy: \t\t" + redPillEfficacy); //Prints out the efficacy of red pill
        System.out.println("\t\t Status: \t\t " + redPillStatus); //Prints out the status of red pill
        System.out.println(); //Prints out a new line
        System.out.println("\t\t == Pill Two =="); //Prints out a message
        System.out.println("\t\t Color: \t\tBlue"); //Prints out a message
        System.out.println("\t\t Size: \t\t\t" + bluePillSize); //Prints out the size of blue pill
        System.out.println("\t\t Efficacy: \t\t" + bluePillEfficacy); //Prints out the efficacy of blue pill
        System.out.println("\t\t Status: \t\t" + bluePillStatus); //Prints out the status of blue pill

        System.out.println("You take the blue pill (Press 1), the story ends, you wake up in your bed"); //Prints out a message
        System.out.println("and believe whatever you want to believe. You take the red pill (Press 2),"); //Prints out a message;
        System.out.println("you stay in Wonderland, and I show you how deep the rabbit hole goes."); //Prints out a message

        Scanner input = new Scanner(System.in); //Creates a new user input scanner
        Scanner yesOrNo = new Scanner(System.in); //Creates a new user input scanner
        System.out.println("Morpheus: Now tell me Neo, (1) Blue or (2) Red?"); //Asks user to choose a option
        option = input.nextInt(); //Reads user input

        /**
         * While option isn't set to 0, the program checks for user input, the program will generate a random response
         * if user presses 1. If user enters 2, the system will ask the user to make a decision, if user presses 1,
         * the user will be displayed a Morpheus message and then the system will close the input and exit the program.
         * If user selects 2, Morpheus will say two things and then require the user to make a choice again.
         */
        while(option != 0)
        {
            switch (option)
            {
                case 1:
                    int computerResponse = new Random().nextInt(outputResponses.length);
                    System.out.println("Morpheus: " + outputResponses[computerResponse]);
                    System.out.println("Morpheus: Now tell me Neo, blue (1) or red (2)");
                    option = input.nextInt();
                    break;


                case 2:
                    System.out.println("Morpheus: Are you sure, (1) Yes or (2) No? Remember, all I'm offering is the truth. Nothing more. ");
                    yesOrNoReply = yesOrNo.nextInt();
                    if(yesOrNoReply == 1)
                    {
                        System.out.println("Morpheus: Follow Me.");
                        System.out.close();
                        System.exit(0);
                    }

                    else if(yesOrNoReply == 2)
                    {
                        System.out.println("Morpheus: Ok, think about it then decide. ");
                        System.out.println("Morpheus: Now tell me Neo, blue (1) or red (2)");
                        option = input.nextInt();
                    }
            }
        }
    }
}
