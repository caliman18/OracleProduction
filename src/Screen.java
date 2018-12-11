/**
 * @author David Souza
 * @version v. 2.0
 * @since 10/23/2018
 * fileName: Screen.java
 * description:  a class called Screen that implements ScreenSpec.
 * Add three fields:
 * String resolution
 * int refreshrate
 * int responsetime
 * Complete the methods from the ScreenSpec interface.
 * Add a toString method that will return the details of the 3 field
 */

public class Screen implements ScreenSpec {

  //Attributes
  protected String resolution;

  protected int refreshrate;

  protected int responsetime;


  /**
   * Constructor to set values.
   *
   * @param resolution
   * @param refreshrate
   * @param responsetime
   */
  public Screen(String resolution, int refreshrate, int responsetime)

  {

    this.resolution = resolution;

    this.refreshrate = refreshrate;

    this.responsetime = responsetime;

  }

  /**
   * @return resolution of screen.
   */
  @Override

  public String getResolution() {

    return resolution;

  }

  /**
   * @return refresh rate of monitor.
   */

  @Override

  public int getRefreshRate() {

    return refreshrate;

  }


  /**
   * @return response time of monitor.
   */
  @Override

  public int getResponseTime() {

    return responsetime;

  }

  /**
   * toString method to get data of Screen object in string.
   *
   * @return data of Screen object
   */
  public String toString()

  {

    return "Screen : Resolution : " + resolution + "\n" +

        "Refresh Rate : " + refreshrate + "\n" +

        "Response Time : " + responsetime ;

  }

}