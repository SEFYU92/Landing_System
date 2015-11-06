/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package landing_system.Model;

/**
 *
 * @author Nicolas_2
 */
public class Door {
    private String state;
    
    public void open(){
        this.state = "opened";
    }
    
    public void close(){
        this.state = "closed";
    }
}
