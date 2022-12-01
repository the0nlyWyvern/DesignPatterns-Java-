package main.creationalPattern.factory;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EnemyShipFactory shipFactory = new EnemyShipFactory();
        Optional<EnemyShip> theEnemy = null;

        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of ship? (U / B / R)");

        if (userInput.hasNextLine()) {
            String typeOfShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }

        if (theEnemy.isPresent())
            doStuffEnemy(theEnemy.get());
        else
            System.out.println("Wrong type!!!");
    }

    private static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
