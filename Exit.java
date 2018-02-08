import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a exit thing if clicked it goes back to the regular world
 * 
 * I got this picure from freeiconspng.com
 * 
 * @author Eric Faltermier
 * @version 12/15/2017
 */
public class Exit extends ShopStuff
{
    public Exit()
    {
        GreenfootImage myImage = getImage();
        int myNewWidth = (int)myImage.getWidth()/3;
        int myNewHeight = (int)myImage.getHeight()/3;
        myImage.scale(myNewWidth,myNewHeight);
    }

    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            ((Shop)getWorld()).resumeGame();
        }
    }    
}
