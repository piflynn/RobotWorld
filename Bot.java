import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TuxBot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bot extends Actor {
    private int speed;
    private int batteryLevel;
    private int count;
    
     public Bot() {
        speed = 5;
        batteryLevel = 100;
        count = 0;
    }
    
    public Bot(int speed, int batteryLevel) {
        this.speed = speed;
        this.batteryLevel = batteryLevel;
        count = 0;
    }
    
    /**
         * Act - do whatever the TuxBot wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
    public void act() {
        System.out.println(this);
        
        if(batteryLevel > 0) {
            if(Greenfoot.isKeyDown("space")) {
                move(speed);
                count++;
                System.out.println(count);
                if(count % 10 == 0) {
                    
                    batteryLevel--;
                }
                
            }
            if(Greenfoot.isKeyDown("left")) {
                turn(-5);
            }
            if(Greenfoot.isKeyDown("right")) {
                turn(5);
            }
            if(isTouching(Juice.class)) {
                    removeTouching(Juice.class);
                    batteryLevel += 10;
                    getWorld().addObject(new Juice(), (int)(Math.random()*600) , (int)(Math.random()*400));
                }
            
        }    
        
    }
    
    public String toString() {
        return "Battery: " + battLevelString() + " " + batteryLevel + "%" +
                "\nSpeed: " + speed + 
                "\nHeading: " + directionString();
    }
        
    private String battLevelString() {
        if(batteryLevel == 100) {
            
            return "||||||||||||||||";
        }
        else if(batteryLevel > 75) {
            return "||||||||||||||";
        }
        else if(batteryLevel == 75) {
            return "||||||||||||";
        }
        else if(batteryLevel > 50) {
            return "||||||||||";
        }
        else if(batteryLevel == 50) {
            return "||||||||";
        }
        else if(batteryLevel > 25) {
            return "||||||";
        }
        else if( batteryLevel == 25) {
            return "||||";
        }
        else if(batteryLevel > 0) {
            return "LowBatt!!";
        }
        else {
            return "Charge Battery!!!";
        }
    }
    
    private String directionString() {
        if(getRotation() == 0) {
            return "E";
        }
        else if(getRotation() > 0 && getRotation() < 90) {
            return "SE";
        }
        else if(getRotation() == 90) {
            return "S";
        }
        else if(getRotation() > 90 && getRotation() < 180) {
            return "SW";
        }
        else if(getRotation() == 180) {
            return "W";
        }
        else if(getRotation() > 180 && getRotation() < 270) {
            return "NW";
        }
        else if(getRotation() == 270) {
            return "N";
        }
        else if(getRotation() > 270 && getRotation() < 360) {
            return "NE";
        }
        else {
            return "...";
        }
    }
    
} 