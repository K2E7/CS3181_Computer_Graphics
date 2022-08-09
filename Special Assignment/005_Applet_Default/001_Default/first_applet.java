import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class first_applet extends Applet
{   
    public void init()
    {
        setBackground(Color.LIGHT_GRAY);
    }
    public void paint(Graphics g)
    {
        g.drawString("Welcome to the Applet",800,600);
    }
}