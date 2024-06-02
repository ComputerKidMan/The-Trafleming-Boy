public class MusicThread extends Thread {

    @Override
    public void run() {
        new PlayTheme("MainTheme.wav");
        try {
            Thread.sleep(51000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
