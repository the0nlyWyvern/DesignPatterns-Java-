package main.factory;

import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String[] args) {

        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of ship? (U / B / R)");

        if (userInput.hasNextLine()) {
            String typeOfShipe = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShipe);
        }

        if (theEnemy != null)
            doStuffEnemy(theEnemy);
        else
            System.out.println("Wrong type!!!");
    }

    private static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
