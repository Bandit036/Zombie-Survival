import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is where I can test to see if a variable is working correctly
 * 
 * @author Eric Faltermeier 
 * @version 12/9/2017
 */
public class TestVariable extends Information
{
    Zombie zombie;
    Bullet bullet;
    Human human;
    public void act() 
    // This just makes the image
    {
        setImage (new GreenfootImage("" +human.reload, 30, Color.BLACK, Color.WHITE));
    }    
}
