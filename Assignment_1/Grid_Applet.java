import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class my_grid extends Applet
implements MouseWheelListener
{
  // main class
  int originX = 0;
  int originY = 0;
  int delta   = 10;
  int width   = 0;
  int height  = 0;
  public void init()
  {
    originX = (getX()+getWidth())/2;
    originY = (getY()+getHeight())/2;

    height = getHeight();
    width  = getWidth();

    this.setSize(new Dimension(800,600));
    setBackground(Color.WHITE);
    addMouseWheelListener(this);
  }

  public void makeGrid(Graphics G)
  {
    for(int i=originX;i<originX*2+width;i+=delta)
    {
        G.setColor(Color.DARK_GRAY);
        G.drawLine(i,originY*2-height,i,originY*2+height);
    }
    for(int i=originX;i>originX*2-width;i-=delta)
    {
        G.setColor(Color.DARK_GRAY);
        G.drawLine(i,originY*2-height,i,originY*2+height);
    }
    for(int i=originY;i<originY*2+height;i+=delta)
    {
        G.setColor(Color.DARK_GRAY);
        G.drawLine(originX*2 - width,i,originX*2+width,i);
    }
    for(int i=originY;i>originY*2-height;i-=delta)
    {
        G.setColor(Color.DARK_GRAY);
        G.drawLine(originX*2 - width,i,originX*2+width,i);
    }
    Color c = new Color(0,153,0);
    G.setColor(c);
    G.drawRect(originX-1,1,2,height);
    G.drawRect(1,originY-1,width,2);
    G.drawLine(originX,originY*2-getHeight(),originX,originY*2+getHeight());
    G.drawLine(originX*2-getWidth(),originY,originX*2+getWidth(),originY);
  }

  public void paint(Graphics G)
  {
    makeGrid(G);
  }

  public void mouseWheelMoved(MouseWheelEvent e) {
    int notches = e.getWheelRotation();
    if (notches < 0) {
      delta = delta + 10;
      delta = delta > 150 ? 150 : delta;
    } else {
      delta = delta - 10;
      delta = delta < 10 ? 10 : delta;
    }
    repaint();
  }
}
