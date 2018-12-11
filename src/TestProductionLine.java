import java.io.IOException;
import java.util.ArrayList;

/**
 * @author David Souza
 * @version v. 2.0
 * @since 10/23/2018
 * fileName: TestProductionLine.java
 */
public class TestProductionLine {

  /**
   * Main method to test the program.
   *
   * @param args
   */
  public static void main(String[] args) {

    // Writing to file..
    try {

      // Employee Info.
      EmployeeInfo employee = new EmployeeInfo();
      ArrayList<Product> list = new ArrayList<Product>();

      // Adding items to the list.
      list.add(new AudioPlayer("my audio player 3", "audio spec1"));
      list.add(new MoviePlayer("my movie player 3"));
      list.add(new AudioPlayer("my audio player 1", "audio spec1"));
      list.add(new MoviePlayer("my movie player 1", new Screen("1024x768", 70, 20), MonitorType.LED));
      list.add(new AudioPlayer("my audio player 2", "audio spec1"));
      list.add(new MoviePlayer("my movie player 2"));

      // Writing data into the file.
      ProcessFiles pf = new ProcessFiles();
      pf.WriteFile(employee);
      pf.WriteFile(list);


    } catch (IOException e) {
      e.printStackTrace();
    }

    // Reading Data...


  }

}
