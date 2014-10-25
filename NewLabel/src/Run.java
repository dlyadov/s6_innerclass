/**
 * Created by TOSHIBA on 25.10.14.
 */
public class Run {
    public static void main(String[] args)
    {
        NewLabel lab = new NewLabel(10, 10, "Hello");
        System.out.println("label height: " + lab.getHeight());
        lab.setWidth(15);
        System.out.println("label height: " + lab.getWidth());
    }
}
