import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ak47Cost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ak47Cost extends ShopLabels
{
   Ak47Button ak47button;
    public Ak47Cost()
    {
        setImage (new GreenfootImage("" + Ak47Button.akCost, 30, Color.GREEN, Color.WHITE));
    }

    public void act() 
    {
        move();
    } 

    public void move()
    {
        Ak47Button ak47button = (Ak47Button) getWorld().getObjects(Ak47Button.class).get(0); 
        setLocation(ak47button.getX(),ak47button.getY() -10); 
    }
}
