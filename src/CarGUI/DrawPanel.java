package CarGUI;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import Car.Volvo240;
import Car.Saab95;
import Car.Scania;
import Car.Car;

// This panel represent the animated part of the view with the car images.

public class DrawPanel extends JPanel{

    BufferedImage volvoImage;
    BufferedImage saabImage;
    BufferedImage scaniaImage;

    // To keep track of a single cars position
    Point volvoPoint = new Point();
    Point saabPoint = new Point();
    Point scaniaPoint = new Point();


    void moveit(int x, int y, Car car){
        if(car instanceof Volvo240){
            volvoPoint.x = x;
            volvoPoint.y = y;
        } else if(car instanceof Saab95){
            saabPoint.x = x;
            saabPoint.y = y;
        } else if(car instanceof Scania){
            scaniaPoint.x = x;
            scaniaPoint.y = y;
        }
    }


    // Initializes the panel and reads the images
    public DrawPanel(int x, int y) {
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.green);
        // Print an error message in case file is not found with a try/catch block
        try {
            // You can remove the "pics" part if running outside of IntelliJ and
            // everything is in the same main folder.
            // volvoImage = ImageIO.read(new File("Volvo240.jpg"));

            // Remember to rightclick src New -> Package -> name: pics -> MOVE *.jpg to pics.
            // if you are starting in IntelliJ.
            volvoImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Volvo240.jpg"));
            saabImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Saab95.jpg"));
            scaniaImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Scania.jpg"));

        } catch (IOException ex)
        {
            ex.printStackTrace();
        }

    }

    // This method is called each time the panel updates/refreshes/repaints itself
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(volvoImage, volvoPoint.x, volvoPoint.y, null); // see javadoc for more info on the parameters
        g.drawImage(saabImage, saabPoint.x, saabPoint.y, null);
        g.drawImage(scaniaImage, scaniaPoint.x, scaniaPoint.y, null);
    }
}
