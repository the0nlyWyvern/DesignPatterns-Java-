package main.factory;

import java.util.Optional;

public class EnemyShipFactory {
    public Optional<EnemyShip> makeEnemyShip(String newShipType) {
        EnemyShip newShip = null;

        if (newShipType.equalsIgnoreCase("U")) {
            return Optional.of(new UFOEnemyShip());
        } else if (newShipType.equalsIgnoreCase("R")) {
            return Optional.of(new RocketEnemyShip());
        } else if (newShipType.equalsIgnoreCase("B")) {
            return Optional.of(new BigUFOEnemyShip());
        } else
            return null;
    }
}
