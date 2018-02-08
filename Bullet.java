 import greenfoot.*;

/**
 * This is a bullet, it does what you would expect it to do, when it hits a zombie it kills it
 * 
 * I got this picture of a bullet from pixelart.com
 * 
 * @author Eric Faltermeier 
 * @version 12/8/2017
 */
public class Bullet extends Actor
{
    public int humanRotation;  
    static int killCount;
    private int damageDelt;
    private int damage;
    private int penitrated; 
    Human hooman;
    public Bullet(Human hooman)
    //This is a constructor for bullet it resizes it, defines what a hooman is, and it makes the bullet go in the right direction
    {       
        GreenfootImage myImage = getImage();
        int myNewWidth = (int)myImage.getWidth()/4;
        int myNewHeight = (int)myImage.getHeight()/4;
        myImage.scale(myNewWidth,myNewHeight);
        this.hooman = hooman;
        if (hooman.direction == "a")
        {
            setRotation(180);
        }
        else if(hooman.direction == "d")
        {
            setRotation(0);
        }
    }

    public void act() 
    {
        penetrate();
        checkForEdge();          
        move(4);
    } 

    public void checkForEdge()
    //This makes it so when the bullet hits the edge it removes its self
    {
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }       
    } 

    public void penetrate()
    // This should make it so the bullet can penitrate if using the deagle
    {
        if (Bullet.class != null && isTouching(Zombie.class))
        {
            damage++;
        }
    }
}
