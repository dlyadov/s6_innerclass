/**
 * Define a Concrete class named Popsi (yes, o not e ) which extends the Drink class above. A
 Popsi has as ingredients sugar and caffeine. The class constructor will initialize the Drink with a
 serial number equal to 10 and “Great carbonated soda” as a description.

 Define an finalize() method for the Popsi class. In order to test the finalize() method use the
 System.gc() method which suggests that the Java Virtual Machine expend effort toward
 recycling unused objects in order to make the memory they currently occupy available for quick
 reuse. Hint: set references to null.
 */

public class Popsi extends Drink
{
    String sugar = "sugar", caffeine = "caffeine";
    public Popsi()
    {
        super(10, "Great carbonated soda");
    }

    @Override
    public String getIngredients() {
        return "Ingredients: " + sugar + caffeine;
    }

    @Override
    public void finalize()
    {
        System.out.println("finalize() method of Popsi class activated!");
    }
}
