class Player 
{
   int x;
   int y;
   movement direction;
   
   public Player(int playerX, int playerY, int type)
   {
      x = playerX;
      y = playerY;
      direction = new movement(type);
   }  
   
   
   //public move(){}
   
   public boolean checkUseKey()
   {
      return this.useKeyOn;
   }
   
   public void draw()
   {
      switch(this.direction.characterDirection())
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

