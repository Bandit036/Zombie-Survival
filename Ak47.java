import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a Ak47 it shoots fast and is a very good gun
 * 
 * @author Eric Faltermeier 
 * @version 12/13/2017
 */
public class Ak47 extends Guns
{
    Human hooman;
    private static GreenfootImage rightImage= new GreenfootImage("Ak47Right.png");
    private static GreenfootImage leftImage= new GreenfootImage("Ak47Left.png");    
    public Ak47()
    {
        Human.fireRate = 17;
        Human.clipSize = 10;
        Human.clip = 10;
        Human.reloadTime = 200;
        if (hooman.direction == "a" && hooman.life > 0)
        {
            setLocation (hooman.getX() -10, hooman.getY() -4); 
        }
        else if (hooman.direction == "d" && hooman.life > 0)
        {
            setLocation(hooman.getX() +10, hooman.getY() -4); 
        }
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
            setLocation(hooman.getX() -10, hooman.getY() -4); 
        }
        else if (hooman.direction == "d" && hooman.life > 0)
        {
            setLocation(hooman.getX() +10, hooman.getY() -4); 
        }
    }
}
