import java.util.*;


public class Morpheus
{
    public static void main(String[] args)
    {
        int option;
        Pill bluePill = new Pill("Blue");
        Pill redPill = new Pill("Red");

        bluePill.setSize(1.414);
        redPill.setSize(1.414);

        bluePill.setStatus(false);
        redPill.setStatus(false);


        double bluePillSize = bluePill.getSize();
        boolean bluePillStatus = bluePill.getStatus();

        double redPillSize = redPill.getSize();
        boolean redPillStatus = redPill.getStatus();

        String redPillEfficacy = redPill.setEfficacy("Tracing for unplugging this human");
        String bluePillEfficacy = bluePill.setEfficacy("Sending back to the matrix to sleep");

        System.out.println("Morpheus: Unfortunately, no one can be...told what the matrix is. You have");
        System.out.println("to see it for yourself. This is your last chance. After this, there is no ");
        System.out.println("turning back. I have two pills here: ");
        System.out.println("\t\t == Pill One ==");
        System.out.println("\t\t Color: \t\tRed");
        System.out.println("\t\t Size: \t\t\t" + redPillSize);
        System.out.println("\t\t Efficacy: \t\tTracing for unplugging this human");
        System.out.println("\t\t Status: \t\tAvailable");

        System.out.println("\t\t == Pill Two ==");
        System.out.println("\t\t Color: \t\tBlue");
        System.out.println("\t\t Size: \t\t\t" + bluePillSize);
        System.out.println("\t\t Efficacy: \t\tSending back to the Matrix to sleep");
        System.out.println("\t\t Status: \t\tAvailable");

        System.out.println("You take the blue pill (Press 1), the story ends, you wake up in your bed");
        System.out.println("and believe whatever you want to believe. You take the red pill (Press 2),");
        System.out.println("you stay in Wonderland, and I show you how deep the rabbit hole goes.");

        Scanner input = new Scanner(System.in);
        System.out.println("Morpheus: Now tell me Neo, (1) Blue or (2) Red?");
        option = input.nextInt();

    }
}
