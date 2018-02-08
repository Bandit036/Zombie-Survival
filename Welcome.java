import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a message at the top of the shop that says welcome
 * 
 * @author Eric Faltermeier 
 * @version 12/14/2017
 */
public class Welcome extends ShopStuff
{
    public void act() 
    {
        setImage (new GreenfootImage("Welcome to the Shop!" , 70, Color.BLACK, Color.WHITE));
    }    
}
