import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;

public class acutal {
   public static void main(String[] args){
      JFrame f = new JFrame();
      movement s = new movement();
      f.add(s);
      f.setSize(750, 750);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
   }
}
