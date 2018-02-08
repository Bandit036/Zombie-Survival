import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This tells the player the price of one bullet
 * 
 * @author Eric Faltermeier
 * @date 12/27/2017
 */
public class AmmoCost extends ShopLabels
{
    AmmoButton ammobutton;
    public AmmoCost()
    {
        setImage (new GreenfootImage("" + AmmoButton.AmmoCost, 30, Color.GREEN, Color.WHITE));
    }

    public void act() 
    {
        move();
    } 

    public void move()
    {
        AmmoButton ammobutton = (AmmoButton) getWorld().getObjects(AmmoButton.class).get(0); 
        setLocation(ammobutton.getX(),ammobutton.getY() -10); 
    }
}
