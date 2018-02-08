import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AK47Buton here.
 * 
 * @author (Eric Faltermeier) 
 * @version (a version number or a date)
 */
public class Ak47Button extends ShopButtons
{
    static int akCost = 3000;
    public void act() 
    {
        if(Greenfoot.mouseClicked(this) && Human.money >= akCost && Human.boughtAk == false)
        {
            Human.boughtAk = true;
            Human.money = Human.money -akCost;
        }
    }    
}
