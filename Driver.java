import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Driver {
    public static JFrame panel = new JFrame("The Trafleming Boy");

    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        panel.setSize(1920, 1200);
        panel.setContentPane(new GameScreen());
        panel.setVisible(true);
    }
}