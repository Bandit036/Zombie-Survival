import greenfoot.*;
import javax.swing.JOptionPane;
/**
 * You are the Human, the last survivor of the zombie apocalypse. In This level you are at your home camp and you are under attack! Fend off the impending horde for as long as possible and mabye survive for another day 
 * 
 * @author Eric Faltermeier
 * @date 1/24/2018
 * 
 * I got the picure of grass from Textures101.com
 */
public class ZombieWorld extends World
{
    private Shop shop;
    public ZombieWorld()
    // This is the act method, where all of the code is actually run
    {    
        super(1600, 900, 1);
        showInstructions();
        prepare();
        shop = new Shop(this);
    }

    public void prepare()
    // This is where all the objects are added, a human, a test variable, 5 zombies on the left side, and 5 zombies on the right side
    {
        addObject(new TestVariable(), 800, 450);
        addObject(new Human(), 800, 450);
        addObject(new BulletCount(), 1530, 20);
        addObject(new Money(), 1417, 20); 
        for(int c = 0; c < 5; c++) 
        {
            int x = getWidth();
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(new Zombie(), x, y);
        }
        for(int c = 0; c < 5; c++) 
        {
            int x = 0;
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(new Zombie(), x, y);
        }

    }

    public void showInstructions()
    // At the beginning of the game this shows up, it tells the player the goal and how to play
    {
        JOptionPane.showMessageDialog(null, "You are the last Human alive and you have to survive!\nUse WSAD to move around and space bar to shoot\n use I to open the shop");
    }

    public Shop getShop()
    {
        return shop;
    }
}

