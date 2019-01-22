import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends greenfoot.World
{
    //Make instance variables
    private int counter = 0;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        //Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
                
        //Make a variable that stores a new FlappyBird object
        FlappyBird flappy = new FlappyBird();
        
        //Adds a FlappyBird objectat the width of a quartre of the the window and the height of half of the window
        addObject(flappy, getWidth()/4, getHeight()/2);
    }
    
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Make a method call to prepareWorld
        addPipes();
    }
    
    /**
     * addPipes adds a Pipe object to the world every 100 act cycles
     * 
     * @param None There are no parameters
     * @return Nothing is returned 
     */
    private void addPipes()
    {
        //increases the value for the counter variable by 1 each time the cycle is run
        counter++;
        
        
        //If counter is equal to 100...
        if(counter == 100)
        {
            //add a pipe object to the world
            addObject(new BottomPipe(),getWidth(), Greenfoot.getRandomNumber(getHeight()/2) + 250);
            
            //add a pipe object to the world
            addObject(new BottomPipe(),getWidth(),  Greenfoot.getRandomNumber(getHeight()/2) - 150);
            
            //Set the value of counter to zero
            counter = 0;
        }
    }        
}
