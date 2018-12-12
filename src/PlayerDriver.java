/**
 * @author David Souza
 * @version v. 2.0
 * @since 10/23/2018
 *fileName: PlayerDriver.java
 */

public class PlayerDriver {



  // Create a driver class that will demonstrate that any class that implements the
  // MultimediaControl Interface would be able to be instantiated and use its
  // methods used no matter if it was an audio or movie player.

  public static void testPlayer() {
    MultimediaControl moviePlayer = new MoviePlayer("DBPOWER MK101",
        new Screen("720x480", 40, 22),
        MonitorType.LCD);

    MultimediaControl audioPlayer = new AudioPlayer("Audio Name", "Spec");

    audioPlayer.next();
    audioPlayer.play();
    audioPlayer.previous();
    audioPlayer.stop();

    moviePlayer.next();
    moviePlayer.play();
    moviePlayer.previous();
    moviePlayer.stop();
  }

}