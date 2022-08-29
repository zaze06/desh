package me.alien.dash;

import java.awt.*;

public class Tile {
    int x, y, size;
    public Tile(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public void draw(Graphics2D g2d) {
        g2d.fillRect(x,y,size,size);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }

    public boolean contain(int x, int y, int size){
        boolean contain = (x + size > this.x &&
                y + size > this.y &&
                x < this.x + this.size &&
                y < this.y + this.size);
        return contain;
    }
}
