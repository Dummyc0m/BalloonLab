import java.awt.*;

/**
 * Created by Dummyc0m on 9/30/15.
 */
public class SquareBalloon extends Balloon {
    public SquareBalloon(int x, int y, int r, Color c) {
        super(x, y, r, c);
    }

    @Override
    public void draw(Graphics g, boolean makeItFilled) {
        g.setColor(getColor());
        int xCenter = getX();
        int yCenter = getY();
        int radius = getRadius();

        if(makeItFilled)
            g.fillRect(xCenter - radius,
                    yCenter - radius, 2 * radius, 2 * radius);
        else
            g.drawRect(xCenter - radius,
                    yCenter - radius, 2 * radius, 2 * radius);
    }

    @Override
    public double distance(int x, int y) {
        double dx = Math.abs(x - getX());
        double dy = Math.abs(y - getY());
        return Math.max(dx, dy);
    }
}
