import greenfoot.*;
import javax.swing.*;
/**
 * This is the human, the last survivor on earth
 * 
 * I got this picture from openclipart.org
 * 
 * @author Eric Faltermeier 
 * @version 12/6/2017
 */
public class Human extends Actor
{
    private static GreenfootImage rightImage= new GreenfootImage("HumanRight.gif");
    private static GreenfootImage leftImage= new GreenfootImage("HumanLeft.gif");
    static byte fireRate;
    static byte gunDelay;
    static int totalAmmo;
    static byte clip;
    static byte clipSize;
    static int reload;
    static int reloadTime;
    static int money;
    static byte waveCount;
    static byte life;  
    static String direction;
    static boolean spawnedDeagle;
    static boolean boughtDeagle;
    static boolean spawnedAk;
    static boolean boughtAk;
    static boolean isReloading;
    static int reloaded;
    Reloading reloading;
    DesertEagle deserteagle;
    public Human()
    // This resets the variables every time you reset the game otherwise they will stay the same and that isn't good
    {
        fireRate = 30;
        gunDelay = 0;
        clip = 5;
        clipSize = 5;
        totalAmmo = 30;
        reload = 0;
        reloadTime = 150;
        direction = null;
        Bullet.killCount = 0;
        waveCount = 1;
        money = 0;
        life = 1;       
        spawnedAk = false;
        boughtAk = false;
        isReloading = false;
        reloaded = 0;
    }

    public void act() 
    {
        gunMechanics();
        checkForGun();
        controls();
        addWaves();
        die();        
        //isReloading();
    }

    public void controls()
    // This is where the character is controlled,  you use wasd to move, space bar to shoot, p for a quick stop, and i to open the shop
    {
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() +2);
        }

        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() -2);
        }

        if (Greenfoot.isKeyDown("a"))
        {
            setImage(leftImage);
            move(-2);
            direction = "a";
        }

        if (Greenfoot.isKeyDown("d"))
        {
            setImage(rightImage);           
            move(2); 
            direction = "d";
        }

        if (Greenfoot.isKeyDown("SPACE") && gunDelay == 0 && clip > 0 && totalAmmo >= 1)
        {
            int x = getX();
            int y = getY();
            getWorld().addObject(new Bullet(this), x, y);
            gunDelay = fireRate;
            clip--;
            totalAmmo--;
            if(clip == 0)
            {
                reload = reloadTime;
            }
        }

        if (Greenfoot.isKeyDown("p"))
        {
            Greenfoot.stop();
        }

        if(Greenfoot.isKeyDown("i"))
        {
            Greenfoot.setWorld(((ZombieWorld)getWorld()).getShop());
        }

        if (Greenfoot.isKeyDown("m"))
        {
            money = money +1000;
        }
        
        
    }

    public void addWaves()
    // Once the human has killed 9 zombies this adds a second wave of zombies 5 on the left and 5 on the left
    {
        if(Bullet.killCount == 9 && waveCount == 1)
        {
            waveCount++;
            for(int c = 0; c < 5; c++) 
            {
                int x = getWorld().getWidth();
                int y = Greenfoot.getRandomNumber(getWorld().getHeight());
                getWorld().addObject(new Zombie(), x, y);
            }
            for(int c = 0; c < 5; c++) 
            {
                int x = 0;
                int y = Greenfoot.getRandomNumber(getWorld().getHeight());
                getWorld().addObject(new Zombie(), x, y);
            }            
        }

        if(Bullet.killCount == 17 && waveCount == 2)
        {
            waveCount++;
            for(int c = 0; c < 3; c++) 
            {
                int x = getWorld().getWidth();
                int y = Greenfoot.getRandomNumber(getWorld().getHeight());
                getWorld().addObject(new ZombieHard(), x, y);
            }
            for(int c = 0; c < 3; c++) 
            {
                int x = 0;
                int y = Greenfoot.getRandomNumber(getWorld().getHeight());
                getWorld().addObject(new ZombieHard(), x, y);
            }            
        }
    }

    public void gunMechanics()
    // This is where the rest of the gun mechanics are held it makes the gun not so over powered
    {
        if(gunDelay > 0)
        {
            gunDelay--;
        }
        if(reload > 0)
        {
            reload--;
        }
        else if(reload == 0 && clip == 0)
        {
            clip = clipSize;
        } 
    }       

    public void die()
    // This makes it so if life = 0 then the human dies
    {
        if (life == 0)
        {
            getWorld().addObject(new YouLose(), getWorld().getWidth() /2, getWorld().getHeight() /2);
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }   

    public void isReloading()
    // This adds a indicator that you are reloading when your ammo in clip = 0
    {         
        //if(clip > 0 && Human.life > 0)
        //{ 
        //getWorld().removeObject(reloading);
        //reloaded = 0;
        //}

        //if(clip == 0 && reloaded == 0)
        //{
        // getWorld().addObject(new Reloading(), getX(), getY());
        //reloaded = 1;
        //}
    }

    public void checkForGun()
    // This is where the guns are spawned in
    {
        if(boughtAk == true && spawnedAk == false)
        {
            getWorld().addObject (new Ak47(), getX(), getY());
            spawnedAk = true;
        }

        if(boughtDeagle == true && spawnedDeagle == false)
        {
            getWorld().addObject(new DesertEagle(), getX(), getY());
            spawnedDeagle = true;
        }

        if(boughtDeagle == true && boughtAk == true)
        {
            getWorld().removeObject(deserteagle);
        }
    }

}

