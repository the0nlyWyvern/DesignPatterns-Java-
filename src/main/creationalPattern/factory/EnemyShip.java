package main.creationalPattern.factory;

public abstract class EnemyShip {
    private String name;
    private double amtDamage;

    public EnemyShip(String name, double amtDamage) {
        this.name = name;
        this.amtDamage = amtDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmtDamage() {
        return amtDamage;
    }

    public void setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }

    public void followHeroShip() {
        System.out.println(this.getName() + " is following the hero ship.");
    }

    public void displayEnemyShip() {
        System.out.println(this.getName() + " is being display on the screen.");
    }

    public void enemyShipShoots() {
        System.out.println(this.getName() + " attacks and does " + getAmtDamage());
    }
}
