import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * @author David Souza
 * @version v. 2.0
 * @since 10/23/2018
 * fileName: ProcessFiles.java
 */
public class ProcessFiles {

  // Attributes
  private Path p;
  private Path p2;
  private Path p3;

  /**
   * Constructor to set
   * paths.
   */
  public ProcessFiles() {

    p = Paths.get("C:\\LineTests");
    p2 = Paths.get("C:\\LineTests\\TestResults.txt");
    p3 = Paths.get("C:\\LineTests\\");

  }

  /**
   * To create directories if they don't exists..
   */
  private void CreateDirectory() {

    // Creating LineTests directory..
    if(!p.toFile().exists()) {
      p.toFile().mkdir();
    }

    // Creating files..
    if(!p2.toFile().exists()) {
      try {
        p2.toFile().createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }

  /**
   * Writing employee data into the file.
   *
   * @param emp
   * @throws IOException
   */
  public void WriteFile(EmployeeInfo emp) throws IOException{

    CreateDirectory();

    PrintWriter writer = new PrintWriter(p2.toFile());
    writer.println(emp.toString());
    writer.close();

  }

  /**
   * Writing all products into the file.
   *
   * @param products
   * @throws IOException
   */
  public void WriteFile(ArrayList<Product> products) throws IOException {

    CreateDirectory();
    PrintWriter writer = new PrintWriter(new FileWriter(p2.toFile(), true));

    for(Product p: products) {
      writer.println(p.toString());
    }

    writer.close();

  }

}
