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
public class Wheel implements Observer {

    private WheelState state;
    private final Position position;

    public Wheel(Position position) {
        this.position = position;
        retract();
    }

    private void deploy() {
        this.state = WheelState.DEPLOYED;
    }

    private void retract() {
        this.state = WheelState.RETRACTED;
    }
    
    private void move() {
        this.state = WheelState.MOVING;
    }

    @Override
    public void update(Observable obs, Object arg) {

        if (obs instanceof Lever) {
            if (arg instanceof ManoeuvreState) {
                ManoeuvreState manoeuvreState = (ManoeuvreState) arg;

                if (manoeuvreState == ManoeuvreState.START_PULL) {
                    move();
                } else if (manoeuvreState == ManoeuvreState.END_PULL) {
                    deploy();
                } else if (manoeuvreState == ManoeuvreState.START_PUSH) {
                    move();
                } else if (manoeuvreState == ManoeuvreState.END_PUSH) {
                    retract();
                }
            } 
        }
    }

    public WheelState getState() {
        return state;
    }
}
