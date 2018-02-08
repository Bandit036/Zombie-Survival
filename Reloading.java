import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This tells the player when they are relaodin
 * 
 * @author Eric Faltermeier 
 * @version 1/24/2018
 */
public class Reloading extends Information
{
    Human hooman;
    public void act()
    // This is where the image is set and all of the code is actually ran
    {
        setImage (new GreenfootImage("Reloading ", 30, Color.BLACK, Color.WHITE));
        move();
    }   

    public void move()
    // This sets the location of the reloading sign to above where ever the human is 
    {
        if (Human.life > 0)
        {
            Human hooman = (Human) getWorld().getObjects(Human.class).get(0);  
            setLocation(hooman.getX()+10, hooman.getY()-80); 
        }
    }
}
