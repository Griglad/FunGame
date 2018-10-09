import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Eatenbanana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class RottenBannana extends Actor
{
    
    private int speed;
    GreenfootImage img = new GreenfootImage("RottenBannana.png");
    
    
    
 public RottenBannana()
 {
      
            img.scale(70,70);  
            setImage(img); 
     
     speed = Greenfoot.getRandomNumber(3)+1;
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
       
        setLocation(getX()-4, getY());
      
       removeatEdge();
        
        
        
        
        
    }    
}
