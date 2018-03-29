public class movement implements KeyListener
{
   boolean[] movements = new boolean[4]; //0 is up, 1 is right, 2 is down, 3 is left
   boolean paused = false;
   int player;
   boolean useKeyOn = false;
   
   public movement(int type)
   { 
      addKeyListener(this);
      player = type;
   }
   
   public void keyPressed(KeyEvent e)
   {
      if (player == 1)
      {
         switch (e.getKeyCode())
         {
            case KeyEvent.VK_UP:
               movements[0] = true;
               break;
            case KeyEvent.VK_RIGHT:
               movements[1] = true;
               break;
            case KeyEvent.VK_DOWN:
               movements[2] = true;
               break;
            case KeyEvent.VK_LEFT:
               movements[3] = true;
               break;
            case KeyEvent.VK_SPACE:
               this.useKeyOn = true;
               break;
            default:
               break;      
         }
      }
      else
      {
         switch (e.getKeyCode())
         {
            case KeyEvent.VK_W:
               movements[0] = true;
               break;
            case KeyEvent.VK_D:
               movements[1] = true;
               break;
            case KeyEvent.VK_S:
               movements[2] = true;
               break;
            case KeyEvent.VK_A:
               movements[3] = true;
               break;
            case KeyEvent.VK_ENTER:
               this.useKeyOn = true;
               break;
            default:
               break;   
         }
      }
      
      if (e.getKeyCode() == KeyEvent.VK_P)
      {
         if (this.paused)
            paused = false;
         else
            paused = true;
            
      }  
   }
   
   public int characterDirection(boolean[] moves)
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
   }
   
   public void keyTyped(KeyEvent e){}
   
   public void keyReleased(KeyEvent e)
   {
      if (player == 1)
      {
         switch (e.getKeyCode())
         {
            case KeyEvent.VK_UP:
               movements[0] = false;
               break;
            case KeyEvent.VK_RIGHT:
               movements[1] = false;
               break;
            case KeyEvent.VK_DOWN:
               movements[2] = false;
               break;
            case KeyEvent.VK_LEFT:
               movements[3] = false;
               break;
            case KeyEvent.VK_SPACE:
               this.useKeyOn = false;
               break;
            default:
               break;   
         }
      }
      else
      {
         switch (e.getKeyCode())
         {
            case KeyEvent.VK_W:
               movements[0] = false;
               break;
            case KeyEvent.VK_D:
               movements[1] = false;
               break;
            case KeyEvent.VK_S:
               movements[2] = false;
               break;
            case KeyEvent.VK_A:
               movements[3] = false;
               break;
            case KeyEvent.VK_ENTER:
               this.useKeyOn = false;
               break;
            default:
               break;   
         }
      }
   }
}
