/**
 * @author David Souza
 * @version v. 2.0
 * @since 10/23/2018
 * fileName: MoviePlayer.java
 * description:  A class called MoviePlayer that extends Product and implements MultimediaControl.
 * 2 fields to this class called screen and monitor type and assign appropriate types to them.
 * Complete the methods from the MultimediaControl interface in a similar fashion to the audio player.
 * A toString method that calls the product toString, displays the monitor and the screen details.
 */



public class MoviePlayer extends Product implements MultimediaControl, Comparable<Item>{

  //Attributes.
  private Screen screen;

  private MonitorType montiorType;

  /**
   * Default Constructor.
   *
   * @param name
   */

  public MoviePlayer(String name)

  {

    super(name);

    screen = new Screen("1024x768", 60, 10);

    montiorType = MonitorType.LCD;



  }

  /**
   * Constructor to set values.
   *
   * @param name
   * @param screen
   * @param type
   */


  public MoviePlayer(String name, Screen screen, MonitorType type)

  {

    super(name);

    this.screen = screen;

    this.montiorType = type;

  }

  /**
   * To play the media.
   */

  @Override

  public void play() {

    System.out.println("Playing");

  }

  /**
   * To stop the media.
   */

  @Override

  public void stop() {

    System.out.println("Stopped");

  }

  /**
   * To play the previous media.
   */

  @Override

  public void previous() {

    System.out.println("Previous");

  }

  /**
   * To play the next media.
   */

  @Override

  public void next() {

    System.out.println("Next");

  }

  /**
   * toString method to get details of MoviePlayer object.
   *
   * @return data String.
   */
  public String toString()

  {

    return super.toString() +"\n" +

        screen.toString() + "\n" +

        "Monitor Type: "+montiorType;

  }



}