import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This tells you which button gives you ammo
 * 
 * @author Eric Faltermeier
 * @version 12/15/2017
 */
public class Ammo extends ShopLabels
{
    public Ammo()
    {
        setImage (new GreenfootImage("Ammo" , 30, Color.BLACK, Color.WHITE));
    }

    public void act() 
    {       
        move();
    }

    public void move()
    {
        AmmoButton ammobutton= (AmmoButton) getWorld().getObjects(AmmoButton.class).get(0);  
        setLocation(ammobutton.getX(), ammobutton.getY()-120); 
    }
}

