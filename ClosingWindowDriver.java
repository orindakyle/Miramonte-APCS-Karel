/**
   @Author: Jonathan Wallace
      Date:
   Teacher: Boyko
  */
import kareltherobot.*;
import java.awt.Color;

public class ClosingWindowDriver implements Directions
{
    public static void main(String args[])  {
        Robot karel = new Robot(7, 5, East, 9);  
        karel.turnOff();  
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/fig6-28.kwld"); 
        World.setBeeperColor(Color.black);
        World.setStreetColor(Color.gray);
        World.setNeutroniumColor(Color.black);
        World.setDelay(10);  
        World.setVisible(true);
    }
}
