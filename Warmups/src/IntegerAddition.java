/**
 * Write a program that adds numbers from 2 to 100 and sums them up.
 */

/**
 * 4 Essential control elements for loop
 * - control variable, e.g. num
 * - initialize control varaible
 * - increment
 * - Loop-stop condition
 *
 * Two loops:
 * 1. Signal Controlled loop (While)
 *      - need a signal (from user) to end loop
 *      - while (num != -1) ...
 * 2. Counter-controlled loop (for)
 *      - for (int count = 0; count < 100; count++
 *      - count from 0, use <
 *      - count from 1, use <=
 */

public class IntegerAddition
{
    public static void main(String[] args)
    {
        int num = 2;
        int sum = 0;

        /**
         * While loop
         */
        while (num <= 100) {
            sum += num;
            num += 2;

        }
        System.out.println("The result of while loop sum is: " + sum);


        /**
         * For loop
         */

        sum = 0;
        for(num = 2; num <= 100; num+= 2)
        {
            sum += num;
        }
        System.out.println("The result of for loop sum is: " + sum);

        for(double count = 0.1; count <= 1.0; count+= 0.1)
        {
            System.out.println(count);
        }
    }
}
