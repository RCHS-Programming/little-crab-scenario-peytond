import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        turnAtEdge();
        randomTurn();
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
        }
    }
    
    /*
     * Make the crab make random turns left or right
     * between 0 and 45 degrees
     */
    public void randomTurn()
    {
        if(Greenfoot.getRandomNumber(100) < 10 )
        {
            turn( Greenfoot.getRandomNumber(91) - 45);
        }   
    }
    
    /*
     * If the crab is at the Edge of the World
     * turns right 17 degrees.
     */
    public void turnAtEdge()
    {
        if( isAtEdge() )
        {
            turn(17);
        }
    }
}


