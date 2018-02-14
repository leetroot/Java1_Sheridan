public class Trainee
{
    private int id;
    private String name;
    private boolean jumpTrain;
    private static int numOfTrainee;

    public Trainee(int id, String name)
    {
        this.id = id;
        this.name = name;
        this.numOfTrainee = numOfTrainee++;
    }

    public String getName()
    {
        return this.name = name;
    }

    static int getNumOfTrainee()
    {
        return numOfTrainee;
    }

    public void setJumpTrain(boolean jumpTrain)
    {
        this.jumpTrain = jumpTrain;
    }

    public String printInfo()
    {
        return("ID: " + id + "\n" + "Name: " + name + "\n" + "Jump Train: " + jumpTrain);
    }

}
