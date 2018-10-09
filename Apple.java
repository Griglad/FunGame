import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Apple here.
 * 
 * @author (Grigorios Ladas) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    
   private int speed;
    GreenfootImage img = new GreenfootImage("Apple.png");
    
    
    
 public Apple()
 {
     
     
     speed = Greenfoot.getRandomNumber(4)+1;
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
    
    
    
    
    public void act() 
    {
       
        setLocation(getX()-speed, getY()); 
        turn(1);
        removeatEdge();
        
        
        
        
        
    }    
}
