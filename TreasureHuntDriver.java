/**
   @Author:
      Date:
   Teacher: Boyko
  */
import kareltherobot.*;
import java.awt.Color;
import java.util.Random;

public class TreasureHuntDriver implements Directions
{
    public static void main(String args[])  {

        //Your code goes below here:
        Robot karel = new Robot(2, 2, North, 0);  
        karel.setVisible(false);
        karel.turnOff();  
    } 
    
    
    static {
        int world = (int)(Math.random()*3+1);
        World.reset(); 
        World.setSize(10, 10);
        if (world == 1) {
            World.readWorld("worlds/treasure1.kwld");
        }
        else if (world == 2){
            World.readWorld("worlds/treasure2.kwld");
        }
        else if (world == 3) {
            World.readWorld("worlds/treasure3.kwld");
        }
        //World.readWorld("worlds/fig6-27.kwld"); 
        World.setBeeperColor(Color.black);
        World.setStreetColor(Color.gray);
        World.setNeutroniumColor(Color.black);
        World.setDelay(10);  
        World.setVisible(true);
    }
}
