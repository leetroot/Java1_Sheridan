public class Pill
{
    private String color;
    private double size;
    private String efficacy;
    private boolean status;

    public Pill(String color, double size)
    {
        color = "Blue";
        size = 2.0;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public double getSize()
    {
        return size;
    }

    public void setSize(double size)
    {
        this.size = size;
    }

    public String getEfficacy()
    {
        return efficacy;
    }

    public void setEfficacy()
    {
        this.efficacy = efficacy;
    }

    public boolean isTaken(boolean status)
    {
        return status;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

    public void printInfo()
    {

    }
}
