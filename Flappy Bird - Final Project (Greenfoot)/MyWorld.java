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
        //Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        
        //Make a method call to prepareWorld
        prepareWorld();
        
        //Make a variable that stores a new FlappyBird object
        FlappyBird flappy = new FlappyBird(1);
        
        //Adds a FlappyBird objectat the width of a quartre of the the window and the height of half of the window
        addObject(flappy, getWidth()/4, getHeight()/2);
    }
    
    /**
     * prepareWorld prepares the world as in sets up the back-drop
     * 
     * @param None There are no parameters
     * @return Nothing is returned 
     */
    private void prepareWorld()
    {
        //Sets the color of the background to cyan
        getBackground().setColor(Color.CYAN);
        
        //Draws a rectangle at (0,0) at a width of the window's width and a height of the window's height minus a quatre
        getBackground().fillRect(0,0,getWidth(),getHeight()-getHeight()/4);
        
        //Sets the color of the ground to be green
        getBackground().setColor(Color.GREEN);
        
        //Draws a rectangle at (0,getHeight()-getHeight()/4, getWidth(), getHeight())
        getBackground().fillRect(0,getHeight()-getHeight()/4, getWidth(), getHeight());
        
        //Sets the color of the "horizon" to orange
        getBackground().setColor(Color.ORANGE);
        
        //Draws a rectangle at (0,getHeight() - getHeight()/4 - 5, getWidth(), 10)
        getBackground().fillRect(0,getHeight() - getHeight()/4 - 5, getWidth(), 10);
    }
        
}
