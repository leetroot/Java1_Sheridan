public class JumpingTraining
{
    public static final int SIZE = 3;
    public static boolean passOrFail = true;
    public static String response = "";

    public static boolean run()
    {
//        return passOrFail ? "Pass" : "Fail";
        if(passOrFail == true)
            System.out.println("Pass");
        else if(passOrFail == false)
            System.out.println("Fail");
        return false;
    }
}
