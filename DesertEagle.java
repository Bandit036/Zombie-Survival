import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a desert eagle aka the deagle it is a upgraded version of the default pistol, it does twice the damage 
 * 
 * @author Eric Faltermeier 
 * @version 12/14/2017
 */
public class DesertEagle extends Guns
{
    Human hooman;
    private static GreenfootImage rightImage= new GreenfootImage("DesertEagleRight.png");
    private static GreenfootImage leftImage= new GreenfootImage("DesertEagleLeft.png");
    
    public DesertEagle()
    {
        Human.fireRate = 40;
        Human.clipSize = 5;
        Human.clip = 5;
        Human.reloadTime = 190;
    }
    
    public void act() 
    {
        turn();
        move();
    }    

    public void turn()
    {
        if (hooman.direction == "a")
        {
            setImage(leftImage);
        }
        else if(hooman.direction == "d")
        {
            setImage(rightImage);
        }
    }

    public void move()
    {
        Human hooman = (Human) getWorld().getObjects(Human.class).get(0);            
        if (hooman.direction == "a" && hooman.life > 0)
        {
            setLocation(hooman.getX() +10, hooman.getY()); 
        }
        else if (hooman.direction == "d" && hooman.life > 0)
        {
            setLocation(hooman.getX() +10, hooman.getY()); 
        }
    }  
    
    public void penitrate()
    {
        
    }
}
