import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Star here.
 * 
 * @author (Grigorios ladas) 
 * @version (a version number or a date)
 */
public class Star extends Actor
{
   
     private int speed;
    /**
     * Act - do whatever the Star wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        speed = 8;
        setLocation(getX()-4, getY());
        turn(1);
        removeatEdge();
        
       
    }    
   
    //Mεθοδος που οταν ειναι στα ορια του κοσμου θελουμε να αφαιρεθει το αντικειμενο
    public void removeatEdge()
  {
      World w = getWorld();
      
       if(isAtEdge())
        {
            w.removeObject(this);
        }
    }
    
    
    
    
}
