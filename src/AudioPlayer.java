/**
 * @author David Souza
 * @version v. 2.0
 * @since 10/23/2018
 *fileName: AudioPlayer.java
 * File description:  concrete class that allows to capture the details of an audio player
 */


public class AudioPlayer extends Product implements MultimediaControl {

  // Attributes
  protected String audioSpecification;
  protected ItemType mediaType;

  /**
   * Constructor to call super class and set
   * values of AudioPlayer class.
   *
   * @param name
   * @param audioSpecification
   */

  public AudioPlayer(String name, String audioSpecification){
    super(name);
    this.audioSpecification = audioSpecification;
    mediaType = ItemType.AUDIO;
  }

  /**
   * To play the media.
   */

  public void play(){
    System.out.println("Playing");
  }

  /**
   * To stop the media.
   */

  public void stop(){
    System.out.println("Stopped");
  }

  /**
   * To play the previous media.
   */

  public void previous(){
    System.out.println("Previous");

  }

  /**
   * To play the next media.
   */

  public void next(){
    System.out.println("Next");

  }

  /**
   * toString method to get all details of super and
   * this class.
   */

  @Override
  public String toString() {
    // System.out.print(super.toString());
    return super.toString()
        +"\nAudio Spec : "
        +this.audioSpecification
        +"\nType : "
        +this.mediaType;
  }
}

