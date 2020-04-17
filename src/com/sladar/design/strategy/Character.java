package com.sladar.design.strategy;
/**
 * @description
 * @author moyang
 * @email xiaojiju0811@163.com
 * @time 2020/1/8 16:38
 */
public class Character {

    private WeaponBehavior weaponBehavior;

    public Character(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void fight() {
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
