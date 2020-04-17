package com.sladar.design.strategy;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("the King can use sword");
    }
}
