
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Forest_world extends World

{
    
    

    private static int score;
    private static int time;
    private static int life;
    private TitleScreen startImage;
    private boolean flag = false; 
    
    public Forest_world()
    {    
        
        super(850, 360, 1);
     
        prepare();
        this.startImage = new TitleScreen("start");
        addObject(startImage, getWidth()/2, getHeight()/2);
        this.life = 3; 
        this.time = 1500; 
        showScore();
        showTime();
        showLives();
    
    }
    
    
    
    
    
    
    public void act()
    
    {
        
          if ((Greenfoot.isKeyDown("enter")) )
        {
              
            removeObject(startImage);
            flag = true;
            
        }
        
       
       if (flag){
           countTime();
            createObjects();
            
        }

    }
    
    
    
    
     public void createObjects()
     {
         
          
        if (Greenfoot.getRandomNumber(100) < 2)
        {
   
         addObject(new Apple(), 799, Greenfoot.getRandomNumber(360));
   
        }
       
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new RottenApple(), 799, Greenfoot.getRandomNumber(360));
        }
          if (Greenfoot.getRandomNumber(100) < 0.5)
        {
            addObject(new Star(), 799, Greenfoot.getRandomNumber(360));
        }
        
        
        
        
    }   
       
   
    public static void initializeScore()
    {
        score = 0;
        
    }
    
       
    
    
    
    
    
    

    public void loseLife()
    {
        --life;
        showText("Life : " + life, 75, 90);
        if(life == 0)
        {showText("GAME OVER TRY AGAIN" +  "\n"  + "YOUR SCORE IS " + score +" " +  "POINTS",390,200);
           Greenfoot.playSound ("game-over.wav");
           initializeScore();
        Greenfoot.stop();}
    }
    
    
    private void showScore()
    {
        showText("Score: " + score, 75 ,30 );

    
    }
    
 
    private void showTime()
    {
        
        showText("Time: " + time, 75, 60);
        
    }
    
    
    private void showLives()
    {
        showText("Life : " + life , 75, 90);
    
    }
    
    
  
    
    
    
    
    public static int getLives()
    {
        return life;
    }
    
  
    
    
    
    
      public void addScore(int points)
    {
        score = score + points;
        showScore();
        
        if (score < 0)
        {
            
            Greenfoot.stop();
        }
        
        
        
        
    }
  
    public static int getScore()
    {
        return score;
    }
    
    
    
     
    private void prepare()
    {

        Mouth mouth = new Mouth();
        addObject(mouth,59,216);
        
        mouth.setLocation(93,182);
    }
    
    
    
    
    
    
    
    
    
    
    
    public void countTime()
    {
        
        time--;
        showTime();
        if(time == 0)
            {
                Greenfoot.setWorld(new Forest_world2());
           
        }      
    
    
    }
    
   
}

