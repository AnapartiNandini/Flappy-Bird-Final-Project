import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends greenfoot.World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        
        //Make a method call to prepareWorld
        prepareWorld();
        
        //Make a method call to addActors
        addActors();
    }
    
    /**
     * prepareWorld prepares the world as in sets up the back-drop
     * 
     * @param None There are no parameters
     * @return Nothing is returned 
     */
    private void prepareWorld()
    {
        //sets the color of the background to cyan
        getBackground().setColor(Color.CYAN);
        
        //draws a rectangle at (0,0) at a width of the window's width and a height of the window's height minus a quatre
        getBackground().fillRect(0,0,getWidth(),getHeight()-getHeight()/4);
        
        //sets the color of the ground to be green
        getBackground().setColor(Color.GREEN);
        
        //draws a rectangle at (0,getHeight()-getHeight()/4, getWidth(), getHeight())
        getBackground().fillRect(0,getHeight()-getHeight()/4, getWidth(), getHeight());
        
        //sets the color of the "horizon" to orange
        getBackground().setColor(Color.ORANGE);
        
        //draws a rectangle at (0,getHeight() - getHeight()/4 - 5, getWidth(), 10)
        getBackground().fillRect(0,getHeight() - getHeight()/4 - 5, getWidth(), 10);
    }
    
    private void addActors()
    {
        addObject(new FlappyBird(), getWidth()/4, getHeight()/2);
    }
}
