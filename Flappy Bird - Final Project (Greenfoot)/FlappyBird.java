import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    //Instance Variables that store the possible images for the Flappy Bird
    private GreenfootImage yellowFlappyBird1 = new GreenfootImage("Flappy_image_1_YELLOW");
    private GreenfootImage yellowFlappyBird2 = new GreenfootImage("Flappy_image_2_YELLOW");
    
    /**
     * FlappyBird is the constructor for objects of the type FlappyBird
     * 
     * @param imageNumber The number that corresponds to a randomized image for FlappyBird
     * @return An object of type FlappyBird
     */
    public FlappyBird(int imageNumber)
    {
        //Make  method call to initializeImages
        //initializeImages();
        
        
        //If imageNumber is equal to 0...
        if( imageNumber == 0 )
        {
            //Sets the image to yellowFlappyBird1
            setImage(yellowFlappyBird1);
        }
                
        //Otherwise
        else
        {
            //Sets the image to yellowFlappyBird2
            setImage(yellowFlappyBird2);
        }
    }
    
    /**
     * 
     */
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
}
