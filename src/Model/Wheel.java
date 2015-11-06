/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Observable;

/**
 *
 * @author Nicolas_2
 */
public class Wheel extends Observable {

    private WheelState state;
    private Position position;
    
    public Wheel(Position position){
        this.position = position;
    }

    public void deploy() {
        this.state = WheelState.DEPLOYED;
        setChanged();
        notifyObservers(this.state);
    }

    public void retract() {
        this.state = WheelState.RETRACTED;
        setChanged();
        notifyObservers(this.state);
    }
}
