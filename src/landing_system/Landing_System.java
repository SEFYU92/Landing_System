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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
/**
 *
 * @author Youssef
 */
public class Landing_System extends JFrame{
    private System system;
    private Door door1;
    private Door door2;
    private Door door3;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Dashboard dashboard;
    private Lever lever;
    class Lightbulb extends JComponent {
	public void paintComponent(Graphics gc) {
            if(dashboard.GreenLight)
            gc.setColor(Color.GREEN);
            else gc.setColor(Color.BLACK);
            gc.fillOval(0, 0, 100, 100);
	}
	public Dimension getPreferredSize() {
		return new Dimension(100,100);
	}	
}
    class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {    
        } 
    }
    public Landing_System()
    {
        super("landing system");
        system = new System();
        door1 = new Door();
        door2 = new Door();
        door3 = new Door();
        wheel1 = new Wheel();
        wheel2 = new Wheel();
        wheel3 = new Wheel();
        dashboard = new Dashboard();
        lever = new Lever();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();	
	add(panel);
        JToggleButton button = new JToggleButton("up/down");
        button.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ev) {
                if(ev.getStateChange()==ItemEvent.SELECTED)
                {
                    lever.pull();
                    system.wheelsOutProcess();
                    dashboard.setOrangeLight(true);
                    door1.open();
                    wheel1.deploy();
                    dashboard.setGreenLight(true);
                    repaint();
                } 
                else if(ev.getStateChange()==ItemEvent.DESELECTED)
                {
                    lever.push();
                    system.WheelsInProcess();
                    dashboard.setOrangeLight(true);
                    door1.close();
                    wheel1.retract();
                    dashboard.setGreenLight(false);
                    repaint();
                }
            }
        });
	panel.add(button);
        Lightbulb bulb1 = new Lightbulb();
        panel.add(bulb1);
        Lightbulb bulb2 = new Lightbulb();
        panel.add(bulb2);
        Lightbulb bulb3 = new Lightbulb();
        panel.add(bulb3);
        //setSize(400,400);
        //JToggleButton button = new JToggleButton();
        //button.setBounds(10,10,10,10);
        //super.add(button);
        pack();
        setVisible(true);
    }
    /*public void paint (Graphics g)
    {
        super.paint(g);
        //g.drawOval(25,30,100,100);
        g.setColor(Color.GRAY);
        g.fillOval(25,30,100,100);
        g.fillOval(25,130,100,100);
        g.fillOval(25,230,100,100);
    }*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Landing_System ls = new Landing_System();
    } 
}
