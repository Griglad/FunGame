import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * An actor class that can display a scoreboard, using Greenfoot's
 * UserInfo class.  
 * 
 * You typically use this by including some code into the world for when your game ends:
 * 
 * <pre>
 *   addObject(new ScoreBoard(800, 600), getWidth() / 2, getHeight() / 2); 
 * </pre>
 * 
 * Where 800 by 600 should be replaced by the desired size of the score board. 
 * 
 * @author Neil Brown 
 * @version 1.0
 */
public class TitleScreen extends Actor
{
     public static final float FONT_SIZE = 24.0f;
    public static final int WIDTH = 500;
    public static final int HEIGHT = 300;

    private String status = null;
    
    
    public TitleScreen(String status)
    {
    if (status == "start")
        {
            makeImage(startTitle());
        } 
    
       

        
    
    }
    
    
     private void makeImage(String title)
    {
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);

        image.setColor(new Color(0,200,100, 200));
        image.fillRect(0, 0, WIDTH, HEIGHT);
        image.setColor(new Color(0, 130, 0, 128));
        image.fillRect(5, 5, WIDTH-10, HEIGHT-10);
        Font font = image.getFont();
        font = font.deriveFont(20.0f);
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString(title, 20, 50);
        setImage(image);
 
    }
    
    
     public void act()
  
    {
        if (Greenfoot.isKeyDown("enter"))
        {
            
            if (status == "fail")
            {
                Greenfoot.setWorld(new Forest_world());
            }
    
    
    
        }
    
    
    
    }
    
    
    
    
    
    
     public String startTitle()
    {
        String title = "ΚΑΛΩΣΗΡΘATE ΣΤΟ ΠΑΙΧΝΙΔΙ MOVING MOUTH." + "\n" + "ΣΚΟΠΟΣ ΤΟΥ ΠΑΙΧΝΙΔΙΟΥ ΕΙΝΑΙ ΝΑ ΜΑΖΕΨΕTE" + "\n" + " ΜΕΣΑ ΑΠΟ ΤΟ ΔΑΣΟΣ ΟΣΑ ΠΕΡΙΣΣΟΤΕΡΑ" + "\n" + "ΦΡΟΥΤΑ ΜΠΟΡΕΙTE. ΠΙΟ ΣΥΓΚΕΚΡΙΜΕΝΑ ΜΗΛΑ" + "\n" + "ΚΑΙ ΜΠΑΝΑΝΕΣ ΜΑΖΕΥΟΝΤΑΣ ΟΣΟΥΣ" + "\n" + "ΠΕΡΙΣΣΟΤΕΡΟΥΣ ΠΟΝΤΟΥΣ ΜΠΟΡΕΙΤΕ ΠΡΙΝ" + "\n" + " ΤΕΛΕΙΩΣΕΙ Ο ΧΡΟΝΟΣ."  + "ΜΕΤΑΚΙΝΗΘΕΙΤΕ ME" + "\n" + "ΤΑ ΒΕΛΑΚΙΑ ΠΑΝΩ ΚΑΤΩ ΑΡΙΣΤΕΡΑ ΔΕΞΙΑ" + "\n" +  "\n"  +"ΠΑΤΗΣΤΕ ENTER ΓΙΑ ΝΑ ΞΕΚΙΝHΣΕΤΕ";
        return title;
    }
    
    
    
    
    
    
}
