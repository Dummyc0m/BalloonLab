import java.awt.*;

/**
 * Created by Dummyc0m on 9/30/15.
 */
public class OvalBalloon extends Balloon {
    public OvalBalloon(int x, int y, int r, Color c) {
        super(x, y, r, c);
    }

    @Override
    public void draw(Graphics g, boolean makeItFilled) {
        g.setColor(getColor());
        int xCenter = getX();
        int yCenter = getY();
        int radius = getRadius();

        if (makeItFilled)
            g.fillOval(xCenter - radius / 2,
                    yCenter - radius, radius, 2 * radius);
        else
            g.drawOval(xCenter - radius / 2,
                    yCenter - radius, radius, 2 * radius);
    }

    @Override
    public double distance(int x, int y) {
        double dx = x - getX();
        double dy = y - getY();
        return Math.sqrt(4 * dx * dx + dy * dy);
    }
}
