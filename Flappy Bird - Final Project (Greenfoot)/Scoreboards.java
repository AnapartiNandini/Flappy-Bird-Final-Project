import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboards here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboards extends Actor
{
    private int points;
    private Font myFont = new Font("Comic Sans MS", true, false, 24);

    public Scoreboards()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setFont( myFont );
        img.drawString("Score: " + points, 5,25);
        setImage(img);
    }

    public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
        if(points < 3) 
        {
            img.drawString("Score: " + points, 5,25);              
        }    
    }
}
