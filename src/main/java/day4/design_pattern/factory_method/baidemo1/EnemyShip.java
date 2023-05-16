package day4.design_pattern.factory_method.baitap.baidemo1;

public interface EnemyShip {
    String name();
    double amtDamage();

    public abstract void followHeroShip();
    public abstract void displayEnemyShip();
    public abstract void enemyShipShoots();
    public abstract void setDamage();
}
