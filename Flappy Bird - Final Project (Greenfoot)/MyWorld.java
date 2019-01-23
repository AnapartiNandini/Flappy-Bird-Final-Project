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
    private int FIRST_PIPE = 240;
    private int PIPE_SPACING = 100;
    
    //create a Scoreboard variable that we will store a Scoreboard in later
    private Scoreboards score;
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
        
        //Add a scoreboard object to the world in the top left hand corner.
        //Make sure to store this as an instance variable so you have access to it later.
        score = new Scoreboards();
        addObject(score,75,25);
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
     * update will call addToScore from the scoreboard object we stored earlier, and add a point to that scoreboard
     * 
     * @param None There are no parameters
     * @return Notning is Returned
     */
    public void update()
    {
        //If counter is equal to the value of FIRST_PIPE
        if(counter == FIRST_PIPE )
        {
           //call the method addToScore of score 
           score.addToScore();
           
           //Add 100 pixles to the value of FIRST_PIPE
           FIRST_PIPE = FIRST_PIPE + 100;
        }        
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
        
        
        //If counter modulus 100 equal to 0...
        if(counter % 100 == 0)
        {
            //add a bottom pipe object to the world
            addObject(new BottomPipe(),getWidth(), Greenfoot.getRandomNumber(getHeight()/2) + 250);
            
            //add a top pipe object to the world
            addObject(new TopPipe(),getWidth(),  Greenfoot.getRandomNumber(getHeight()/2) - 150);            
        }
    }        
}
