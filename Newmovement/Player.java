class Player
{
   public int x;
   public int y;
   boolean[] movements = new boolean[4]; //0 is up, 1 is right, 2 is down, 3 is left
   boolean useKeyOn = false;
   int dir = 1;

   
   public Player(int playerX, int playerY)
   {
      x = playerX;
      y = playerY;
   }  
   
   public void move()
   {
      switch (dir)
      {
         case 1:
            this.y -= 5;
            break;
         case 3:
            this.x += 5;
            break;
         case 5:
            this.y += 5;
            break;
         case 7:
            this.x -= 5;
            break;
         default:
            break; 
      }
      
   }
   
   public boolean checkUseKey()
   {
      return this.useKeyOn;
   }
   
   public void draw()
   {
      switch(dir)
      {
         case 1:
            break;
         case 2:
            break;
         case 3:
            break;
         case 4:
            break;
         case 5:
            break;
         case 6:
            break;
         case 7:
            break;
         case 8:
            break;
         default:
            break;
      }   
   }
}

