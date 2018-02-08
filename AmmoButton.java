import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a button that if pressed costs 80$ but gives you more ammo
 * 
 * @author Eric Faltermeier 
 * @version 12/15/2017
 */
public class AmmoButton extends ShopButtons
{
    static int AmmoCost = 80;
    public void act() 
    {
        if(Greenfoot.mouseClicked(this) && Human.money >= AmmoCost)
        {
            Human.totalAmmo++;
            Human.money = Human.money -AmmoCost;
        }
    }    
}
