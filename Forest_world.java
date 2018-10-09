
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
    
    
    
    
    
    
    //Μεθοδος act που τρέχει οταν τρέχει και το παιχνίδι επιπλεον ελεγχω με μια boolean μεταβλητη πρωτα να εμφανιστει η titlescreen και εφοσον πατησω enter να τρεξει το παιχνιδι
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
    
    
    
     //Μεθοδος δημιουργιας αντικεμενων πρωτου επιπεδου
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
       
    //Αρχικοποίηση του σκορ του πρώτου επιπεδου αν θα χασω σε αυτο
    public static void initializeScore()
    {
        score = 0;
        
    }
    
       
    
    
    
    
    
    
    //Μέθοδος για αφαιρεση μιας ζωης οταν ερθω σε επαφη με ενα αντικειμενο τυπου σαπιου μηλου η σαπιας μπανανας και επιπλεον ελεγχος αν μηδενιστουν οι ζωες μου τοτε εμφανισε game over και μηδενισε το σκορ 
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
    
    //Mεθοδος για εμφανιση του σκορ μεσω της showText της world
    private void showScore()
    {
        showText("SCORE: " + score, 75 ,30 );

    
    }
    
    //Μεθοδος εμφανισης του χρονου με τη μεθοδο showText της world 
    private void showTime()
    {
        
        showText("Time: " + time, 75, 60);
        
    }
    
    // Μεθοδος για εμφανιση ζωων μεσω της  ShowText της world για εμφανιση ζωων 
    private void showLives()
    {
        showText("Life : " + life , 75, 90);
    
    }
    
    
  
    
    
    
    
    //Μεθοδος για να παρω τις ζωες και να τις μεταφερω στον επομενο κοσμο
    public static int getLives()
    {
        return life;
    }
    
  
    
    
    
    //Μεθοδος για αθροιση του σκορ
      public void addScore(int points)
    {
        score = score + points;
        showScore();
        
        if (score < 0)
        {
            
            Greenfoot.stop();
        }
        
        
        
        
    }
    //Μεθοδος για να παρω το σκορ και να το μεταφερω στον επομενο κοσμο
    public static int getScore()
    {
        return score;
    }
    
    
    
    //Μεθοδος που προετοιμαζει τον κοσμο οριζοντας ως βασικο actor ενα νεο αντικείμενο της κλάσης mouth 
    private void prepare()
    {

        Mouth mouth = new Mouth();
        addObject(mouth,59,216);
        
        mouth.setLocation(93,182);
    }
    
    
    
    
    
    
    
    
    
    
    // Μεθοδος για να μετραει ο χρονος αρνητικα και οσο αυτος μετραει να εκτελειται η μεθοδος showTime για να μου δειχνει το χρονο
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

