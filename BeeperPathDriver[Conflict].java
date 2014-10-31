/**
   @Author:
      Date:
   Teacher: Appel
  */
import kareltherobot.*;
import java.awt.Color;

public class BeeperPathDriver implements Directions
{
    public static void main(String args[])  {
        Robot karel = new Robot(2, 1, East, 0);  
        karel.turnOff();  
    } 

    static {
        World.reset(); 
        //World.readWorld("worlds/fig6-25.kwld"); 
        int ave;
        int street;
        int length = (int)(Math.random()*5 + 2);
        for (int i = 0; i < length; i++) {
            World.placeBeepers(2, 2 + i, 1);
        }
        
        
        World.setBeeperColor(Color.black);
        World.setStreetColor(Color.gray);
        World.setNeutroniumColor(Color.black);
        World.setDelay(10);  
        World.setVisible(true);
    }
}
