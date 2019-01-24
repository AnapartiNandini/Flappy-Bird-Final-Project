import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BottomPipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BottomPipe extends Pipe
{
    //Create instance variables
    private final int PIPE_DISTANCE = 4;
    /**
     * Act - do whatever the BottomPipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Set the location of the Pipe to be PIPE_DISTANCE less than the current x location and the current y location
        setLocation(getX() - PIPE_DISTANCE, getY());
    }    
}
