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
    private GreenfootImage blueFlappyBird1 = new GreenfootImage(" Flappy_image_1_BLUE.png");
    private GreenfootImage greenFlappyBird1 = new GreenfootImage("Flappy_image_1_GREEN.png");
    private GreenfootImage redFlappyBird1 = new GreenfootImage("Flappy_image_1_RED.png");
    private GreenfootImage yellowFlappyBird1 = new GreenfootImage("Flappy_image_1_YELLOW");
    private GreenfootImage blueFlappyBird2 = new GreenfootImage(" Flappy_image_2_BLUE.png");
    private GreenfootImage greenFlappyBird2 = new GreenfootImage("Flappy_image_2_GREEN.png");
    private GreenfootImage redFlappyBird2 = new GreenfootImage("Flappy_image_2_RED.png");
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
        if( imageNumber == 0)
        {
            //Sets the image to blueFlappyBird1
            setImage(blueFlappyBird1);
        }
                
        //Otherwise, if imageNumber is equal to 1...
        else if( imageNumber == 1)
        {
            //Sets the image to greenFlappyBird1
            setImage(greenFlappyBird1);
        }
        
        //Otherwise, if imageNumber is equal to 2...
        else if( imageNumber == 2 )
        {
            //Sets the image to redFlappyBird1
            setImage(redFlappyBird1);
        }
        
        //Otherwise,if imageNumber is equal to 3...
        else if( imageNumber == 3 )
        {
            //Sets the image to yellowFlappyBird1
            setImage(yellowFlappyBird1);
        }
        
        //Otherwise,If imageNumber is equal to 4...
        if( imageNumber == 4)
        {
            //Sets the image to blueFlappyBird2
            setImage(blueFlappyBird2);
        }
                
        //Otherwise, if imageNumber is equal to 5...
        else if( imageNumber == 5)
        {
            //Sets the image to greenFlappyBird2
            setImage(greenFlappyBird2);
        }
        
        //Otherwise, if imageNumber is equal to 6...
        else if( imageNumber == 6 )
        {
            //Sets the image to redFlappyBird2
            setImage(redFlappyBird2);
        }
        
        //Otherwise,if imageNumber is equal to 7...
        else if( imageNumber == 7 )
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
