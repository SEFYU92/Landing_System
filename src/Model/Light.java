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
public class Light implements Observer {

    private LightState state;

    public Light() {
        state = LightState.OFF;
    }

    private void greenLight() {
        this.state = LightState.GREEN;
    }

    private void redLight() {
        this.state = LightState.RED;
    }

    private void orangeLight() {
        this.state = LightState.ORANGE;
    }

    private void offLight() {
        this.state = LightState.OFF;
    }

    @Override
    public void update(Observable obs, Object arg) {

        if (obs instanceof Lever) {
            if (arg instanceof ManoeuvreState) {
                ManoeuvreState manoeuvreState = (ManoeuvreState) arg;

                if (manoeuvreState == ManoeuvreState.START_PULL) {
                    orangeLight();
                } else if (manoeuvreState == ManoeuvreState.END_PULL) {
                    greenLight();
                } else if (manoeuvreState == ManoeuvreState.START_PUSH) {
                    orangeLight();
                } else if (manoeuvreState == ManoeuvreState.END_PUSH) {
                    offLight();
                }
            } else {
                redLight();
            }
        }
    }

    public LightState getState() {
        return state;
    }
}
