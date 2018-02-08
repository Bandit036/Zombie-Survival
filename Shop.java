import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is where the player can buy new weapons
 * 
 * I got this picure from Hayward Smart Architects.co.uk
 * 
 * @author Eric Faltermeier
 * @version 1/24/2018
 */
public class Shop extends World
{
    private World gameWorld;
    public Shop(World zombieWorld)
    //This is basically just the act method that runs all of the code
    {    
        super(1600, 900, 1);
        prepare();
        gameWorld = zombieWorld;        
    }

    public void prepare()
    // This is where all of the items are put into the world
    {
        addObject(new Welcome(), getWidth()/2, 800);
        addObject(new Ak47Button(), getWidth()/2, getHeight()/2);
        addObject(new Ak47Label(), getWidth()/2 +100, getHeight()/2);
        addObject(new DesertEagleButton(), getWidth()/2 -200, getHeight()/2);
        addObject(new DesertEagleLabel(), 0, 0);
        addObject(new AmmoButton(), getWidth()/2 +275, getHeight()/2);  
        addObject(new AmmoCost(), 0, 0);
        addObject(new Ak47Cost(), 0, 0);
        addObject(new BulletCount(), 1530, 20);
        addObject(new Money(), 1417, 20);
        addObject(new Ammo(), 0, 0);
        addObject(new Exit(), 50, 40);
    }

    public void resumeGame()
    // This is called every time the player wants to change the world
    {
        Greenfoot.setWorld(gameWorld);
    }
}