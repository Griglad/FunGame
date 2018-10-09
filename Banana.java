import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banana here.
 * 
 * @author (Grigorios ladas) 
 * @version (a version number or a date)
 */
public class Banana extends Actor
{
    
    private int speed = Greenfoot.getRandomNumber(10) + 1 ;
    GreenfootImage img = new GreenfootImage("Apple.png");
    
    
    
 public Banana()
 {
     
     
     speed = Greenfoot.getRandomNumber(3)+1;
    }
    
    
    
  //Μεθοδος που οταν ειναι στα ορια του κοσμου θελουμε να αφαιρεθει το αντικειμενο  
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
       
        setLocation(getX() - speed, getY());
        turn(3);
        removeatEdge();
        
        
        
        
        
    }    
}