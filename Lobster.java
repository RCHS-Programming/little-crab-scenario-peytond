import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author Peyton D
 * @version March 16 version 1
 */
public class Lobster extends Actor
{
     public void act()
    {
        turnAtEdge();
        randomTurn();
        move();
        lookForCrab();
    }
    
    public void move( )
    {
        move(5);
    }
    
    /*
     * Check whether we have stumbled upon a crab.
     * If we have, eat it. If not, do nothing.
     */
    public void lookForCrab()
    {
        if(isTouching(Crab.class) )
        {
            removeTouching(Crab.class);
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }
    
    /*
     * Make the lobster make random turns left or right
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
     * If the lobster is at the Edge of the World
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
