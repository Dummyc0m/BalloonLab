import java.awt.*;

/**
 * Created by Dummyc0m on 9/29/15.
 */
public class RoundBalloon extends Balloon {
    public RoundBalloon(int x, int y, int r, Color c) {
        super(x, y, r, c);
    }

    public void draw(Graphics g, boolean makeItFilled) {
        g.setColor(getColor());
        int xCenter = getX();
        int yCenter = getY();
        int radius = getRadius();
        if (makeItFilled)
            g.fillOval(xCenter - radius,
                    yCenter - radius, 2 * radius, 2 * radius);
        else
            g.drawOval(xCenter - radius,
                    yCenter - radius, 2 * radius, 2 * radius);
    }
}
