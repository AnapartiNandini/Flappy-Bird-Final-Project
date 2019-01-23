import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    //Set the instance variables
    private double downY = 0;
    private double gravity = 0.8;
    /**
     * FlappyBird is the constructor for objects of the type FlappyBird
     * 
     * @param None There are no Parameters
     * @return An object of type FlappyBird
     */
    public FlappyBird()
    {
        
    }
    
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //Sets the location to the current x loacation and the current y location  plus the value for downY
        setLocation(getX(), (int)(getY() + downY));
        
        //Make a method call to ifTouchingPipe()
        ifTouchingPipe();
        
        //Make a method call to checkKeyPressed()
        checkKeyPressed();
                
        //Make a method call to displayGameOver()
        displayGameOver();
        
        //Change the value of down to be the sum of the value of gravity and the value of downY to increase the rate of the speed at which the flappy bird is moving down
        downY = downY + gravity;
    }
    /**
     * ifTouchingPipe causes the game to end if the Frog touches the Fly object
     * 
     * @param None There are no parameters
     * @return Nothing is returned
     */
    public void ifTouchingPipe()
    {
        //If isTouching(TopPipe.class) is not equal to null...
        if(getOneIntersectingObject(TopPipe.class) != null)
        {
            //Display GameOver actor at the center of the world
            getWorld().addObject(new GameOver(),getWorld().getWidth()/2,getWorld().getHeight()/2);
            
            //Stop the sceanario
            Greenfoot.stop();
        }
        
        //If isTouching(BottomPipe.class) is not equal to null...
        if(getOneIntersectingObject(BottomPipe.class) != null)
        {
            //Display GameOver actor at the center of the world
            getWorld().addObject(new GameOver(),getWorld().getWidth()/2,getWorld().getHeight()/2);
            
            //Stop the sceanario
            Greenfoot.stop();
        }
        
        if(getOneIntersectingObject(TopPipe.class) == null)
        {
            //call the method update from the MyWorld class
            ( (MyWorld)getWorld() ).update();
        }
        
        if(getOneIntersectingObject(BottomPipe.class) == null)
        {
            //call the method update from the MyWorld class
            ( (MyWorld)getWorld() ).update();
        }
    }   
    /**
     * checkKeyPressed checks if a key has been pressed, if so, what to do.
     * 
     * @param None There are no Parameters
     * @return Nothing is returned
     */
    private void checkKeyPressed()
    {
        //if user presses the UP arrow, launch the Flappy Bird obbject upward
        if(Greenfoot.isKeyDown("up") == true)
        {
            //set the value of downY to be 9.9
            downY = -9.9;
        }
    }
        
    /**
     * displayGameOver displays "Game Over" when the Flappy bird reaches the bottom of the window
     * 
     * @param None There are no Parameters
     * @return Nothing is returned
     */
    private void displayGameOver()
    {
        //If the current y location of the Flappy Bird is greater than or below the world...
        if(getY() > getWorld().getHeight())
        {
            //Display GameOver actor at the center of the world
            getWorld().addObject(new GameOver(),getWorld().getWidth()/2,getWorld().getHeight()/2);
            
            //End the scenario
            Greenfoot.stop();
        }
    }
}
