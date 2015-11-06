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
public class Door extends Observable{

    private DoorState state;
    private Position position;
    
    public Door(Position position){
        this.position = position;
    }
    
    public void open() {
        this.state = DoorState.OPEN;
        setChanged();
        notifyObservers(this.state);
    }

    public void close() {
        this.state = DoorState.CLOSE;
        setChanged();
        notifyObservers(this.state);
    }
}
