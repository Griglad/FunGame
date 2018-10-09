import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Eatenapple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RottenApple extends Actor
{
    GreenfootImage img = new GreenfootImage("RottenApple.png");
    
    
    public RottenApple()
    {
         
            img.scale(70,70);  
            setImage(img); 
        }
    
    
    
      public void act() 
    {
        setLocation(getX()-4, getY());
        
        
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
