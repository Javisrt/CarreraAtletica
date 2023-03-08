package com.mycompany.race;


public class Runner {
    private String name;
    private int speed = (int)(Math.random()*30);

    public Runner(String name) {
        this.name = name;
    }
    
    //Sobrecarga de constructores
    public Runner() {
        
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    
}

