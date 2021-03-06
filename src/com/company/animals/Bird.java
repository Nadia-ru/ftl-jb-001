package com.company.animals;

public abstract class Bird extends Animal implements Flight{
    protected Boolean flyModeActive = false;

    public Bird() {
        super(MoveType.FLY);

    }

    public final void takeOff(){
        flyModeActive = true;
    }

    public final void landing(){
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
