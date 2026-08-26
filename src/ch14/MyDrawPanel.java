package ch14;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent (Graphics g){
        g.setColor(Color.BLUE);

        g.fillRect(20, 50, 100, 100);
    }
}
