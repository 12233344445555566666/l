package abc;
import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.Dimension;
public class circ extends Applet
{
Dimension d1=new Dimension(200,200);

public void init()
{
	setSize(d1);
}
public void paint(Graphics g)
{
	int x=getWidth();
	int y=getHeight();
Random rg = new Random();
for (int i=1; i<20; i++)
{
g.setXORMode(Color.GRAY);
int r = rg.nextInt(255);
int gr = rg.nextInt(255);
int b = rg.nextInt(255);
Color c = new Color(r,gr,b);
g.setColor(c);
g.fillOval(x/2-(i*10),y/2-(i*10),10+(i*20),10+(i*20));
g.setPaintMode();
}
}
}
