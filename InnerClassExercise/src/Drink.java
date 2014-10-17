import java.util.Objects;

/**
 * Define an Abstract class named Drink which defines the following methods:
 a. Constructor with two parameters: serialNo (drink’s serial number) and description (brief
 description about the drink). A drink has a sugarContent which is by default is 0.
 b. toString method that prints the serial number followed by the description and the sugar
 content of the drink.
 c. An increaseSugarContent method that allow us to increase the sugar content by a
 particular integer amount. For example, if p is a concrete class that extends Drink, then
 we should be able to call increaseSugarContent as follows:
 p.increaseSugarContent(10).increaseSugarContent(20);
 d. An abstract method named getIngredients which returns a string with the drink’s
 ingredients.
 */

public abstract class Drink {
    private int serialNo;
    private String description;
    private int sugarContent = 0;

    public Drink(int serialNo, String description)
    {

        this.serialNo = serialNo;
        this.description = description;
    }

    public Drink increaseSugarContent(int amount)
    {
        sugarContent += amount;
        return this;
    }

    public abstract String getIngredients();

    @Override
    public String toString()
    {
        return ("serial№: " + serialNo) +
        ("description: " + description) +
        ("sugarContent: " + sugarContent);
    }
}
