import P1.P2.third;
import P1.second;
import java.applet.*;
import java.awt.*;

public class first extends Applet
{
    Font F1 = new Font("Courier",Font.BOLD,20);
    public void init()
    {
        setBackground(Color.DARK_GRAY);
    }

    public void paint(Graphics G)
    {
        second s = new second();
        s.draw_second(G);
        G.setColor(Color.DARK_GRAY);
        G.setFont(F1);
        G.drawString("Hello I hope this is visible.",130,150);
        third t = new third();
        t.draw_third(G);
    }
}
