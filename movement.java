import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class movement extends JPanel implements KeyListener{
   private ImageIcon image;
   int x = 750/2, y = 750/2;
   ImageIcon i = new ImageIcon("H:\\char.bmp");
   public void paint(Graphics g){
      i.paintIcon(this, g, x, y);
   }  
   public void up(){
      repaint();     
      y-= 5;
      System.out.println("up");
   }
   public void down(){
      repaint();
      y+= 5;
   }
   public void left(){
      repaint();
      x-= 5;
   }
   public void right(){
      repaint();
      x+= 5;
   }
   public void keyPressed(KeyEvent e){
      int code = e.getKeyCode();
      
      if(code == KeyEvent.VK_UP){
         up();
      }
      if(code == KeyEvent.VK_DOWN){
         down();
      }
      if(code == KeyEvent.VK_LEFT){
         left();
      }
      if(code == KeyEvent.VK_RIGHT){
         right();
      }
   }
   public void keyTyped(KeyEvent e){}
   public void keyReleased(KeyEvent e){}
   
}
