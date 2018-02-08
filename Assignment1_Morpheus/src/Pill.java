/*
 * Name: Humza Jami
 * Class: PROG23199 1171_3093, Winter 2018
 * Assignment: Assignment #1 Meeting Morpheus
 * Date: February 8, 2018
 * Program: Pill.java
 * Github: https://github.com/leetroot/Java1_Sheridan/tree/master/Assignment1_Morpheus/src/Pill.java
 */

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

    /**
     * Gets color by grabbing the pre set color from the constructor.
     * @return Calling the constructor to get color of the pill
     */
    public String getColor()
    {
        return this.color;
    }

    /**
     * Setting the color of the pill by overriding the constructors
     * @param newColor replacing the constructor's color with the color called in through the setter
     */
    public void setColor(String newColor)
    {
        this.color = newColor;
    }

    /**
     * Gets size by checking the constructor
     * @return Callign constructor to get size of pill
     */
    public double getSize()
    {
        return this.size;
    }

    /**
     * Sets the size of the pill by overriding Pill constructor
     * @param newSize replacing the size from constructor with newSize
     */
    public void setSize(double newSize)
    {
        this.size = newSize;
    }

    /**
     *
     * @param efficacy sets efficacy by calling in the setter method
     * @return the value of efficacy since a void method is called.
     */
    public String setEfficacy(String efficacy)
    {
        this.efficacy = efficacy;
        return efficacy;
    }

    /**
     * Gets efficacy from the private String
     * @return Grab efficacy from Pill.
     */
    public String getEfficacy()
    {
        return this.efficacy;
    }

    /**
     * Checks if the pill is available or not.
     * @param status sets the default value
     * @return the status of the pill
     */
    public boolean isTaken(boolean status)
    {
        return this.status;
    }

    /**
     * Sets the status of pill by defining a boolean value
     * @param status sets method status in place of Pill constructor status.
     */
    public void setStatus(boolean status)
    {
        this.status = status;
    }

    /**
     * Gets pill status
     * @return Grab status from method setStatus
     */
    public boolean getStatus()
    {
        return this.status;
    }

    /**
     * Print info of pill based on size, status and efficacy
     */
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
