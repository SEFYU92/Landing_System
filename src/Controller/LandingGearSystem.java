/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Door;
import Model.Lever;
import Model.Light;
import Model.Position;
import Model.Wheel;
import View.SystemMonitor;

/**
 *
 * @author Youssef
 */
public class LandingGearSystem {

    /*
     * Main Method
     */
    public static void main(String[] args) {

        // Create Lever
        Lever lever = new Lever();

        // Create Wheels
        Wheel[] wheels = new Wheel[3];

        wheels[0] = new Wheel(Position.FRONT);
        wheels[1] = new Wheel(Position.BACK_LEFT);
        wheels[2] = new Wheel(Position.BACK_RIGHT);

        // Create Doors
        Door[] doors = new Door[3];
        doors[0] = new Door(Position.FRONT);
        doors[1] = new Door(Position.BACK_LEFT);
        doors[2] = new Door(Position.BACK_RIGHT);

        // Create Lights
        Light light = new Light();

        // Add observers to lever
        lever.addObserver(wheels[0]);
        lever.addObserver(wheels[1]);
        lever.addObserver(wheels[2]);

        lever.addObserver(doors[0]);
        lever.addObserver(doors[1]);
        lever.addObserver(doors[2]);

        lever.addObserver(light);

        // Launch GUI Interface
        SystemMonitor monitor = new SystemMonitor(lever, wheels, doors, light);

    }
}
