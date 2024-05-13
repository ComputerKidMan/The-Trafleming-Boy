import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayButtonListener extends JPanel implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            GameScreen.gs = null;
            try {
                Driver.panel.setContentPane(new WorldScreen());
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
            repaint();
            revalidate();
            Driver.panel.pack();
            Driver.panel.setSize(new Dimension(1920, 1200));
            }
        }
