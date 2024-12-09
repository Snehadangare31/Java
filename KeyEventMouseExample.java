import javax.swing.*;
import java.awt.event.*;

public class KeyEventMouseExample {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Key and Mouse Event Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel
        JPanel panel = new JPanel();

        // Create labels for key and mouse events
        JLabel keyLabel = new JLabel("Key Pressed: ");
        JLabel mouseLabel = new JLabel("Mouse Event: ");

        // Add labels to the panel
        panel.add(keyLabel);
        panel.add(mouseLabel);

        // Add panel to the frame
        frame.add(panel);

        // Add key listener to the frame
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                keyLabel.setText("Key Pressed: " + e.getKeyChar());
            }
        });

        // Add mouse listener to the frame
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mouseLabel.setText("Mouse Event: Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        // Set frame properties
        frame.setFocusable(true);
        frame.requestFocusInWindow();
        frame.setVisible(true);
    }
}