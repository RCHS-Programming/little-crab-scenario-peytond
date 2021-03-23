import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        
        showText("Score : ", 50, 500);
        
        addObject(new Crab(), 150, 100);
        addObject(new Lobster(), 400, 100);
        addObject(new Lobster(), 400, 300);
        addObject(new Lobster(), 400, 500);
        
        addObject(new Worm(), 20, 500);
        addObject(new Worm(), 30, 200);
        addObject(new Worm(), 60, 90);
        addObject(new Worm(), 80, 310);
        addObject(new Worm(), 150, 50);
        addObject(new Worm(), 210, 410);
        addObject(new Worm(), 220, 520);
        addObject(new Worm(), 410, 270);
        addObject(new Worm(), 530, 30);
    }
}