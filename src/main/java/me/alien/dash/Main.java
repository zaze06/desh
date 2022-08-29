package me.alien.dash;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class Main extends JPanel {
    public static Main main;
    JFrame frame;
    Player player;

    Timer displayTimer = new Timer(100, (actionListener) -> {
        repaint();
    });

    Timer gravity = new Timer(100, (actionListener) -> {
        player.moveDown(1);
    });

    public static void main(String[] args) {
        new Main();
    }
    ArrayList<Tile> map = new ArrayList<>();

    public Main(){
        frame = new JFrame("dash");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setVisible(true);

        player = new Player(getWidth()/2-10, getHeight()/2-10, 20);
        map.add(new Spike(getWidth()/2+20, getHeight()/2-10, 20));
        map.add(new Cube(getWidth()/2-10, getHeight()/2+30, 20));

        displayTimer.start();
        gravity.start();

        main = this;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GREEN);
        player.draw(g2d);
        for(Tile t: map){
            t.draw(g2d);
        }
    }
}
