import java.util.*;
import java.awt.*;
import java.applet.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.MouseListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;
import java.awt.Dimension;
import java.awt.Color;
/*
<applet code="abc" width=300 height=200>
</applet>
*/
@SuppressWarnings("serial")
public class abc extends Applet implements ActionListener
{
int x,y,z;
Dimension d1=new Dimension(200,400);
String msg,tf1,tf2;
Button b1=new Button("+");
Button b2=new Button("-");
TextField t1=new TextField(3);
TextField t2=new TextField(10);
Color c1= new Color(255,255,0);
int h=getSize().height;
int w=getSize().width;

public void init()
{
	this.setLayout(null);
	add(t1);
	t1.setBounds(0,0,20,10);
	add(t2);
	t2.setBounds(20,20,20,10);
	add(b1);
	b1.setBounds(50,50,50,50);
	add(b2);
	b2.setBounds(50,70,50,50);
	b1.addActionListener(this);
	b2.addActionListener(this);	
	t1.addActionListener(this);
	t2.addActionListener(this);
  
}


public void paint(Graphics g)
{
	g.drawString(msg,150,80);	
  setSize(d1);
}
	
public void actionPerformed(ActionEvent e)
{
	String str=e.getActionCommand();
if (str.equals("+"))
{
	tf1=t1.getText();
	tf2=t2.getText();
	x=Integer.parseInt(tf1);
	y=Integer.parseInt(tf2);
	z=x+y;
	msg=Integer.toString(z);
	repaint();
	x=0;
	y=0;
}
if(str.equals("-"))
{
	tf1=t1.getText();
	tf2=t2.getText();
	x=Integer.parseInt(tf1);
	y=Integer.parseInt(tf2);
	z=x-y;
	msg=Integer.toString(z);
	repaint();
	x=0;
	y=0;
}

}
}
