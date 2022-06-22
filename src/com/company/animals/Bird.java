package com.company.animals;

public class Bird extends Animal{
    protected Boolean flyModeActive = false;

    public Bird() {
        this.canFly = true;
    }

    public void takeOff(){
        flyModeActive = true;
    }

    public void landing(){
        flyModeActive = false;
    }

    public void isTheBirdFlying(){
        System.out.println(flyModeActive ? "Duck mode fly - yes" : "Duck mode fly - no");
    }
}
