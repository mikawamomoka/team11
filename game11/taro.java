import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class taro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class taro extends Actor
{
    /**
     * Act - do whatever the taro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int x = getX();
int y = getY();
if( Greenfoot.isKeyDown( "left" ) ){
   setLocation( x-1,y );
}
if( Greenfoot.isKeyDown( "right" ) ){
   setLocation( x+1,y );
}
if( Greenfoot.isKeyDown( "up" ) ){
   setLocation( x,y-1 );
}
if( Greenfoot.isKeyDown( "down" ) ){
   setLocation( x,y+1 );
}
Actor actor = getOneIntersectingObject(hata.class );
if( actor != null ){
    getWorld().removeObject( actor );
}
Actor actor2 = getOneIntersectingObject(jirai.class );
if( actor2 != null ){
    getWorld().removeObject( actor2 );
}
    }    
}
