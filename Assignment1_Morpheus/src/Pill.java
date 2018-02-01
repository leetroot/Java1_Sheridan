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

    public String getColor()
    {
        return this.color;
    }

    public void setColor(String newColor)
    {
        this.color = newColor;
    }

    public double getSize()
    {
        return this.size;
    }

    public void setSize(double newSize)
    {
        this.size = newSize;
    }

    public String setEfficacy(String efficacy)
    {
        this.efficacy = efficacy;
        return efficacy;
    }

    public String getEfficacy()
    {
        return this.efficacy;
    }

    public boolean isTaken(boolean status)
    {
        return this.status;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

    public boolean getStatus()
    {
        return this.status;
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
