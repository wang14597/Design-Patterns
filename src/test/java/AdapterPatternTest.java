import AdapterPattern.AudioPlayer;
import org.junit.jupiter.api.Test;

public class AdapterPatternTest {

    @Test
    void should_can_play_mp3(){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "mp3");
    }

    @Test
    void should_can_play_mp4(){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp4", "mp4");
    }

    @Test
    void should_can_play_vlc(){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("vlc", "vlc");
    }

    @Test
    void should_can_play_avi(){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("avi", "avi");
    }
}
