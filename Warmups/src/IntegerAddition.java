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
    }
}
