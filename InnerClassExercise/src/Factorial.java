import java.util.Iterator;
import java.util.ArrayList;

/**
 * Define a class named Factorial that has the following methods:
 a. Constructor - Factorial(lowerLimit, upperLimit)
 b. Implement an iterator which will return the factorials of numbers starting at lowerLimit
 and ending at upperLimit. Make sure the class implements the Iterable interface.
 c. Define a main method that uses the iterator you defined above.
 */

public class Factorial implements Iterable<Integer>
{
    private ArrayList<Integer> factorials;
    public Factorial(int lowerLimit, int upperLimit)
    {
        factorials = new ArrayList<Integer>();
        for (; lowerLimit <= upperLimit; lowerLimit++)
        {
            int fact = 1;
            for (int i = lowerLimit; i > 0; i--)
            {
                fact *= i;
            }
            factorials.add(fact);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return factorials.iterator();
    }

    public static void main(String[] args)
    {
        Factorial fact = new Factorial(1,5);
        for (int f : fact)
        {
            System.out.println("Factorial: " + f);
        }
    }
}

