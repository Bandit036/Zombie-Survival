import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This tells the player how much money they have, money is awarded for every kill
 * 
 * @author Eric Faltermeier 
 * @version 1/24/2018
 */
public class Money extends Information
{    
    public Money()
    
    {
        
    }    
    
    public void act() 
    // This sets the image for a counter of how much money you have
    {
        setImage (new GreenfootImage("Money \n" + Human.money, 30, Color.GREEN, Color.WHITE));
    }    
}
