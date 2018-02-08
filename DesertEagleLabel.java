import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DesertEagleLabel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DesertEagleLabel extends ShopLabels
{
    public DesertEagleLabel()
   {
       setImage (new GreenfootImage("Desert Eagle" , 30, Color.BLACK, Color.WHITE));
    }
    
    public void act() 
    {
        move();
    }   
    
     public void move()
    {
        DesertEagleButton deserteaglebutton = (DesertEagleButton) getWorld().getObjects(DesertEagleButton.class).get(0);  
        setLocation(deserteaglebutton.getX(), deserteaglebutton.getY()-120); 
    }
}
