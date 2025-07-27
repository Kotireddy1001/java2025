class MediaPlayer {
    void play() {
        System.out.println("Playing media");
    }
}

class AudioPlayer extends MediaPlayer {
    void play() {
        System.out.println("Playing audio file");
    }
}

class VideoPlayer extends MediaPlayer {
    void play() {
        System.out.println("Playing video file");
    }
}

public class PolymorphismDemo6 {
    public static void main(String[] args) {
        MediaPlayer p;

        p = new AudioPlayer();
        p.play();

        p = new VideoPlayer();
        p.play();
    }
}
