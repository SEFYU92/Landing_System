/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Lever;
import Model.LeverState;
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
public class PanelLever extends JPanel {

    private BufferedImage lever_down;
    private BufferedImage lever_up;
    private Lever lever;

    public PanelLever(Lever lever) {
        try {
            lever_down = ImageIO.read(new File("Ressources/lever_down.jpg"));
            lever_up = ImageIO.read(new File("Ressources/lever_up.jpg"));
            this.lever = lever;
        } catch (IOException ex) {
            Logger.getLogger(SystemMonitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void paintComponent(Graphics gc) {
        super.paintComponent(gc);
        if (lever.getState() == LeverState.UP) {
            gc.drawImage(lever_up, 0, 0, null);
        } else {
            gc.drawImage(lever_down, 0, 0, null);
        }
    }
}
