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
        Actor actor = getOneIntersectingObject( jirai.class );
             if( actor != null ){
                 // TARO とぶつかった時の処理を書く
                }
    }    
}
