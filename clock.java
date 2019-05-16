package abc;

import java.awt.*;
import java.applet.*;

/*
<applet code="Clock" height=400 width=400>
</applet>
*/

public class clk2 extends Applet implements Runnable{

  int startAngle = 84;
  int startAngle1 = 84;
  int startAngle2 = 84;
  int secCount = 1;
  int minCount = 2;
  final int arcWidth = 3; 
  public void init(){
    setBackground(Color.DARK_GRAY);
    Thread t = new Thread(this);
    t.start();
  }

  public void run(){
    for(;;){
    try{
      startAngle -= 6;
      Thread.sleep(1000);
      secCount++;
      if(secCount%60==0){
        minCount++;
        startAngle1 -=6;
      }
      if(minCount%60 == 0){
        startAngle2 -=6;
      }
      repaint();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
  }

  public void paint(Graphics g){
    g.setColor(Color.WHITE);
    g.drawOval(30, 30, 200, 200);
    g.setColor(Color.BLUE);
    g.fillArc(30, 30, 200, 200, startAngle, arcWidth);
    g.setColor(Color.YELLOW);
    g.fillArc(30, 30, 200, 200, startAngle1, arcWidth);
    g.setColor(Color.RED);
    g.fillArc(30, 30, 200, 200, startAngle2, arcWidth);
  }
}
