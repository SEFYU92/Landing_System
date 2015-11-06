/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Youssef
 */
public class Lever {
    private boolean state;
    public Lever()
    {
        state = false;
    }
    public void pull()
    {
        state = true;
    }
    public void push()
    {
        state = false;
    }
}
