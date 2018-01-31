public class Pill
{
    private String color;
    private double size;
    private String efficacy;
    private boolean status;

    public Pill(String color)
    {
        color = "Blue";
        size = 2.0;
    }

    public String setColor(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    public double setSize(double size)
    {
        this.size = size;
    }

    public double getSize()
    {
        return size;
    }

    public String setEfficacy(String efficacy)
    {
        this.efficacy = efficacy;
    }

    public String getEfficacy()
    {
        return efficacy;
    }

    public boolean isTaken(boolean status)
    {
        return status;
    }

    public boolean setStatus(boolean status)
    {
        this.status = status;
    }

    public void printInfo()
    {
        if(size < 2.0)
        {
            System.out.println("Small");
        }
        else
        {
            System.out.println("Large");
        }
        if(status == true)
        {
            System.out.println("Taken");
        }
        else

        {
            System.out.println("Available");
        }

    }
}
