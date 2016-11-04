import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TheGrid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheGrid extends World
{
    
    /**
     * Constructor for objects of class TheGrid.
     * 
     */
    public TheGrid()
    {    
        super(600, 400, 1); 
        int height = 400;
        int width = 600;
        int pad = 500;
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        addObject(new Bot(), 200, 200);
        addObject(new Juice(), (int)(Math.random()*width) , (int)(Math.random()*height));
    }
}
