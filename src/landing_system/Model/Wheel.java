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
public class Wheel {
    
    private String state;
    
    public void deploy(){
        this.state = "deployed";
    }
    
    public void retract(){
        this.state = "retracted";
    }
}
