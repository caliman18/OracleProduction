import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author David Souza
 * @version v. 2.0
 * @since 10/23/2018
 * fileName: ViewFileInfo.java
 */
public class ViewFileInfo {

  /**
   * Reading data from file and printing it into the console.
   *
   * @param args
   */
  public static void main(String[] args) {

    Path p = Paths.get("C:\\LineTests\\TestResults.txt");
    BufferedReader reader;

    try {

      // Starting file.
      reader = new BufferedReader(new FileReader(p.toFile()));

      try {
        String text;
        // run until file ends..
        while((text = reader.readLine()) != null) {

          // Printing..
          System.out.println(text);

        }

      }catch(Exception e) {}

      reader.close();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
