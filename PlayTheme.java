import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class PlayTheme {
    public PlayTheme(String file) {
        try{
            File ThemeFile = new File("./" + file);
            AudioInputStream Theme = AudioSystem.getAudioInputStream(ThemeFile.toURI().toURL());
            Clip clip = AudioSystem.getClip();
            clip.open(Theme);
            clip.start();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}