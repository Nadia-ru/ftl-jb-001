package com.company.animals;

public class Bird extends Animal{
    protected Boolean flyModeActive = false;

    public Bird() {
        super();
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

    public Boolean getFlyModeActive() {
        return flyModeActive;
    }

    public void setFlyModeActive(Boolean flyModeActive) {
        this.flyModeActive = flyModeActive;
    }
}
