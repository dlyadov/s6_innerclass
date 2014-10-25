import java.util.Random;

/**
 * Created by TOSHIBA on 25.10.14.
 */

public class NewLabel extends Component
{
    private int width;
    private int height;
    private static String color;
    private String name;
    private String text;

    static class LabelColor // nested class
    {
        String[] colors = {"Red", "Blue", "Green"};
        static Random rand;

        void setLabelColor()
        {
            color = colors[rand.nextInt()*3];
        }
    }
    public NewLabel(int width, int height, String name) throws IllegalArgumentException {
        super(width, height);
        this.width = width;
        this.height = height;
        this.name = name;
    }

    static String getColor()
    {
        return color;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void setWidth(int width) {
        ForLog log = new ForLog("Label width changed!")  // anonimys inner class
        {
            public void printLog()
            {
                System.out.println(msgLog + " Label name: " + name);
            }
        };
        log.printLog();
        this.width = width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeigth(int heigth) {
        ForLog log = new ForLog("Label height changed!");
        log.printLog();
        this.height = heigth;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        ForLog log = new ForLog("Label text changed!");
        log.printLog();
        this.text = text;
    }

    class ForLog // inner class
    {
        String msgLog;
        public ForLog(String msg)
        {
            msgLog = msg;
        }

        void printLog()
        {
            class Log // local inner class
            {
                String textLog;

                void prntIT()
                {
                    System.out.println(textLog);
                }
            }
            if (msgLog != null)
            {
                Log printed = new Log();
                printed.textLog = msgLog;
                printed.prntIT();
            }
        }
    }
}
