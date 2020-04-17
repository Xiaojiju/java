package com.sladar.design.strategy;

public class BowAndArrowBeahavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("the King can use bow and arrow");
    }
}
