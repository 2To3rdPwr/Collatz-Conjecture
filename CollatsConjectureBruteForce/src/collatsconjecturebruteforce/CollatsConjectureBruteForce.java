package collatsconjecturebruteforce;
import java.lang.Integer;
/**
 * Brute Force proof of the Collatz Conjecture for all int values (NOT all integers!)
 * non-recursive for efficiency
 * @author Jake
 */

public class CollatsConjectureBruteForce 
{
    public static void main(String[] cheese) 
    {
        int m = Integer.MAX_VALUE;
        long n;
        System.out.println("Brute Force Proof of the Collatz conjecture for the first " + m + " integers");
        for(int i = 1; i < m; i++)
        {
            n = i;
            /**
             * Half Or Triple Plus One.
             */
            while(n != 1)
            {
                if(n % 2 == 0)
                {
                    n = n / 2;
                }
                else
                {
                    n = 3 * n + 1;
                }
            }
            /**
             * if the program has gotten to this point, then n = 1, thus passing the Collatz conjecture for this i.
             */
            System.out.println(i + " passed the Collatz conjecture.");
        }
    }
    
}
