/**
 * @author David Souza
 * @version v. 2.0
 * @since 10/23/2018
 * fileName: ScreenDriver.java
 * description:
 */



//driver to test Screen class ... step 10

public class ScreenDriver {

  public static void main(String[] args) {

    Screen scr = new Screen("1024x768", 60, 10);

    System.out.println(scr);

  }

}