import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a button that allows you to buy a Desert Eagle
 * 
 * @author Eric Faltermeier 
 * @version 1.0
 */
public class DesertEagleButton extends ShopButtons
{    
    static int DeagleCost = 700;
    public void act() 
    {
        if(Greenfoot.mouseClicked(this) && Human.money >= DeagleCost && Human.boughtDeagle == false)
        {
            Human.boughtDeagle = true;
            Human.money = Human.money -DeagleCost;
        }
    }    
}
