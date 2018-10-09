import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mouth here.
 * 
 * @author (Grigorios ladas) 
 * @version (a version number or a date)
 */

public class Mouth extends Actor
{

    private  GreenfootImage image1;
    private  GreenfootImage image2;

    public Mouth()
    {

        image1 = new GreenfootImage("openmouth.png");
        setImage(image1);
        image2 = new GreenfootImage("halfwaymouth.png");
        setImage(image2);

    }
    
    //Μεθοδος αλλαγης εικονων   
    public void switchImage()
    {
        if(getImage() == image1)
        {
            setImage(image2);
        }
        else
        {
            setImage(image1);
        }
    }

    //Μεθοδος ελεγχου ποιου πληκτρου πατηθηκε
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("up")) 

        {
            setLocation(getX(), getY()-7);
        }

        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+7);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            move(-7);
        }

        if (Greenfoot.isKeyDown("right"))
        {
            move(7);
        }
    }

    //Μεθοδος επαφης με το αστερι. Το αστερι μπηκε για ντεκορ μεσα στο παιχνιδι δε κανει κατι απλα γυρναει οταν το αγγιζει το mouth 
    private void checkStar()
    {
        Star star = (Star) getOneIntersectingObject(Star.class);
        if (star != null)
        {
            star.turn(9);
        }
    }


    //Μεθοδος ελεγχου συγκρουσης πρωτου επιπεδου με μηλα και σαπια μηλα
    private void checkACollision()
    {

        if(isTouching(Apple.class) )
        {

            //Forest_world f = (Forest_world)getWorld();
            removeTouching(Apple.class);
            Greenfoot.playSound ("slurp.wav");

            ((Forest_world)getWorld()).addScore(20);

        }

        if(isTouching(RottenApple.class) )
        {

            Forest_world f1 = (Forest_world)getWorld();
            removeTouching(RottenApple.class);
            Greenfoot.playSound ("au.wav");
            f1.loseLife();

        }

    }

    // Μεθοδος ελεγχου συγκρουσης δευτερου επιπεδου(Forest_world2) με μπανανες και σαπιες μπανανες
    public void checkBcollision()
    {

        if(isTouching(Banana.class) )
        { 

            {
                removeTouching(Banana.class);
                Greenfoot.playSound ("slurp.wav"); 

                
                ((Forest_world2)getWorld()).addScore(10);

            }

            
        }

        if(isTouching(RottenBannana.class))
        {

             
            Forest_world2 f2 = (Forest_world2)getWorld();

            removeTouching(RottenBannana.class);
            Greenfoot.playSound ("au.wav");
            ((Forest_world2)getWorld()).loseLife();

        }

    }

    //Μεθοδος acτ που λειτουργει για τον actor οταν ξεκινησει να λειτουργει το παιχνιδι   
    public void act() 
    {
        switchImage();
        checkKeyPress();
        checkStar();

        checkACollision();
        checkBcollision(); 

    }

    
    

   
}

