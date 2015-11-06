/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Youssef
 */
public class System {
    private boolean WheelState;
    private boolean DoorState;
    public System()
    {
        WheelState = false;
        DoorState = false;
    }
    public void wheelsOutProcess()
    {
        WheelState = true;
        DoorState = true;
    }
    public void WheelsInProcess()
    {
        WheelState = false;
        DoorState = false;
    }
}
