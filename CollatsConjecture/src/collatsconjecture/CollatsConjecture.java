package collatsconjecture;
import java.util.Scanner;
/**
 * CollatsConjecture
 * @author Jake Sage
 */
public class CollatsConjecture 
{
    public static void main(String[] cheese) 
    {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        coll(n);
    }
    
    /**
     * shows the calculation of the Collatz conjecture for any input n
     * @param n
     * @param count
     */
    public static void coll(long n)
    {
        //Half Or Triple Plus One
        if(n%2 == 0)
        {
            n = n / 2;
        }
        else
        {
            n = 3 * n + 1;
        }
        
        //output
        System.out.println(n);
        
        /**
         * The collatz Conjecture is "This process will eventually reach the number 1, regardless of which positive integer is chosen initially."                        . 
         * Thus, if n ever == 1, the conjecture has been satisfied for this n
         * 
         * As a side note, if we were to comment out this statement, we would get stuck in an infinite loop (1 is odd, so coll(1) = 4)
         */
        if(n == 1)
            return;
        //If we don't hit 1, we recursively call coll(n) and repeat the process
        coll(n);
    }
}
