package me.alien.dash;

import java.awt.*;

public class Spike extends Tile{

    public Spike(int x, int y, int size) {
        super(x, y, size);
    }

    @Override
    public void draw(Graphics2D g2d) {
        int[] xPoints = {
                x,
                x+size,
                x+(size/2)
        };
        int[] yPoints = {
                y+size,
                y+size,
                y
        };
        g2d.setColor(Color.BLACK);
        g2d.fillPolygon(xPoints, yPoints, 3);
    }
}
