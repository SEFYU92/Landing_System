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
public class Door {
    private boolean state;
    public Door()
    {
        state = false;
    }
    public void open(){
        this.state = true;
    }
    
    public void close(){
        this.state = false;
    }
}
