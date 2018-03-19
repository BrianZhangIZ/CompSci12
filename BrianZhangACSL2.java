import java.util.*;
class BrianZhangACSL2 {
   public static void main(String[] args){
      for(int x = 0; x < 5; x++){
         Scanner input = new Scanner(System.in);
         String function = input.nextLine();
         String partial =""; 
         String morePartial ="";
         int firstCord = 0;
         int firstCord2 = 0;
         int secondCord = 0;
         int secondCord2 = 0;
         int totalCord = 0;
         boolean exist1 = false;
         boolean exist2 = false;
         boolean exist3 = false;
         boolean exist4 = false;
         boolean forward = false;
         for (int i = 0; i < function.length(); i++){
            if(function.charAt(i) == '['){
               firstCord = i + 1;
               exist1 = true;}
            else if(function.charAt(i) == ']'){
               secondCord = i;
               exist2 = true;}
            if(exist1 == true && exist2 == true){
               partial = function.substring(firstCord, secondCord);}
            else{
               partial = function.substring(firstCord);}
         }
         for (int i = 0; i < partial.length(); i++){
            if(partial.charAt(i) == '('){
               firstCord2 = i + 1;
               exist3 = true;}
            else if(partial.charAt(i) == ')'){
               secondCord2 =i;
               exist4 = true;}
            if(exist3 == true){
               morePartial = partial.substring(firstCord2)+ " ";
               forward = true;}
            else if(exist4 == true){
               morePartial = " " + partial.substring(firstCord2, secondCord2);}
            else if(exist3 == true && exist4 == true){
               morePartial = partial.substring(secondCord2)+ " ";
               forward = true;}
            else{
               morePartial = " " + partial;}
         }
         System.out.println(morePartial);
         totalCord = firstCord + firstCord2;
         for (int i = 0; i < morePartial.length(); i++){
            if(forward == true){
               if(morePartial.charAt(i) == '+' || morePartial.charAt(i) == '-' || morePartial.charAt(i) == '*' || morePartial.charAt(i) == '/'){
                  for(int j = i + 1; j < morePartial.length(); j++){
                     if(morePartial.charAt(j) == '+' || morePartial.charAt(j) == '-' || morePartial.charAt(j) == '*' || morePartial.charAt(j) == '/' || j == morePartial.length() - 1){
                        System.out.print(totalCord + j + 1);
                        System.out.print(" ");
                        break;
                     }
                  }
               }
            }
            else if(morePartial.charAt(i) == '+' || morePartial.charAt(i) == '-' || morePartial.charAt(i) == '*' || morePartial.charAt(i) == '/'){
               for(int j = i - 1; i < morePartial.length(); j--){
                  if(morePartial.charAt(j) == '+' || morePartial.charAt(j) == '-' || morePartial.charAt(j) == '*' || morePartial.charAt(j) == '/' || j == 0){
                     System.out.print(totalCord + j + 1);
                     System.out.print(" ");
                     break;
                  }
               }
            }
         }
         System.out.println(" ");
      }
   }
}