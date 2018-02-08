import greenfoot.*;

/**
 * I got the picture of a zombie from piq.codeus.net
 * 
 * This is no regular zombie, it is a hard zombie it has twice the health of a regular zombie
 * 
 * @version 1/24/2018
 */
public class ZombieHard extends Enemy
{
    private int life;
    
    public ZombieHard()
    // This resizes the image and sets the life of it to two instead of the normal one
    {       
        GreenfootImage myImage = getImage();
        int myNewWidth = (int)myImage.getWidth()/3;
        int myNewHeight = (int)myImage.getHeight()/3;
        myImage.scale(myNewWidth,myNewHeight);
        life = 2;
    }

    public void act() 
    // This is where arll of the code is ran
    {
        eatBrains();
        chase();
        die();
    }  

    public void chase()
    // This makes the HardZombie actively chase after the player
    {
        if (Human.life > 0)
        {
            Human human = (Human) getWorld().getObjects(Human.class).get(0);  
            turnTowards(human.getX(), human.getY()); 
            move(1);
        }
    }

    public void eatBrains()
    // This makes it so if the zombie touches the player he removes one life from him
    {
        if (isTouching (Human.class))
        {
            Human.life--;            
        }
    }

    public void die()
    // This makes it so the zombie, instead of instantly dieing from a gunshot, it removes a life and if life is less than or equal to 0 it 
    //dies it also adds money and counts the kills
    {
        if (isTouching (Bullet.class))
        {
            Bullet bullet = (Bullet) getWorld().getObjects(Bullet.class).get(0);
            life--;    
            getWorld().removeObject(bullet);
        }

        if (life <= 0)
        {
            Human.money = Human.money +100;
            getWorld().removeObject(this);
            Bullet.killCount++;
        }
    }
}

