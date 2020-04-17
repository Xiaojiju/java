package com.sladar.design.strategy;

public class test {

    public static void main(String[] args) {
        Character king = new King(new SwordBehavior());
        // 国王使用剑
        king.fight();
        // 国王切换背包，使用弓箭
        king.setWeaponBehavior(new BowAndArrowBeahavior());
        king.fight();
        Character queen = new Queen(new KnifeBehavior());
        queen.fight();
    }
}
