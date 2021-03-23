import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int wormsEaten;
    /* 
     * Create a crab and initialize its two images.
     */
        public Crab()
    {
        image1 = new GreenfootImage ("crab.png");
        image2 = new GreenfootImage ("crab2.png");
        setImage (image1);
        wormsEaten = 0;
    }
        public void act()
    {
        if(getImage()==image1)
        {
            setImage(image2);
        }
        else
        {
            setImage(image1);
        }
        checkKeyPress();
        move();
        lookForWorm();
    }
    
        public void move( )
    {
        move(5);
    }
    
    /*
     * Check whether we have stumbled upon a worm.
     * If we have, eat it. If not, do nothing.
     */
        public void lookForWorm()
    {
        if(isTouching(Worm.class) )
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
            wormsEaten = wormsEaten + 1;
            
            getWorld().showText("Score: " + wormsEaten, 50, 500);
            
            if(wormsEaten == 9)
            {
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
        }
    }
    
   /*
    * Check whether a user has pressed the keyboard key.
    * If so, turn the crab.
    */
      public void checkKeyPress()
  {
      if( Greenfoot.isKeyDown("left") )
        {
            turn (-4);
        }
      if( Greenfoot.isKeyDown("right") )
        {
            turn (4);
        }
  } 
  /*
   * Switch images of the crab to make it appear animated.
   */
    public void switchImage()
    {
        if(getImage()==image1)
        {
            setImage(image2);
        }
        else
        {
            setImage(image1);
        }
    }
  }



