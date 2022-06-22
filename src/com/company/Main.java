package com.company;

import com.company.animals.Cat;
import com.company.animals.Dog;
import com.company.animals.Duck;

public class Main
{
    public static void main(String[] args)
    {
//        HelloWorld.run();
//        POJO.run();
//
//
//        Cat catVar = new Cat();
//        catVar.voice();
//        Cat barsik = new Cat();
//        com.company.L004.Cat catL004 = new com.company.L004.Cat();
//        catL004.voice();

        Cat cat = new Cat("Barsik", 2);
        System.out.println(cat.jumpHeight());

        cat.voice();
        Dog dog = new Dog();

        dog.goToStick(14);
        dog.whereTheDog();

        dog.goToStick(20);
        dog.whereTheDog();

        dog.goToStick(5);
        dog.whereTheDog();

        dog.voice();
        Dog homeless = Dog.ofHomeless(100);
        homeless.voice();

        Duck duck = new Duck();
        duck.voice();
        duck.takeOff();
        duck.isTheBirdFlying();
        duck.showSpeed();
        duck.landing();
        duck.isTheBirdFlying();
        duck.showSpeed();
    }
}
