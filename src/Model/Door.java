/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Nicolas_2
 */
public class Door implements Observer {

    private DoorState state;
    private final Position position;

    public Door(Position position) {
        this.position = position;
        close();
    }

    private void open() {
        this.state = DoorState.OPEN;
    }

    private void close() {
        this.state = DoorState.CLOSE;
    }

    @Override
    public void update(Observable obs, Object arg) {

        if (obs instanceof Lever) {
            if (arg instanceof ManoeuvreState) {
                ManoeuvreState manoeuvreState = (ManoeuvreState) arg;

                if (manoeuvreState == ManoeuvreState.START_PULL) {
                    move();
                } else if (manoeuvreState == ManoeuvreState.END_PULL) {
                    open();
                } else if (manoeuvreState == ManoeuvreState.START_PUSH) {
                    move();
                } else if (manoeuvreState == ManoeuvreState.END_PUSH) {
                    close();
                }
            }
        }
    }

    public DoorState getState() {
        return this.state;
    }

    private void move() {
        this.state = DoorState.MOVING;
    }
}
