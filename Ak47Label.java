import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ak47Label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ak47Label extends ShopLabels
{
   public Ak47Label()
   {
       setImage (new GreenfootImage("Ak47" , 30, Color.BLACK, Color.WHITE));
    }
    
    public void act() 
    {
        move();
    }   
    
     public void move()
    {
        Ak47Button ak47button = (Ak47Button) getWorld().getObjects(Ak47Button.class).get(0);  
        setLocation(ak47button.getX(), ak47button.getY()-120); 
    }
}
