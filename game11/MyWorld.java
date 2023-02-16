import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MyWorld extends World
{
    

    private int timecount = 1000;

     GreenfootImage back;
    GreenfootImage back_flop;
    int back_dx = -5; // スクロール速度(マイナスにすると左から右)
    int back_x = 0;
    int back_width;
    boolean flop = false;
    


        timecount--;
        showText(""+timecount, 50,50 );
        if(timecount==0){
            showText("TIME OVER",400,200 );
            Greenfoot.stop();
        }



 
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 450, 1); 
        addObject( new taro(),100,100);
       // addObject( new jirai(),200,100);
       //addObject( new num1(),300,100);
       back = new GreenfootImage( "./images/chisou_mizu.png" );
        back_flop = new GreenfootImage( "./images/chisou_hanten.png" );
        back_width = back.getWidth();
        
        int A = 0;
        int B = 1200;
        int x = A + (int)(Math.random()*((B-A)+1));
        //addObject( new peach(), x, 150);
        addObject( new set(), 0, 0);


        
       
      

            setActOrder(jirai.class,hata.class, taro.class);
    

    setActOrder(jirai.class, num1.class, taro.class);
    
}
    
    

    public void act()
    {
        back_x += back_dx;
        if( back_x > 0){
            back_x -= back_width;
            flop = !flop;
        }
        if( back_x < -back_width ){
            back_x += back_width;
            flop = !flop;
        }
        getBackground().drawImage( flop ? back_flop : back, back_x, 0 );
        getBackground().drawImage( flop ? back : back_flop, back_x+back_width, 0 );

        showText( "back_x : "+ back_x, 100, 10 );
    }
    
}





 



     

    