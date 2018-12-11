/**
 * @author David Souza
 * @version v. 2.0
 * @since 10/23/2018
 * fileName: MultimediaControl.java
 *
 * description: an interface called
 * MultimediaControl that will define the following methods.
 * public void play();
 * public void stop();
 * public void previous();
 * public void next();
 */

public interface MultimediaControl {

  /**
   * To play the media.
   */
  public void play();

  /**
   * To stop the media.
   */
  public void stop();

  /**
   * To play the previous media.
   */
  public void previous();

  /**
   * To play the next media.
   */
  public void next();

}