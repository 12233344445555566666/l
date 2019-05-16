package abc;
import java.awt.event.*;
import java.awt.*;
import java.applet.*;
public class poly extends Applet implements MouseListener{

	int[] x=new int[100];
	int[] y=new int[100];
	int cnt=0;
	public void init()
	{
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent e)
	{
		x[cnt]=e.getX();
		y[cnt]=e.getY();
		cnt++;
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawPolygon(x,y,cnt);
	}
}
