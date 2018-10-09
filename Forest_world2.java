
import 
greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class White_world2 here.
 * 
 * @author (Grigorios ladas) 
 * @version (a version number or a date)
 */

public class Forest_world2 extends World
{
   
    private static int score;
    private static int time;
   private static int life;
 
    
    
    
       
    public Forest_world2()
    {    
       
        
        super(850, 360, 1);
        prepare();
        this.time = 2000;
        this.life = Forest_world.getLives(); 
        this.score = Forest_world.getScore(); 
        showTime();
        showScore();
        showLives();
       
    }
    
    
    
    
    

    public void createObjects2()
     {
         
          
        if (Greenfoot.getRandomNumber(100) < 1)
        {
   
         addObject(new Banana(), 779, Greenfoot.getRandomNumber(360));
        }
        if (Greenfoot.getRandomNumber(100) < 1.5)
        {
            addObject(new RottenBannana(), 799, Greenfoot.getRandomNumber(360));
        }
          if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Star(), 799, Greenfoot.getRandomNumber(360));
        }
        
        
        
        
    }    
     
    
    
       
    public void countTime()
    {
        
        time--;
        showTime();
        if (time == 0)
        {
              
            showText("CONGRATULATIONS YOU HAVE SURVIVED" +  "\n"  + "YOUR SCORE IS " + score +" " +  "POINTS",390,200);
          Greenfoot.playSound ("congratulations intro.mp3"); 
           initializeScore();
          Greenfoot.stop();
           
        }      
           
              
    
    }
    
    
    
    
    
    
    
    
    
    
    
    

    public void act()
    {
        
        
        createObjects2();
        countTime();
    }
    
    
    
    
    
    
    
    
    
   
     
     private void showScore()
    {
        showText("SCORE: " + score, 75 ,30 );
        
    
    }
    
    
    
     private void showLives()
     {
          showText("Life : " + life , 75, 90);
          
        }
        
        
      private void showTime()
    {
        
        showText("Time: " + time , 75, 60);
        
    }
    
   
    
   
    
       public  void addScore(int points)
    {
         score += points;
        showScore();
   
        
        if (score < 0)
        {
            
            Greenfoot.stop();
        }
        
        
        
        
    }
    
    
    
    
       
  
  public void initializeScore()
  {
      score = 0;
      Forest_world.initializeScore();
    }
    
    
     
    public void loseLife()
    {
        
        --life;
        showText("Life : " + life, 75, 90);
        if(life == 0)
        {
         showText("GAME OVER TRY AGAIN" +  "\n"  + "YOUR SCORE IS " + score +" " +  "POINTS",390,200);
          Greenfoot.playSound ("game-over.wav");  
          initializeScore();
        Greenfoot.stop();
    }
    }
    
 
    
    
    
       
 
    
    
       
    
    private void prepare()
    {

       
        
         
        Mouth mouth =  new Mouth();
        addObject(mouth,59,216);

      
    }
    
    
    
 
   
}

