/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package landing_system;
import java.awt.*;
import javax.swing.*;
import Controller.System;
import View.*;
import Model.*;
/**
 *
 * @author Youssef
 */
public class Landing_System extends JFrame{
    private
    public Landing_System()
    {
        super("landing system");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }
    public void paint (Graphics g)
    {
        super.paint(g);
        //g.drawOval(25,30,100,100);
        g.setColor(Color.GRAY);
        g.fillOval(25,30,100,100);
        g.fillOval(25,130,100,100);
        g.fillOval(25,230,100,100);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Landing_System ls = new Landing_System();
    }
    
}
