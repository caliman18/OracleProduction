//driver to test AudioPlayer ...

public class AudioPlayerDriver {

  public static void main(String[] args) {

    AudioPlayer player = new AudioPlayer("myplayer", "myspec");

    System.out.println("Created an audio player and calling methods..");

    System.out.println(player);

    player.play();

    player.previous();

    player.next();

    player.stop();

  }

}


