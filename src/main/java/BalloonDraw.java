/**
 * This drawing program helps create pictures with several
 * balloons (colored disks or other shapes)
 * Authors: Maria Litvin and Gary Litvin
 */

import javax.swing.*;
import java.awt.*;

public class BalloonDraw extends JFrame {
    public BalloonDraw()  // constructor
    {
        super("Drawing Editor");

        DrawingPanel canvas = new DrawingPanel();
        ControlPanel controls = new ControlPanel(canvas);
        Container c = getContentPane();
        c.add(canvas, BorderLayout.CENTER);
        c.add(controls, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        BalloonDraw window = new BalloonDraw();
        window.setBounds(100, 100, 400, 400);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
