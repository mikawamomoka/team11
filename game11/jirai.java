import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jirai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jirai extends Actor
{
    /**
     * Act - do whatever the jirai wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        setLocation(x, y + 4);
        if ( isAtEdge() ){
            getWorld().removeObject ( this );
        }
    }    
}
