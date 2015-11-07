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
public class Lever extends Observable {

    private LeverState state;

    public Lever() {
        state = LeverState.UP;
    }

    public void startPull(){
        state = LeverState.DOWN;
        setChanged();
        notifyObservers(ManoeuvreState.START_PULL);
    }
    
    public void endPull(){
        state = LeverState.DOWN;
        setChanged();
        notifyObservers(ManoeuvreState.END_PULL);
    }
    
    public void startPush(){
        state = LeverState.UP;
        setChanged();
        notifyObservers(ManoeuvreState.START_PUSH);
    }
    
    public void endPush(){
        state = LeverState.UP;
        setChanged();
        notifyObservers(ManoeuvreState.END_PUSH);
    }
            
    public void pull() {
        state = LeverState.DOWN;
        System.out.println("Lever " + state);
        setChanged();
        notifyObservers(this.state);
    }

    public void push() {
        state = LeverState.UP;
        System.out.println("Lever " + state);
        setChanged();
        notifyObservers(this.state);
    }

    public LeverState getState() {
        return state;
    }
}
