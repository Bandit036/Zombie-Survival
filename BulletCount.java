import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This tells you how many bullets you have left
 * 
 * @author Eric Faltermeier 
 * @version 1/24/2018
 */
public class BulletCount extends Information
{

    public void act() 
    // This sets the image that tells you how many bullets you have left
    {
        setImage (new GreenfootImage("Ammo \n" + Human.totalAmmo , 30, Color.BLACK, Color.WHITE));
    }    
}
