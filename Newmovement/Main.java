import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Main extends JFrame implements KeyListener
{ 
   Player player1; 
   Player player2;
   JFrame frame = new JFrame("Kitchen Kraze!");
   boolean paused = false;
 
   public Main()
   {
      player1 = new Player(50, 50);
      player2 = new Player(200, 200);
      frame.setSize(400, 400);
      frame.add(new Drawing());
      frame.setVisible(true);
      frame.addKeyListener(this);
   }
   
   class Drawing extends JComponent
   {
      public void paint(Graphics g)
      {
         g.setColor(Color.magenta);
         g.fillOval(player1.x, player1.y, 40, 40);
         player1.dir = updateCharDir(player1.movements);
         player2.dir = updateCharDir(player2.movements);
         player1.move();
      }
   }
   
   public void keyPressed(KeyEvent e)
   {
      int key = e.getKeyCode();
      switch (key)
      {
         //player 1 movement keys
         case KeyEvent.VK_UP:
            player1.movements[0] = true;
            break;
         case KeyEvent.VK_RIGHT:
            player1.movements[1] = true;
            break;
         case KeyEvent.VK_DOWN:
            player1.movements[2] = true;
            break;
         case KeyEvent.VK_LEFT:
            player1.movements[3] = true;
            break;
            
         //player 2 movement keys  
         case KeyEvent.VK_W:
            player2.movements[0] = true;
            break;
         case KeyEvent.VK_D:
            player2.movements[1] = true;
            break;
         case KeyEvent.VK_S:
            player2.movements[2] = true;
            break;
         case KeyEvent.VK_A:
            player2.movements[3] = true;
            break;
            
         //player 1 use key  
         case KeyEvent.VK_SPACE:
            player1.useKeyOn = true;
            break;
         //player 2 use key 
         case KeyEvent.VK_ENTER:
            player2.useKeyOn = true;
            break;
         default:
            break;   
      }
          
      if (key == KeyEvent.VK_P)
      {
         if (paused)
            paused = false;
         else
            paused = true;
      }  
   }
   
   public int updateCharDir(boolean[] moves)
   {
      int dir = 1;
      if (moves[0] && moves[1])
         dir = 2;
      else if (moves[0] && moves[3])
         dir = 8;
      else if (moves[1] && moves[2])
         dir = 4;
      else if (moves[2] && moves[3])
         dir = 6;
      else if (moves[0])
         dir = 1;
      else if (moves[1])
         dir = 3;
      else if (moves[2])
         dir = 5;
      else if (moves[3])
         dir = 7;
      return dir;        
   }
   
   public void keyTyped(KeyEvent e){}
   
   public void keyReleased(KeyEvent e)
   {
      int key = e.getKeyCode();
      switch (key)
      {
         //player 1 movement keys
         case KeyEvent.VK_UP:
            player1.movements[0] = false;
            break;
         case KeyEvent.VK_RIGHT:
            player1.movements[1] = false;
            break;
         case KeyEvent.VK_DOWN:
            player1.movements[2] = false;
            break;
         case KeyEvent.VK_LEFT:
            player1.movements[3] = false;
            break;
            
         //player 2 movement keys  
         case KeyEvent.VK_W:
            player2.movements[0] = false;
            break;
         case KeyEvent.VK_D:
            player2.movements[1] = false;
            break;
         case KeyEvent.VK_S:
            player2.movements[2] = false;
            break;
         case KeyEvent.VK_A:
            player2.movements[3] = false;
            break;
            
         //player 1 use key  
         case KeyEvent.VK_SPACE:
            player1.useKeyOn = false;
            break;
         //player 2 use key 
         case KeyEvent.VK_ENTER:
            player2.useKeyOn = false;
            break;
         default:
            break;   
      }
   }
   
   public static void main(String[] args)
   {
      new Main();
   }
}