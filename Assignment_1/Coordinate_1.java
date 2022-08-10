import java.applet.*;
import java.awt.*;

public class Coordinates_1 extends Applet
{
    int originX;
    int originY;

    public void init()
    {
        this.setSize(new Dimension(800,600));
        setBackground(Color.GRAY);
        originX=(getX()+getWidth())/2;
        originY=(getY()+getHeight())/2;


    }

    public void paint(Graphics g)
    {
        g.setColor(Color.green);
        g.drawLine(originX-1000,originY,originX+1000,originY);
        g.drawLine(originX,originY-1000,originX,originY+1000);
        g.setColor(Color.CYAN);
        g.drawRect(originX-20 ,originY-20, 40, 40);
    }
}
