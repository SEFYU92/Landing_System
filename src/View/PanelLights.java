/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Light;
import Model.LightState;
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
public class PanelLights extends JPanel {

    private BufferedImage feu_orange;
    private BufferedImage feu_rouge;
    private BufferedImage feu_vert;
    private BufferedImage feu_vide;
    private Light light;

    public PanelLights(Light light) {
        try {
            feu_orange = ImageIO.read(new File("Ressources/feu_orange.jpg"));
            feu_rouge = ImageIO.read(new File("Ressources/feu_rouge.jpg"));
            feu_vert = ImageIO.read(new File("Ressources/feu_vert.jpg"));
            feu_vide = ImageIO.read(new File("Ressources/feu_vide.jpg"));

            this.light = light;
        } catch (IOException ex) {
            Logger.getLogger(SystemMonitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void paintComponent(Graphics gc) {
        super.paintComponent(gc);
        if (light.getState() == LightState.GREEN) {
            gc.drawImage(feu_vert, 0, 0, null);
            System.out.println("vert");
        } else if (light.getState() == LightState.ORANGE) {
            System.out.println("orange");
            gc.drawImage(feu_orange, 0, 0, null);
        } else if (light.getState() == LightState.RED) {
            gc.drawImage(feu_rouge, 0, 0, null);
        } else {
            gc.drawImage(feu_vide, 0, 0, null);
        }
    }
}
