package ch15;

import javax.swing.*;
import java.awt.*;

public class Button1 {
    public static void main(String[] args) {
        Button1 gui = new Button1();
        gui.go();
    }

//    public void go(){
//        JFrame frame = new JFrame();
//        JButton button = new JButton("Click This!");
//        Font bigFont = new Font("Serif", Font.BOLD, 28);
//        button.setFont(bigFont);
//        frame.getContentPane().add(BorderLayout.NORTH, button);
//        frame.setSize(200, 200);
//        frame.setVisible(true);
//    }

    public void go(){
        JFrame frame = new JFrame();

        JButton east = new JButton("East");
        JButton west = new JButton("west");
        JButton north = new JButton("north");
        JButton south = new JButton("south");
        JButton center = new JButton("center");

        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.CENTER, center);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
