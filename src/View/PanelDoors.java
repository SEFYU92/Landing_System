/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Door;
import Model.DoorState;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Nicolas_2
 */
public class PanelDoors extends JPanel {

    private BufferedImage door_closed;
    private BufferedImage door_opened;
    private BufferedImage door_moving;
    private Door doors[] = new Door[3];

    public PanelDoors(Door doors[]) {
        try {
            door_closed = ImageIO.read(new File("Ressources/door_closed.jpg"));
            door_opened = ImageIO.read(new File("Ressources/door_opened.jpg"));
            door_moving = ImageIO.read(new File("Ressources/door_moving.jpg"));
            for (int i = 0; i < doors.length; i++) {
                this.doors[i] = doors[i];
            }
        } catch (IOException ex) {
            Logger.getLogger(SystemMonitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void paintComponent(Graphics gc) {
        super.paintComponent(gc);
        for (int i = 0; i < doors.length; i++) {
            if (doors[i].getState() == DoorState.CLOSE) {
                gc.drawImage(door_closed, 0 + 120 * i, 0, null);
            } else if (doors[i].getState() == DoorState.MOVING) {
                gc.drawImage(door_moving, 0 + 120 * i, 0, null);
            } else {
                gc.drawImage(door_opened, 0 + 120 * i, 0, null);
            }
        }
    }
}
