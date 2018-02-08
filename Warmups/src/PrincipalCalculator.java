import java.lang.*;
import java.util.*;

/**
 * Write program to calculate the amount at the end of year for 10 years
 * If you have a princiapl amount P and an interest rate R
 * P + P * R + (P + P*R)*R ...
 * Amount = P(1+R)^n, n is the years
 */


public class PrincipalCalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please give me the principal, rate and the year");
        double principal = input.nextDouble();
        double rate = input.nextDouble();
        int year = input.nextInt();
        for(int i = 0; i < year; i++)
        {
            //Math.pow (a, b) = a^b, a,b are both double
            double amount = principal * Math.pow(1+rate, i);
            System.out.println("Year " + i + "  Amount: " + (int)(amount*100)/100.0);
        }

        int a = 1;
        double b = 2.0;
        byte c = 3;
        long d = 6;
        float e = 0.4f;

        System.out.println(a+b+c+d+e);

        float f = -34;
        short s = 10;
        float f2 = 34.0;
    }


}
