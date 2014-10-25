/**
 * Created by TOSHIBA on 25.10.14.
 */
interface ITextable
{
    public String getText();
    public void setText(String text);
}

interface ISizeble
{
    public int getWidth();
    public void setWidth(int width);
    public int getHeight();
    public void setHeigth(int heigth);
}
public abstract class Component implements ITextable, ISizeble{
    public int width;
    public int height;
    public String text;
    public Component(int width, int height) throws IllegalArgumentException
    {
        if (width <= 0 || height <= 0)
        {
            throw new IllegalArgumentException("Wrong arguments!");
        }
    }
}
