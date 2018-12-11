/**
 * @author David Souza
 * @version v. 2.0
 * @since 10/23/2018
 * fileName: ScreenSpec.java
 * description: An interface called ScreenSpec
 * This will define 3 methods:
 * public String getResolution();
 * public int getRefreshRate();
 * public int getResponseTime();
 */


public interface ScreenSpec {

  /**
   * @return resolution of screen.
   */

  public String getResolution();

  /**
   * @return refresh rate of monitor.
   */

  public int getRefreshRate();

  /**
   * @return response time of monitor.
   */

  public int getResponseTime();

}
