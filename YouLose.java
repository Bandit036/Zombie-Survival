import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a message that pops up whenever your character dies
 * 
 * @author Eric Faltermeier 
 * @version 2/5/2018
 */
public class YouLose extends Information
{
    public YouLose()
    {
        setImage (new GreenfootImage("You \n Lose", 500, Color.RED, Color.WHITE));
    }
    
    public void act() 
    {
        
    }    
}
