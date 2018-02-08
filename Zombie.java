import greenfoot.*;

/**
 * I got the picture of a zombie from piq.codeus.net
 * This is the basic zombie in the game it constantly goes twords the human and can be taken out with a single shot
 * @author Eric Faltermeier 
 * @version 1/24/2018
 */
public class Zombie extends Enemy
{
    private int life;
    public Zombie()
    // This sets the scale of the image "ZombieRight"
    {       
        GreenfootImage myImage = getImage();
        int myNewWidth = (int)myImage.getWidth()/3;
        int myNewHeight = (int)myImage.getHeight()/3;
        myImage.scale(myNewWidth,myNewHeight);
        life = 1;
    }

    public void act()
    // This is where all of the code is ran
    {
        eatBrains();
        chase();
        die();
    }  

    public void chase()
    // This makes the zombie acively chase after the player 
    {
        if(Human.life > 0)
        {
            Human hooman = (Human) getWorld().getObjects(Human.class).get(0);  
            turnTowards(hooman.getX(), hooman.getY()); 
            move(1);
        }
    }

    public void eatBrains()
    // This makes it so if the zombie touches the player he takes a life away from them
    {
        if (isTouching (Human.class))
        {
            Human.life--;
        }
    }

    public void die()
    // This makes it so the zombie, instead of instantly dieing from a gunshot, it removes a life and if life is less than or equal to 0 it dies
    {
        if (isTouching (Bullet.class))
        {
            Bullet bullet = (Bullet) getWorld().getObjects(Bullet.class).get(0);
            getWorld().removeObject(bullet);
            life--;
        }

        if (life <= 0)
        {
            Human.money = Human.money +50;
            getWorld().removeObject(this);
            Bullet.killCount++;
        }
    }
}
