package org.fasttrackit;

import java.security.KeyStore;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Car firstCar = new Car();
        firstCar.name = "B1";
        firstCar.color = "blue";
        firstCar.doorCount = 5;
        firstCar.mileage = 10.50;
        firstCar.running = true;
        firstCar.totalKm = 300000;
        firstCar.degreePerformance = 4;
        firstCar.degreeOfUsage = 1;
        firstCar.spoilers = true;
        firstCar.typeOfTires = "all season tires";

        Engine firstEngine = new Engine();
        firstEngine.manufacturer = "MAN";
        firstEngine.status = "satisfactory";
        firstEngine.degreeOfPerformance = 2;
        firstEngine.numberOfCylinders = 4;

        Obstacles firstObstacles = new Obstacles();
        firstObstacles.name = "Bush";
        firstObstacles.type = "nature";
        firstObstacles.degreeOfDanger = 1;
        firstObstacles.typeOfMalfunction = "damaged rears";

        Roads firstRoad = new Roads();
        firstRoad.name = "Transylvania";
        firstRoad.degreeOfDificulty = 8;
        firstRoad.season = "winter";
        firstRoad.maxTimeOfTheRace = 12.5;
        firstRoad.maxPlayers = 8;
        firstRoad.respawnAvailable = false;


    }
}
