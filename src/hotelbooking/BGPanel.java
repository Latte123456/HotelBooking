package hotelbooking;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aimee
 */
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

public class BGPanel extends JPanel {

    public Image image;

    //adding images to the JFrame
    public BGPanel() {
        this.image = new ImageIcon("./resources/hotel.jpg").getImage();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(this.image, 0, 0, null);
    }
}