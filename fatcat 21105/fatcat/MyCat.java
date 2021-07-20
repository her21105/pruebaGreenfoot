import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
        //6-9
        //eat();
        //dance();
        //sleep(3);
        //10
        //shoutHooray();
        //dance();
        //eat();
        //wait(10);
        //walkLeft(5);
        //wait(10);
        //walkRight(10);
        //wait(10);
        //walkLeft(5);
        //wait(10);
        //sleep(3);
        //11
        //if(isSleepy() == true)
        //{
        //    sleep(3);
        //}
        //12
        //if(isBored() == true){
        //    dance();
        //}
        //13
        //if(isHungry() == true){
        //    eat();
        //}
        //14
        //if(isSleepy() == true){
        //    sleep(3);
        //    shoutHooray();
        //}else{
        //    shoutHooray();
        //}
        //15
        if(isAlone() == true){
            sleep(3);
            
        }else{
            shoutHooray();
        }
        //otra forma
        //if(hasCompany() == true){
        //    shoutHooray();
        //}else{
        //    sleep(3);
        //}
    }    
}
