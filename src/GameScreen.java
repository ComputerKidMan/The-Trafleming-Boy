import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.io.IOException;

public class GameScreen extends JPanel {
    public static JPanel gs;

    public GameScreen() {
        gs = new JPanel();
        gs.setBackground(new Color(14, 4, 49));
        gs.setLayout(new GridLayout(2, 3));
        JLabel title = new JLabel("The Main Character Boy");
        title.setFont(new Font("Serif", Font.BOLD, 20));
        title.setBackground(new Color(5, 5, 255));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        gs.add(new JLabel(""));
        gs.add(title);
        gs.add(new JLabel(""));
        JButton PlayButton = new JButton("Play");
        PlayButton.addActionListener(new PlayButtonListener());
        gs.add(new JLabel(""));
        gs.add(PlayButton);
        gs.add(new JLabel(""));
        //new PlayTheme("");
    }
}