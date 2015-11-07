/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Wheel;
import Model.WheelState;
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
public class PanelWheels extends JPanel {

    private BufferedImage gear_deployed;
    private BufferedImage gear_retracted;
    private BufferedImage gear_moving;
    private Wheel wheels[] = new Wheel[3];

    public PanelWheels(Wheel wheels[]) {
        try {
            gear_deployed = ImageIO.read(new File("Ressources/gear_extracted.jpg"));
            gear_retracted = ImageIO.read(new File("Ressources/gear_retracted.jpg"));
            gear_moving = ImageIO.read(new File("Ressources/gear_moving.jpg"));
            for (int i = 0; i < wheels.length; i++) {
                this.wheels[i] = wheels[i];
            }
        } catch (IOException ex) {
            Logger.getLogger(SystemMonitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void paintComponent(Graphics gc) {
        super.paintComponent(gc);
        for (int i = 0; i < wheels.length; i++) {
            if (wheels[i].getState() == WheelState.RETRACTED) {
                gc.drawImage(gear_retracted, 0 + 120 * i, 0, null);
            } else if (wheels[i].getState() == WheelState.MOVING) {
                gc.drawImage(gear_moving, 0 + 120 * i, 0, null);
            } else {
                gc.drawImage(gear_deployed, 0 + 120 * i, 0, null);
            }
        }
    }
}
