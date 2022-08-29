
package me.alien.dash;

import java.awt.*;

public class Player extends Tile{
    public Player(int x, int y, int size) {
        super(x,y,size);
    }

    public void moveDown(int distance) {
        boolean blocked = false;
        for(Tile tile : Main.main.map){
            if(tile.contain(x, y+=distance, size)){
                System.out.println("cant move down");
                blocked = true;
                return;
            }
        }
        if(!blocked) {
            System.out.println("moving down");
            y += distance;
        }

    }
}
