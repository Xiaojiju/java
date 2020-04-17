package com.sladar.design.strategy;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("I can use knife");
    }
}
