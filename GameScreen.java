import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.io.IOException;

public class GameScreen extends JPanel {
    public GameScreen() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        setBackground(new Color(14,4,49));
        setLayout(new GridLayout(2,3));
        JLabel title = new JLabel("The Main Character Boy");
        title.setFont(new Font("Serif", Font.BOLD, 20));
        title.setBackground(new Color(5,5,255));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        add(new JLabel(""));
        add(title);
        add(new JLabel(""));
        JButton PlayButton = new JButton("Play");
        PlayButton.addActionListener(new PlayButtonListener());
        add(new JLabel(""));
        add(PlayButton);
        add(new JLabel(""));
        //new PlayTheme("");
    }



    private class PlayButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Driver.panel.setContentPane(new WorldScreen());
        }
    }

}

