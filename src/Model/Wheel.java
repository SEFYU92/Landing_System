/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Youssef
 */
public class Wheel {
    private boolean state;
    public Wheel()
    {
        state = false;
    }
    public void deploy(){
        this.state = true;
    }
    public void retract(){
        this.state = false;
    }
}
