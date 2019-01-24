 /**
 * Name: Nandini Anaparti
 * Course: Software Development
 * Teacher: Mr.Scott Hardman
 * Date Last Modified: 1/24/2019
 */
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
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
    private int firstPipe = 240;
    private final int PIPE_SPACING = 100;
    private String playerName = "1";
    private int turnNumber;
    private Font myFont = new Font("Comic Sans MS", true, false, 24);
    
    //Pipe instance arrays, for the collection of pipe objects
    private Pipe[] pipes;    
    
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
        
        //Initialize the pipes array to a new Pipe array that stores a new TopPipe object, and a  new BootomPipe object
        pipes = new Pipe[] {new TopPipe(), new BottomPipe()};
        
        //adds the pipes at the beginning of the game
        addObject(pipes[0], getWidth(),  0);
        addObject(pipes[1] ,getWidth(), 450);
        
        //Add a scoreboard object to the world in the top left hand corner. 
        score = new Scoreboards();
        addObject(score,75,25);
        
        //Set turnNumber to 0
        turnNumber = 0;
    }
    
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Make a method call to prepareWorld
        addPipes();
        
        if( turnNumber == 0 )
        {
            //set playerName to display an input bix where the user inputs their name
            playerName = JOptionPane.showInputDialog( "Please enter your name:", null );
            
            //Set turnNumber to 1 so that this if-statement doesn't kepp repeating
            turnNumber = 1;
        }
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
        if(counter == firstPipe )
        {
           //call the method addToScore of score 
           score.addToScore();
           
           //Add 100 pixles to the value of FIRST_PIPE
           firstPipe = firstPipe + 100;
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
        int yLocationOfBottomPipe = Greenfoot.getRandomNumber(getHeight()/2) + 250;
        
        //increases the value for the counter variable by 1 each time the cycle is run
        counter++;
                
        //If counter modulus 100 equal to 0...
        if(counter % 100 == 0)
        {
            //add a bottom pipe object to the world
            addObject(new BottomPipe() ,getWidth(), yLocationOfBottomPipe);
            
            //add a top pipe object to the world
            addObject(new TopPipe(),getWidth(),  yLocationOfBottomPipe - 450);
        }
    }
    
    /**
     * playerLose is called form the FlappyBird class if the user has lost.
     * This method displays that the user has lost.
     * 
     * @param None There are no Parameters
     * @return Nothing is returned
     */
    public void playerLose()
    {
        //A local boolean variable called player lose is set to true as the player has not loss yet
        boolean playerLose = true;
        
        for( int k = 0; playerLose == true & k < 1; k++)
        {
            //Show the text "You Lose" plus playerOne's username at given location
            showText("You Lose, " + playerName, getWidth()/2, getHeight()/2 + getHeight()/8);
            
            //playerLose is set to false
            playerLose = false;
        }
    }
}
